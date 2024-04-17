package patrones.P05_facade;

public class Circulo implements Shape {

	public Circulo() {
	}

	@Override
	public void draw() {
		System.out.println("Circulo :: draw()");
	}

}
