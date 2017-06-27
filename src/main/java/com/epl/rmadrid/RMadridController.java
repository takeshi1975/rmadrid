package com.epl.rmadrid;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.epl.rmadrid.dto.RMadridRs;


@RestController
public class RMadridController {
	
	@Autowired
	private RMadrid rmadrid;
	
	private final static Logger log = Logger.getLogger(RMadridController.class);

	@RequestMapping("/rmadrid/ad/{ad}/ni/{ni}/locata/{locata}")
	public String[] askForTickets(@PathVariable String locata, @PathVariable int ad, @PathVariable int ni){
		RMadridRs resultado = rmadrid.askSomeTickets(locata,ad, ni);
		List<String> buffer = new ArrayList<String>();
		resultado.getCodigoBarras().forEach(t->buffer.add(t.getCodigoBarras()));
		return buffer.toArray(new String[resultado.getCodigoBarras().size()]);						
	}
	
	@RequestMapping("/rmadrid/remove/{locata}")
	public String removeTickets(@PathVariable String locata){
		boolean result = rmadrid.removeTicket(locata);
		return  (result)?"Se ha eliminado el codigo"+locata:"Error interno del servidor. No se ha eliminado el código "+locata+". Consulte los logs";
	}
		
}
