#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import ${package}.data.Estudiante;

public interface EstudiantesDAO {
	public List<Estudiante> getEstudiantes();
}