package com.springweb.app;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicioJPAH2 {

	@Autowired
	RepositorioBBDD repositorioBBDD;
	
	public void getDatos() {
		findAll();
		findTodasLasPersonas_JPQL();
		findTodasLasPersonas_JPQL_Param();
		findTodasLasPersonas_Native();
	}

	public void findAll() {
		
		System.out.println("ServicioJPAH2 :: findAll()");
		
		List alPersonas = repositorioBBDD.findAll();
		
		recorrerResultados(alPersonas);
		
	}

	// 1. JPQL
	public void findTodasLasPersonas_JPQL() {
		
		System.out.println("ServicioJPAH2 :: findTodasLasPersonas_JPQL()");
		
		Collection alPersonas = repositorioBBDD.findTodasLasPersonas_JPQL();
		
		recorrerResultados(alPersonas);
		
	}

	public void findTodasLasPersonas_JPQL_Param() {
		
		System.out.println("ServicioJPAH2 :: findTodasLasPersonas_JPQL_Param()");
		
		// Busco las personas con id > 2 y id < 6, para usar parámetros
		Collection alPersonas = repositorioBBDD.findTodasLasPersonas_JPQL_Param(2, 6);
		
		recorrerResultados(alPersonas);
		
	}

	public void findTodasLasPersonas_Native() {
		
		System.out.println("ServicioJPAH2 :: findTodasLasPersonas_Native()");
		
		Collection alPersonas = repositorioBBDD.findTodasLasPersonas_Native();
		
		recorrerResultados(alPersonas);
		
	}

	public void findTodasLasPersonas_Native_Param() {
		
		System.out.println("ServicioJPAH2 :: findTodasLasPersonas_Native()");

		Collection alPersonas = repositorioBBDD.findTodasLasPersonas_Native_Param( new Integer(3) );
		
		recorrerResultados(alPersonas);
		
	}

	public void recorrerResultados(Collection listaResultados) {
		Iterator it = listaResultados.iterator();
		while(it.hasNext()) {
			Persona persona = (Persona)it.next();
			String nombrePersona = persona.getId() + " " + persona.getNombre();
			System.out.println("nombrePersona : " + nombrePersona);
		}	
	}
}
