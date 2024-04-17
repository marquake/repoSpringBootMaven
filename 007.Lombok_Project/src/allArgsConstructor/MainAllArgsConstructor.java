package allArgsConstructor;

import lombok.AllArgsConstructor;

public class MainAllArgsConstructor {


	public static void main(String[] args) {

		// Lombok me fuerza a crear el objeto con todos los atributos.

		 Persona persona = new Persona("Juan", "Sánchez", "Cobos", 36, "56.878.112-Z");

	}

}

// Se indica a lombok que cree un constructor con todas las variables como argumento
// del constructor

@AllArgsConstructor
class Persona{
	
	public String nombre;
	public String apellido1;
	public String apellido2;
	public int edad;
	public String dni;

}
