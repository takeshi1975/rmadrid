package com.epl.rmadrid;
import java.util.ArrayList;
import java.util.List;

import javax.xml.ws.handler.Handler;
import javax.xml.ws.handler.HandlerResolver;
import javax.xml.ws.handler.PortInfo;


public class GesauroRMHandleResolver implements HandlerResolver{

	@Override
	@SuppressWarnings("rawtypes")
	public List<Handler> getHandlerChain(PortInfo portInfo) {		
		List<Handler> handlers = new ArrayList<Handler>();
		handlers.add(new SOAPLoggingHandler());
		return handlers;
	}
	
}
