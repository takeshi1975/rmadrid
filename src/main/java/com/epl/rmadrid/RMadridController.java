package com.epl.rmadrid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RMadridController {
	
	@Autowired
	private RMadrid rmadrid;

	@RequestMapping("/rmadrid/ad/{ad}/ni/{ni}")
	public void askForTickets(@PathVariable int ad, @PathVariable int ni){
		rmadrid.askSomeTickets(ad, ni);
	}	
	
}
