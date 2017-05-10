package com.epl.rmadrid;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.rm.SWGesauroRM;
import org.rm.SWGesauroRMSoap;
import org.rm.TCodigosBarras;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class RMadrid {

	@Value("${rmadrid.config.idEntidad}")
	private long idEntidad;

	@Value("${rmadrid.config.idConcepto}")
	private long idConcepto;

	@Value("${rmadrid.config.tipoCliente.NI}")
	private long tipoClienteAD;

	@Value("${rmadrid.config.tipoCliente.AD}")
	private long tipoClienteNI;

	@Value("${rmadrid.config.remoteAddress}")
	private String remoteAddress;

	private static final Logger log = Logger.getLogger(RMadrid.class);

	/**
	 * Conexi�n al ws del real madrid para pedir los c�digos de barras....
	 * 
	 * @return Objecto con el c�digo de barras en ArrayCodigos.
	 */
	public List<String> askSomeTickets(int qtyAd, int qtyNi) {
		log.info("Se van a pedir tickets");
		try {
			URL url = new URL(remoteAddress);
			log.info("Se va a conectar con el servidor externo");
			SWGesauroRM swGesauroRM = new SWGesauroRM(url);
			SWGesauroRMSoap service = swGesauroRM.getPort(SWGesauroRMSoap.class);
			log.info("Se ha conectado con el servidor externo");
			TCodigosBarras codigosBarras = null;
			List<String> tickets = new ArrayList<String>();
			log.info("idEntidad: " +idEntidad);
			log.info("idConcepto: "+idConcepto);
			log.info("tipoClienteAD: "+tipoClienteAD);
			if (qtyAd > 0) {
				codigosBarras = service.rmEmisionCodigosBarras(idEntidad, idConcepto, tipoClienteAD, qtyAd);
			}
			if (codigosBarras.getArrayCodigos()!=null)
				tickets.addAll(codigosBarras.getArrayCodigos().getString());
			codigosBarras.getArrayCodigos().getString().clear(); // Limpiamos los codigos anteriores
			if (qtyNi > 0) {
				codigosBarras = service.rmEmisionCodigosBarras(idEntidad, idConcepto, tipoClienteNI, qtyNi);
			}
			if (codigosBarras.getArrayCodigos()!=null)
				tickets.addAll(codigosBarras.getArrayCodigos().getString());
			log.info("Se han emitido "+tickets.size()+" tickets." );
			return codigosBarras.getArrayCodigos().getString();
		} catch (MalformedURLException malUrl) {
			log.error("No se ha podido procesar la url" + remoteAddress, malUrl);
		} catch (Exception ex) {
			log.error("Error en el proceso", ex);
		}
		return null;
	}

}
