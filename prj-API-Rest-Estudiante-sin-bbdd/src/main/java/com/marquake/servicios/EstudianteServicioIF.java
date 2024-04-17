package com.marquake.servicios;

import java.util.List;

import org.springframework.stereotype.Service;

import com.marquake.data.*;

@Service
public interface EstudianteServicioIF {

	public List<Estudiante> getListaEstudiantes();

	public void modificarEstudiante(Estudiante estudiante);
	
	public void borrarEstudiante(int id);

	public Estudiante consultarEstudiante(int id);
	
}