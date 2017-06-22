package com.epl.service;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.epl.model.Ticket;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;

@Service
public class PdfService {
	private static final Logger log = Logger.getLogger(PdfService.class);
	public byte[] generaPdf(final List<Ticket> ticketList){
		
		byte pdfBytes[] = {};
		InputStream inputStream = null;
		JasperPrint jasperPrint = null;
		JasperDesign jasperDesign = null;
		JasperReport jasperReport = null;
		JRBeanCollectionDataSource beanColDataSource = null;
		try {			
			inputStream = this.getClass().getResourceAsStream("/template/RMadrid_A4.jrxml");
			log.debug("Obteniendo plantilla ok");
		} catch (Exception e) {
			log.error("Error obteniendo plantilla para pdf", e);
		}
		if ( ticketList!=null && ticketList.size() > 0){
			beanColDataSource = new JRBeanCollectionDataSource(ticketList);
		}else{
			log.error("ticketList no tiene datos");
		}				
		try {
			jasperDesign = JRXmlLoader.load(inputStream);
			log.info("Cargando plantilla ok");
		} catch (JRException e) {
			log.error("Error cargando plantilla",e);
		}
		try {
			jasperReport = JasperCompileManager.compileReport(jasperDesign);
			log.info("Compilando plantilla ok");
		} catch (JRException e) {
			log.error("Error compilando plantilla",e);
		}
		try {
			jasperPrint = JasperFillManager.fillReport(jasperReport, new HashMap<String,Object>(), beanColDataSource);
			log.info("Generando ticket ok");
		} catch (JRException e) {
			log.error("Error generando tickets",e);
		}
		try {
			pdfBytes = JasperExportManager.exportReportToPdf(jasperPrint);
			log.info("Generando pdf file ok");
		} catch (JRException e) {
			log.error("Error generando pdf",e);
		} 		
		return pdfBytes;
	} 
}
