package patrones.P12_DAO;

public class Persona {

	private int id;
	private String name;
	private int edad;
	
	public Persona() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String toString(){
		String personaString = new String();
		personaString = "[id: " + this.getId() + ", nombre: " + this.getName() + ", edad: " + this.getEdad() + "]";
		return personaString;
	}
}
