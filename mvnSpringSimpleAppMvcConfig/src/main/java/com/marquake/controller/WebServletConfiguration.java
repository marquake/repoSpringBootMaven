package com.marquake.controller;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

// esta clase es el servlet que controlará una app con el model MVC.
// Como es un inicializador, el contenedor spring la carga automáticamente.
public class WebServletConfiguration implements WebApplicationInitializer {

	public WebServletConfiguration() {
	}

	public void onStartup(ServletContext servletContext) throws ServletException {

		AnnotationConfigWebApplicationContext appContext = new AnnotationConfigWebApplicationContext();
		
		// registramos el contexto de nuestra aplicación
		appContext.register(SpringMvcConfiguration.class);
		
		// En las aplicaciones Spring MVC hay que indicar el servlet explicitamente.
		// añado un nuevo servlet con el contexto de la aplicación, el que yo he creado.
		ServletRegistration.Dynamic servlet = servletContext.addServlet("dispatcher", new DispatcherServlet( appContext)) ;
		
		servlet.setLoadOnStartup(1);

		servlet.addMapping("/");
	}

}
