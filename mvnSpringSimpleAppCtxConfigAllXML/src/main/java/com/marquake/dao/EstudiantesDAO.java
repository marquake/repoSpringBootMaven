package com.marquake.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.marquake.data.Estudiante;

public interface EstudiantesDAO {
	public List<Estudiante> getEstudiantes();
}