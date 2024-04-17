package patrones.P02_Factory_factoria.ej001;

public class Perro implements Animal{

	public Perro() {
		System.out.println("\t\tCreando perro...");
	}

	@Override
	public void hablar() {
		System.out.println("soy un perro");
	}

}
