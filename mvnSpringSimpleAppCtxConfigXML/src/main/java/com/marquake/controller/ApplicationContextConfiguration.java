package com.marquake.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.mvc.Controller;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
public class ApplicationContextConfiguration {

	public ApplicationContextConfiguration() {

	}

	// Creo que objeto que me resolverá las vistas.
	@Bean (name = "viewResolver")
	public InternalResourceViewResolver getViewResolver() {

		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		
		// indico la raiz donde van a estar mis jsp, raiz de "WEB-INF"
		viewResolver.setPrefix("/");
		
		// indico la extension de las jsp
		viewResolver.setSuffix(".jsp");

		return viewResolver;
	}

	// Indico el bean que me retornará el controlador
	@Bean(name="/")
	public Controller getMessageDisplayContoler() {
		return new MessageDisplayController();
	}



}
