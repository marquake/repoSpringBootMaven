package patrones.P02_Factory_factoria.ej001;

public class Gato implements Animal {

	public Gato() {
		System.out.println("\t\tCreando gato...");
	}
	
	public void hablar(){
		System.out.println("soy un gato");	
	}

}
