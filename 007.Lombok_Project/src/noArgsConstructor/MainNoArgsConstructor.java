package noArgsConstructor;

import lombok.NoArgsConstructor;

public class MainNoArgsConstructor {

	public static void main(String[] args) {
		
		// Lombok me ha creado un constructor sin parámetros
		Persona persona = new Persona();

	}

}

@NoArgsConstructor
class Persona{
	
	public String nombre;
	public String apellido1;
	public String apellido2;
	public int edad;
	public int dni;

}