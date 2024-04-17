/**
 * 
 */
package RequiredArgsConstructor;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

public class MainRequiredArgsConstructor {

	public static void main(String[] args) {

		// Lombok crea un contructor de clases con los campos que no puede 
		// ser nulos o que son final.

		 Persona persona = new Persona("Juan", 38, 154368);

		 // la clase tiene getter y setter por anotaci�n
		 persona.setNombre("");
		 persona.getNombre();
	}

}

@RequiredArgsConstructor
class Persona{
	
	// esta variable nunca puede ser nula, si creo la clase como est� ahora mismo se crear� nula.

	@NonNull @Getter @Setter
	public String nombre;

	// esta variable nunca puede ser nula, si creo la clase como est� ahora mismo se crear� nula.

	@NonNull
	public Integer edad;
	
	// En este caso no tiene sentido que un INT sea null, aunque no da error, solo un WARNING
	//
	// @NonNull
	// public int edad;
	

	// Esta es una variable final, se debe inicializar siempre, sino error en compilaci�n.
	
	// como en la parte superior se usa la anotaci�n "@RequiredArgsConstructor", java no me pide
	// que inicialice la variable. Sino estuviese anotada as�, da error de compilaci�n. ejemplo m�s abajo.
	public final int codPersona;

}

class PersonaError{

	// Esta variable, si se descomenta, da error en compilaci�n porque no est� inicializada 
	// y lleva el modificador FINAL.
	//
	//public final int codPersona;

}




