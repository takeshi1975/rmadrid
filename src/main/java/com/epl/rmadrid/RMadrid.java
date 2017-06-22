package com.epl.rmadrid;

import java.net.URL;
import java.util.List;

import javax.xml.namespace.QName;

import org.apache.log4j.Logger;
import org.rm.xto.AuthHeader;
import org.rm.xto.SWGesauroRM;
import org.rm.xto.SWGesauroRMSoap;
import org.rm.xto.TCodigosBarras;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;


@Service
public class RMadrid {

	private static final QName SERVICE_NAME = new QName("http://tempuri.org/", "SW_GesauroRM");

	@Value("${rmadrid.config.idEntidad}")
	private long idEntidad;

	@Value("${rmadrid.config.idConcepto}")
	private long idConcepto;

	@Value("${rmadrid.config.tipoCliente.AD}")
	private long tipoClienteAD;

	@Value("${rmadrid.config.tipoCliente.NI}")
	private long tipoClienteNI;

	@Value("${rmadrid.config.remoteAddress}")
	private String wsdlURL;

	private static final Logger log = Logger.getLogger(RMadrid.class);

	/**
	 * Conexion al ws del real madrid para pedir los c�digos de barras....
	 * 
	 * @return Objeto con el codigo de barras en ArrayCodigos.
	 */
	public List<String> askSomeTickets(int qtyAd, int qtyNi) {		
		try{
			SWGesauroRM swgesaurorm = new SWGesauroRM(new URL(wsdlURL), SERVICE_NAME);
			swgesaurorm.setHandlerResolver(new GesauroRMHandleResolver());
			log.info("Se va a obtener Binding Provider");									
			SWGesauroRMSoap service = swgesaurorm.getSWGesauroRMSoap();
			log.info("Voy a llamar a la emision de cordigo de barras");
			TCodigosBarras codbars = service.rmEmisionCodigosBarras(idEntidad, idConcepto, tipoClienteAD, 2, new AuthHeader());
			String result =(codbars==null)?"El resultado es null":"El resultado no es null";
			log.info(result);
			log.info("Se ha llamado a la emisión de codigo de barras");
			if (codbars!=null && codbars.getArrayCodigos()!=null){
				for (String s:codbars.getArrayCodigos().getString())
					log.info(s);
			}
			if (codbars!=null)
				return codbars.getArrayCodigos().getString();
			return null;
		}catch(Exception ex){
			log.error("Error en el proceso", ex);
			return null;
		}		
	}
	
	public boolean removeTicket(long numOperacion){
		try{
			SWGesauroRM swgesaurorm = new SWGesauroRM(new URL(wsdlURL), SERVICE_NAME);
			swgesaurorm.setHandlerResolver(new GesauroRMHandleResolver());
			log.info("Se va a obtener Binding Provider");									
			SWGesauroRMSoap service = swgesaurorm.getSWGesauroRMSoap();
			log.info("Voy a llamar a la emision de cordigo de barras");			
			boolean result = service.rmCancelacionCodigosBarras(idEntidad, numOperacion, new AuthHeader());			
			log.info("Se ha llamado a la cancelación de codigo de barras");			
			return result;
		}catch(Exception ex){
			log.error("Error en el proceso", ex);
			return false;
		}
	}

}
