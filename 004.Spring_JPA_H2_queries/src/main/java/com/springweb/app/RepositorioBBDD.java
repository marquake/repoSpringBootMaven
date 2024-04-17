package com.springweb.app;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface RepositorioBBDD extends JpaRepository<Persona, Integer> {

	// JPQL, no busca de base de datos, hace una query sobre el objeto JPA(Persona) no sobre la tabla PERSONAS
	// Es una mala query pero vale de ejemplo de JPL
	// Busca todas las personas con ID mayor de cero.
	@Query("SELECT persona FROM Persona persona WHERE persona.id > 0")
	public Collection<Persona> findTodasLasPersonas_JPQL();

	
	// Busco las personas cuyo id esté comprendido entre un max y un min y además que la persona
	// contenta una letra 'o' en su nombre
	@Query("SELECT persona FROM Persona persona WHERE persona.id > :idMin AND persona.id < :idMax AND persona.nombre like '%o%'")
	public Collection<Persona> findTodasLasPersonas_JPQL_Param(
			@Param("idMin") Integer idMin,
			@Param("idMax") Integer idMax);

	// El formato Nativo respeta sintaxis de SQL
	@Query(value = "SELECT * FROM PERSONAS persona WHERE persona.id > 1", 
		   nativeQuery = true)
	public Collection<Persona> findTodasLasPersonas_Native();
	
	// El formato Nativo respeta sintaxis de SQL
	@Query(value = "SELECT * FROM PERSONAS persona WHERE persona.id > ?1", 
		   nativeQuery = true)
	public Collection<Persona> findTodasLasPersonas_Native_Param(Integer identificador);

	//public List<Persona> findAllPaginacion(Pageable pageable); 

}