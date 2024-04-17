package com.marquake.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.marquake.data.Estudiante;

@Repository
public class EstudianteDAOImpl implements EstudianteDAO {

	public EstudianteDAOImpl() {
	}

	public List<Estudiante> getListaEstudiantes() {
		
		List<Estudiante> lista = new ArrayList<Estudiante>();

		lista.add( new Estudiante("Juan", "fernandez"));
		lista.add( new Estudiante("pepito", "martín"));
		lista.add( new Estudiante("manola", "dolar"));
		lista.add( new Estudiante("fifis", "btc"));
		

		return lista;
	}

	public void modificarEstudiante(Estudiante estudiante) {
		System.out.println("modificarEstudiante" + estudiante.toString());

	}

	public void borrarEstudiante(int id) {
		System.out.println("borrarEstudiante" + id );
		
	}

	public Estudiante consultarEstudiante(int id) {
		System.out.println("consultarEstudiante: id: " + id);
		return null;
	}

}
