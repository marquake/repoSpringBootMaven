package com.marquake.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.marquake.data.Estudiante;

@Repository
public class EstudiantesDAOImpl implements EstudiantesDAO {

	@Override
	public List<Estudiante> getEstudiantes() {

		List<Estudiante> listaEstudiantes = new ArrayList<Estudiante>();
		
		listaEstudiantes.add( new Estudiante("Pepito", "54667890", 23));
		listaEstudiantes.add( new Estudiante("Manuela", "98776123", 22));
		listaEstudiantes.add( new Estudiante("Sofia", "09987456", 43));
		listaEstudiantes.add( new Estudiante("Adrián", "123456789", 19));
		listaEstudiantes.add( new Estudiante("Pandora", "9876543", 21));

		return listaEstudiantes;
	}

}
