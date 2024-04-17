package getters_setters_01;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

public class Persona {

	@Getter @Setter
	public String nombre;

	@Getter(AccessLevel.PACKAGE) @Setter(AccessLevel.PACKAGE)
	public int edad;
	
	@Getter(AccessLevel.PRIVATE)
	public String apellido1;

	@Getter(AccessLevel.PROTECTED)
	public String apellido2;
	
	@Getter(AccessLevel.PUBLIC)
	public String direccion;

	@Getter(AccessLevel.NONE)
	public String empresa;

	@Getter(AccessLevel.MODULE)
	public String categoria;


	public void metodo() {
		
		// // getter / Access Level = SIN DECLARAR
		getNombre();
		
		// getter / Access Level = PRIVATE
		getApellido1();
		
		// getter / Access Level = PROTECTED
		getApellido2();
		
		// getter / Access Level = MODULE
		getCategoria();
		
		// getter / Access Level = PUBLIC
		getDireccion();
		
		// getter / Access Level = PACKAGE
		getEdad();
		
		// getter(Desactivado) / Access Level = NONE
		// getEmpresa();

	}
}