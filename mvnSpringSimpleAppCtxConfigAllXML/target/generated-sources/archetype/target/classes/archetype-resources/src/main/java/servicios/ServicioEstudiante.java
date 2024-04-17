#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ${package}.dao.EstudiantesDAO;
import ${package}.data.Estudiante;

@Service
public class ServicioEstudiante {

	@Autowired
	EstudiantesDAO estudianteDAO;

	public List<Estudiante> getEstudiantes() {
		return estudianteDAO.getEstudiantes();
	}

}
