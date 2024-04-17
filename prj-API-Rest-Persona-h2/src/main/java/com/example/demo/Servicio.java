package com.example.demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Servicio {

	@Autowired
	PersonaRepository personaRepository;

	public List<Persona> getAll() {

		Persona persona;
		StringBuffer sbPersona = new StringBuffer();
		
		System.out.println("Servicio :: getAll()");

		List<Persona> listaPersonas =  personaRepository.findAll();

		System.out.println("listaPersonas: " + listaPersonas.isEmpty());
		
		Iterator it = listaPersonas.iterator();

		while(it.hasNext()) {

			persona = (Persona)it.next();

			sbPersona
			.append( persona.getId() ).append(" / ").append(persona.getNombre()).append(" / ")
			.append(persona.getApellido()).append(" / ").append(persona.getDireccion())
			.append(" / ").append(persona.getCiudad());

			System.out.println(sbPersona.toString());

			// Se borra buffer
			sbPersona.delete(0, sbPersona.length());
		}

		return personaRepository.findAll();
	}

	public void TestServicio() {
		System.out.println("Servicio :: TestServicio()");
		System.out.println("Invocación correcta!");
	}
	
}
