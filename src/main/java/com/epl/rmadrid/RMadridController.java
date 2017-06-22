package com.epl.rmadrid;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.epl.service.PdfService;
import com.epl.service.TicketService;


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
	
	@RequestMapping(value="/rmadrid/print",method=RequestMethod.GET)
	public HttpEntity<byte[]> createPdf(@RequestParam List<String> ticketList){
		PdfService pDFService = new PdfService();		
		TicketService ticketService = new TicketService();
		
		
		HttpHeaders header = new HttpHeaders();		
	    header.setContentType(MediaType.APPLICATION_PDF);
	    header.set(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=tickets.pdf");
	    byte[] documentBody = pDFService.generaPdf(ticketService.getTicketsByCodigos(ticketList));
	    header.setContentLength(documentBody.length);
		return new HttpEntity<byte[]>( documentBody, header);		
	}
}
