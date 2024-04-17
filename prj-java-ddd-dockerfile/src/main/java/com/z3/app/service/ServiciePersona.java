package com.z3.app.service;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.z3.app.data.Persona;
import com.z3.app.repository.PersonaRepository;

@Service
public class ServiciePersona {

	@Autowired
	PersonaRepository personaRepository;

	public List<Persona> getAll() {
		
		System.out.println("ServiciePersona :: getAll()");
		
		Persona persona;
		StringBuffer sbPersona = new StringBuffer();
		
		List<Persona> listaPersonas =  personaRepository.findAll();

		System.out.println("listaPersonas: " + listaPersonas.isEmpty());
		
		Iterator<Persona> it = listaPersonas.iterator();

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

}
