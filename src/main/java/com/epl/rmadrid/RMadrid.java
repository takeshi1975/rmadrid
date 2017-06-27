package com.epl.rmadrid;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Date;

import javax.xml.namespace.QName;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.epl.rmadrid.dto.CodigoBarras;
import com.epl.rmadrid.dto.RMadridRs;
import com.epl.rmadrid.repo.MainRepo;
import com.epl.rmadrid.xto.AuthHeader;
import com.epl.rmadrid.xto.SWGesauroRM;
import com.epl.rmadrid.xto.SWGesauroRMSoap;
import com.epl.rmadrid.xto.TCodigosBarras;


@Service
public class RMadrid {

	private static final QName SERVICE_NAME = new QName("http://tempuri.org/", "SW_GesauroRM");

	@Autowired
	private MainRepo mainRepo;
	
	@Value("${rmadrid.config.idEntidad}")
	private long idEntidad;

	@Value("${rmadrid.config.idConcepto}")
	private long idConcepto;

	@Value("${rmadrid.config.tipoCliente.AD}")
	private int tipoClienteAD;

	@Value("${rmadrid.config.tipoCliente.NI}")
	private int tipoClienteNI;

	@Value("${rmadrid.config.remoteAddress}")
	private String wsdlURL;

	private static final Logger log = Logger.getLogger(RMadrid.class);
	
	private RMadridRs obtenerCodigos(String locata, int caracCliente, int numero) throws MalformedURLException{
		SWGesauroRM swgesaurorm = new SWGesauroRM(new URL(wsdlURL), SERVICE_NAME);
		RMadridRs tmp = new RMadridRs();
		swgesaurorm.setHandlerResolver(new GesauroRMHandleResolver());
		log.info("Se va a obtener Binding Provider");									
		SWGesauroRMSoap service = swgesaurorm.getSWGesauroRMSoap();
		log.info("Voy a llamar a la emision de cordigo de barras");
		TCodigosBarras codbars = null;
		if (numero>0){
			codbars = service.rmEmisionCodigosBarras(idEntidad, idConcepto, tipoClienteAD, caracCliente, new AuthHeader());
			if (codbars!=null){				
				long numOperacion = codbars.getNumOperacion();				
				String caracteristica =  (caracCliente==this.tipoClienteAD)?"AD":"NI";
				tmp.setLocata(locata);
				if (caracteristica.equals("AD"))
					tmp.setAdultos(numero);
				else 
					tmp.setNiños(numero);
				tmp.setFecha(new Date());
				for (String codbar:codbars.getArrayEntradas().getString()){
					CodigoBarras codigoBarras = new CodigoBarras(numOperacion,locata, codbar, caracteristica);
					tmp.add(codigoBarras);
				}
				return tmp;				
			} 			
		}
		return null;		
	}
	
	/**
	 * Conexion al ws del real madrid para pedir los c�digos de barras....
	 * 
	 * @return Objeto con el codigo de barras en ArrayCodigos.
	 */
	public RMadridRs askSomeTickets(String locata, int qtyAd, int qtyNi) {				
		try{																		
			RMadridRs respuesta = obtenerCodigos(locata,this.tipoClienteAD,qtyAd);
			if (respuesta!=null)
				return respuesta.add(obtenerCodigos(locata, this.tipoClienteNI,qtyNi));
			else 
				throw new RuntimeException("No se pudo encontrar datos para los adultos");
		}catch(Exception ex){			
			log.error("Error al calcular los tickets", ex);
			return null;
		}		
	}
	
	public boolean removeTicket(String locata){
		try{
			RMadridRs rmadridRs= mainRepo.findOne(locata);
			SWGesauroRM swgesaurorm = new SWGesauroRM(new URL(wsdlURL), SERVICE_NAME);
			swgesaurorm.setHandlerResolver(new GesauroRMHandleResolver());
			log.info("Se va a obtener Binding Provider");									
			SWGesauroRMSoap service = swgesaurorm.getSWGesauroRMSoap();
			log.info("Voy a llamar a la emision de cordigo de barras");
			boolean result = true;
			for (CodigoBarras codigoBarras:rmadridRs.getCodigoBarras())
				 result = result && service.rmCancelacionCodigosBarras(idEntidad, codigoBarras.getNumOperacion(), new AuthHeader());			
			return result;
		}catch(Exception ex){
			log.error("Error en el proceso", ex);
			return false;
		}
	}

}
