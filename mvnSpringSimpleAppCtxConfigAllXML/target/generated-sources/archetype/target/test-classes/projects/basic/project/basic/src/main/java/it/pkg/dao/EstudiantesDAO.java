package it.pkg.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import it.pkg.data.Estudiante;

public interface EstudiantesDAO {
	public List<Estudiante> getEstudiantes();
}