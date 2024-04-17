package it.pkg.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.pkg.dao.EstudiantesDAO;
import it.pkg.data.Estudiante;

@Service
public class ServicioEstudiante {

	@Autowired
	EstudiantesDAO estudianteDAO;

	public List<Estudiante> getEstudiantes() {
		return estudianteDAO.getEstudiantes();
	}

}
