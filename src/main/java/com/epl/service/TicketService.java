package com.epl.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.epl.model.Ticket;

@Service
public class TicketService {
	public List<Ticket> getTicketsByCodigos(final List<String> ticketList) {
		List<Ticket> list = new ArrayList<Ticket>();

		for (String ticket : ticketList) {
			list.add(new Ticket(ticket, "Adulto"));
		}

		return list;
	}
}
