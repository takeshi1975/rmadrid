package com.epl.rmadrid;

import java.net.URL;
import java.util.List;

import javax.xml.namespace.QName;

import org.apache.log4j.Logger;
import org.rm.AuthHeader;
import org.rm.SWGesauroRM;
import org.rm.SWGesauroRMSoap;
import org.rm.TCodigosBarras;
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
		/*
		log.info("Se van a pedir tickets "+wsdlURL);
		try {
			log.info("Se va a conectar con el servidor externo ");
			ClientProxyFactoryBean factory = new JaxWsProxyFactoryBean();
			factory.setServiceClass(SWGesauroRMSoap.class);			
			factory.setAddress(wsdlURL); // Fijamos los interceptores...
			factory.getInInterceptors().add(new LoggingInInterceptor());
			factory.getOutInterceptors().add(new LoggingOutInterceptor());
			
			SWGesauroRMSoap serviceClient = (SWGesauroRMSoap) factory.create();
			Client proxy = ClientProxy.getClient(serviceClient);
			List<Header> headersList = new ArrayList<Header>();			
			Header testSoapHeader1 = new Header(new QName("", "AuthHeader"), new AuthHeader("", ""),
					new JAXBDataBinding(AuthHeader.class));
			headersList.add(testSoapHeader1); // Añadimos el objeto AuthHeader a SoapEnvelop
			proxy.getRequestContext().put(Header.HEADER_LIST, headersList);
			TCodigosBarras codbars = serviceClient.rmEmisionCodigosBarras(this.idEntidad, this.idConcepto,
					this.tipoClienteAD, qtyAd);
			if (codbars!=null && codbars.getArrayCodigos()!=null)
				for (String s:codbars.getArrayCodigos().getString())
					log.info(s);
			return codbars.getArrayCodigos().getString();
		} catch (Exception ex) {
			log.error("Error en el proceso", ex);
		}
		return null;
		*/
		try{
			SWGesauroRM swgesaurorm = new SWGesauroRM(new URL(wsdlURL));
			SWGesauroRMSoap service = swgesaurorm.getPort(SWGesauroRMSoap.class);
			TCodigosBarras codbars = service.rmEmisionCodigosBarras(idEntidad, idConcepto, tipoClienteAD, 2, new AuthHeader());
			if (codbars!=null && codbars.getArrayCodigos()!=null){
				for (String s:codbars.getArrayCodigos().getString())
					log.info(s);
			}
			return codbars.getArrayCodigos().getString();
		}catch(Exception ex){
			log.error("Error en el proceso", ex);
			return null;
		}		
	}

}
