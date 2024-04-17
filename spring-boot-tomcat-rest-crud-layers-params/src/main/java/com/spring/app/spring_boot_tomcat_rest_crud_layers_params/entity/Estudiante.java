package com.spring.app.spring_boot_tomcat_rest_crud_layers_params.entity;

import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan
public class Estudiante {

	private String nombre;
	private int edad;

	public Estudiante() {		
	}

	public Estudiante(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}

}
