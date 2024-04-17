package nonNull;

import lombok.NonNull;

public class MainNonNull {

	public static void main(String[] args) {

		Persona persona = new Persona("Juan");

		// Se crea una persona pasando como nombre NULL, falla en ejecuci�n.
		Persona otraPersona = new Persona(null);
		
	}

}

class Persona {

	public String nombre; 

	// se indica al m�todo que no queremos que entren valores nulo.

	public Persona(@NonNull String varNombre) {
		
		// @NonNull realiza la siguiente operaci�n por debajo:
		if (varNombre == null) throw new NullPointerException("varNombre");

		this.nombre = varNombre;
	}

}
