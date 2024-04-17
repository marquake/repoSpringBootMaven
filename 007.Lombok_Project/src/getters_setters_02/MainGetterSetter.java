package getters_setters_02;

import getters_setters_01.Persona;
import lombok.AccessLevel;

public class MainGetterSetter {

	public static void main(String[] args) {

		MainGetterSetter mgs = new MainGetterSetter();
		
		mgs.test();
	}

	public void test() {

		Persona persona = new Persona();
		
		// getter / setter / Sin Access Level
		persona.getNombre();
		persona.setNombre("");
	
		// Este código comentado dará error porque la visibilidad de los getter y setter de edad
		// tienen AccessLevel.PACKAGE
		
		// persona.getEdad();
		// persona.setEdad(1);
		
		// getter / Access Level = PUBLIC
		persona.getDireccion();
		
		// // getter / Access Level = SIN DECLARAR
		persona.getNombre();
		
		// getter / Access Level = PRIVATE
		// es privado
		//persona.getApellido1();
		
		// getter / Access Level = PROTECTED
		// Esta clase no hereda de Persona
		//persona.getApellido2();
		
		// getter / Access Level = MODULE
		// estoy en otro modulo
		//persona.getCategoria();
		
		// getter / Access Level = PUBLIC
		persona.getDireccion();
		
		// getter / Access Level = PACKAGE
		// está en otro paquete
		//persona.getEdad();
		
		// getter(Desactivado) / Access Level = NONE
		// getEmpresa();
		
	}
}
