package com.marquake.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marquake.dao.EstudiantesDAO;
import com.marquake.data.Estudiante;

@Service
public class ServicioEstudiante {

	@Autowired
	EstudiantesDAO estudianteDAO;

	public List<Estudiante> getEstudiantes() {
		return estudianteDAO.getEstudiantes();
	}

}
