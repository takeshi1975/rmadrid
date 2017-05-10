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
		for (int i=0; i<=results.size(); i++)
			log.info("Codigo de barras "+results.get(i));
		if (results.size()>0)
			return results.toArray(new String[results.size()]);
		else return new String []{"No hay datos para mostrar"};
	}	
	
}
