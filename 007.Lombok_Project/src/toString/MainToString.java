package toString;

import lombok.AllArgsConstructor;
import lombok.ToString;
import lombok.ToString.Exclude;

public class MainToString {

	public static void main(String[] args) {

		// Lombok me fuerza a crear el objeto con todos los atributos por --> @AllArgsConstructor

		Coche coche = new Coche("Seat", "Formentera", "0578-FBI");
		Persona persona = new Persona("Juan", "Sánchez", "Cobos", 36, "56.878.112-Z", coche, "campo excluido");

		System.out.println("persona: " + persona.toString());
		//System.out.println("coche: " + coche.toString());

		// -------------------------------------------------------------------------------------------------
		// Salida sin anotaciones:
		//
		// persona	: toString.Persona@36baf30c
		// coche	: toString.Coche@7a81197d

		// -------------------------------------------------------------------------------------------------
		// Salida con anotaciones solo en persona
		//
		// persona: Persona(nombre=Juan, apellido1=Sánchez, apellido2=Cobos, edad=36, dni=56.878.112-Z, 
		//					coche=toString.Coche@7a81197d)

		// -------------------------------------------------------------------------------------------------
		// Salida con anotaciones en persona y coche
		//
		// persona: Persona(nombre=Juan, apellido1=Sánchez, apellido2=Cobos, edad=36, dni=56.878.112-Z,
		//					coche=Coche(marca=Seat, modelo=Formentera, matricula=0578-FBI))



	}

}

// Se indica a lombok que cree un constructor con todas las variables como argumento
// del constructor

@AllArgsConstructor @ToString
class Persona{
	
	public String nombre;
	public String apellido1;
	public String apellido2;
	public int edad;
	public String dni;
	public Coche coche;

	// vale cualquiera de estas dos notaciones.
	//@Exclude

	@ToString.Exclude
	public String campoExcluido;
}

@AllArgsConstructor @ToString
class Coche{

	public String marca;
	public String modelo;
	public String matricula;
}