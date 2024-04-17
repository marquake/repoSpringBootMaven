#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.entity;

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
