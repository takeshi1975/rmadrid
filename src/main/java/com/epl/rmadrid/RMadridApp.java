package com.epl.rmadrid;

import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
@SpringBootApplication
public class RMadridApp extends SpringBootServletInitializer {
	private static final Logger logger = Logger.getLogger(RMadridApp.class);
	
	public static void main(String[] args) {
		logger.info("Se inicia la aplicacion");	
		SpringApplication.run(RMadridApp.class, args);
	}
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		logger.info("Se configura la aplicación");
		return application.sources(RMadridApp.class);
	}	

}