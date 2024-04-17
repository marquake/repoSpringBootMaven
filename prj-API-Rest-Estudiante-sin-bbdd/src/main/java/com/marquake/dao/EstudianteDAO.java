package com.marquake.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.marquake.data.Estudiante;

@Repository
public interface EstudianteDAO {

	public List<Estudiante> getListaEstudiantes();

	public void modificarEstudiante(Estudiante estudiante);
	
	public void borrarEstudiante(int id);

	public Estudiante consultarEstudiante(int id);

}
