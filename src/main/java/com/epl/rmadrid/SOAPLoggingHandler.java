package com.epl.rmadrid;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Set;

import javax.xml.namespace.QName;
import javax.xml.soap.SOAPMessage;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;

import org.apache.log4j.Logger;

public class SOAPLoggingHandler implements SOAPHandler<SOAPMessageContext> {

    private final static Logger log = Logger.getLogger(SOAPLoggingHandler.class);
    private ByteArrayOutputStream out = new ByteArrayOutputStream();        
    private PrintStream printStream = new PrintStream(out);
    
    public Set<QName> getHeaders() {
        return null;
    }

    public boolean handleMessage(SOAPMessageContext smc) {
        logToSystemOut(smc);
        return true;
    }

    public boolean handleFault(SOAPMessageContext smc) {
        logToSystemOut(smc);
        return true;
    }

    // nothing to clean up
    public void close(MessageContext messageContext) {
    }

    /*
     * Check the MESSAGE_OUTBOUND_PROPERTY in the context
     * to see if this is an outgoing or incoming message.
     * Write a brief message to the print stream and
     * output the message. The writeTo() method can throw
     * SOAPException or IOException
     */
    private void logToSystemOut(SOAPMessageContext smc) {
        Boolean outboundProperty = (Boolean)
            smc.get (MessageContext.MESSAGE_OUTBOUND_PROPERTY);

        if (outboundProperty.booleanValue()) {
            log.info("Outbound message:");
        } else {
            log.info("Inbound message:");
        }

        SOAPMessage message = smc.getMessage();
        try {
        	out.reset();        	
            message.writeTo(printStream);
            printStream.println("--------------------------------------------------------------");
            log.info(out.toByteArray()); // Sacamos el mensaje por el log
        } catch (Exception e) {
            log.error("Exception in handler: " + e);
        }
    }
}