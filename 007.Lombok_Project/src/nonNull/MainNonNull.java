package nonNull;

import lombok.NonNull;

public class MainNonNull {

	public static void main(String[] args) {

		Persona persona = new Persona("Juan");

		// Se crea una persona pasando como nombre NULL, falla en ejecución.
		Persona otraPersona = new Persona(null);
		
	}

}

class Persona {

	public String nombre; 

	// se indica al método que no queremos que entren valores nulo.

	public Persona(@NonNull String varNombre) {
		
		// @NonNull realiza la siguiente operación por debajo:
		if (varNombre == null) throw new NullPointerException("varNombre");

		this.nombre = varNombre;
	}

}
