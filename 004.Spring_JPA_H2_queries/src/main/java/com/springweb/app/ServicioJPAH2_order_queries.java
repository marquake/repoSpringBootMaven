package com.springweb.app;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
public class ServicioJPAH2_order_queries {

	@Autowired
	RepositorioBBDD repositorioBBDD;

	public void getDatos() {
		findAll_Ascendente();
		findAll_Descendente();
		findAll_Paginacion();
	}

	public void findAll_Ascendente() {
		System.out.println("ServicioJPAH2 :: findAll_Ascendente()");
		List alPersonas = repositorioBBDD.findAll(Sort.by(Sort.Direction.ASC, "id"));
		recorrerResultados(alPersonas);
	}

	public void findAll_Descendente() {
		System.out.println("ServicioJPAH2 :: findAll_Descendente()");
		List alPersonas = repositorioBBDD.findAll(Sort.by(Sort.Direction.DESC, "id"));
		recorrerResultados(alPersonas);		
	}

	public void findAll_Paginacion() {		
		System.out.println("ServicioJPAH2 :: findAll_OrdenadoLongitudNombre()");

		//List alPersonas = repositorioBBDD.findAll(new Sort("LENGTH(nombre)"));
		//List alPersonas = repositorioBBDD.findAll(JpaSort.unsafe("LENGTH(nombre)"));
//		List alPersonas = repositorioBBDD.findAll(new Page);

		Page<Persona> paginaPersonas;

		//PageRequest es la implementación de Pageable
		// Se solicitan 20 resultados en la página 0y otros 20 resultados en la página 1
		//Pageable firstPageWithTwoElements = PageRequest.of(0, 20);
		//Pageable secondPageWithFiveElements = PageRequest.of(1, 20);
		
		// Se solicitan 20 resultados en la página 0y otros 20 resultados en la página 1
		//Pageable firstPageWithTwoElements = PageRequest.of(0, 20);
		//Pageable secondPageWithFiveElements = PageRequest.of(1, 20);		

		// Se solicitan 3 resultados en la página 0 y otros 3 resultado en la página 1
		Pageable firstPageWithTwoElements = PageRequest.of(0, 3);
		Pageable secondPageWithFiveElements = PageRequest.of(1, 3);

		// Se solicitan 5 resultados en la página 0 y 1 resultado en la página 1
//		Pageable firstPageWithTwoElements = PageRequest.of(0, 5);
//		Pageable secondPageWithFiveElements = PageRequest.of(1, 5);

		System.out.println("PRIMERA PAGINACIÓN(0,3)");
		paginaPersonas =  repositorioBBDD.findAll(firstPageWithTwoElements);
		System.out.println("paginaPersonas.getNumberOfElements(): " + paginaPersonas.getNumberOfElements());
		recorrerResultados(paginaPersonas.getContent());

		System.out.println("SEGUNDA PAGINACIÓN(1,3)");
		paginaPersonas =  repositorioBBDD.findAll(secondPageWithFiveElements);
		System.out.println("paginaPersonas.getNumberOfElements(): " + paginaPersonas.getNumberOfElements());
		recorrerResultados(paginaPersonas.getContent());
	}

	public void recorrerResultados(List listaResultados) {
		Iterator it = listaResultados.iterator();
		while(it.hasNext()) {
			Persona persona = (Persona)it.next();
			String nombrePersona = persona.getId() + " " + persona.getNombre();
			System.out.println("nombrePersona : " + nombrePersona);
		}	
	}

}
