package patronBuilder;

public class Main {

	public static void main(String[] args) {

		Main main = new Main();
		
		main.run();
		
	}

	public void run() {

		Persona persona = new PersonaBuilder().setNombre("Marcos").build();

		System.out.println( persona.toString() );
	}

}