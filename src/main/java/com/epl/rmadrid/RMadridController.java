package com.epl.rmadrid;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class RMadridController {
	
	@Autowired
	private RMadrid rmadrid;
	
	private final static Logger log = Logger.getLogger(RMadridController.class);

	@RequestMapping("/rmadrid/ad/{ad}/ni/{ni}")
	public String[] askForTickets(@PathVariable int ad, @PathVariable int ni){
		List<String> results = rmadrid.askSomeTickets(ad, ni);
		if (results!=null){
			for (int i=0; i<results.size(); i++)
				log.info("Codigo de barras "+results.get(i));
			return (results.size()>0)?results.toArray(new String[results.size()]):new String []{"No hay datos para mostrar"};
		} else 
			return new String [] {"Error interno del servidor"};
	}
	
	@RequestMapping("/rmadrid/remove/{numOp}")
	public String removeTickets(@PathVariable long numOp){
		boolean result = rmadrid.removeTicket(numOp);
		return  (result)?"Se ha eliminado el codigo"+numOp:"Error interno del servidor. No se ha eliminado el código "+numOp+". Consulte los logs";
	}
		
}
