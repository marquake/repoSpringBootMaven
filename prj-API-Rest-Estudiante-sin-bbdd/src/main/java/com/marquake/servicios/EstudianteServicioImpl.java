package com.marquake.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marquake.dao.EstudianteDAO;
import com.marquake.data.*;

@Service
public class EstudianteServicioImpl {

	@Autowired
	EstudianteDAO estudianteDAO;
	
	public EstudianteServicioImpl() {
	}

	public List<Estudiante> getListaEstudiantes(){
		return estudianteDAO.getListaEstudiantes();
	}

	public void modificarEstudiante(Estudiante estudiante) {
		estudianteDAO.modificarEstudiante(estudiante);

	}

	public void borrarEstudiante(int id) {
		estudianteDAO.borrarEstudiante(id);
	}

	public Estudiante consultarEstudiante(int id) {
		estudianteDAO.consultarEstudiante(id);
		return null;
	}
	
}