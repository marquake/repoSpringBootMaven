package patronBuilder;

public class PersonaBuilder {

	private String nombre;
	private String apellido;
	private int edad;

	public PersonaBuilder() {
		
	}

	public PersonaBuilder setNombre(String nombre) {
		this.nombre = nombre;
		return this;
	}

	public Persona build() {
		return new Persona(nombre, apellido, edad);
	}

}
