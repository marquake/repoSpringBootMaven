package com.marquake.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@EnableWebMvc
@ComponentScan(basePackages = "com.marquake")
@Configuration
public class SpringMvcConfiguration implements WebMvcConfigurer {

	// Creo que objeto que me resolverá las vistas.
	@Bean (name = "viewResolver")
	public ViewResolver getViewResolver() {

		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		
		// indico la raiz donde van a estar mis jsp, raiz de "WEB-INF"
		viewResolver.setPrefix("/");
		
		// indico la extension de las jsp
		viewResolver.setSuffix(".jsp");

		return viewResolver;
	}

//	// Indico el bean que me retornará el controlador
//	@Bean(name="/")
//	public Controller getMessageDisplayContoler() {
//		return new MessageDisplayController();
//	}



}
