package patrones.P06_decorator.ej001;

public class Coche implements Vehiculo {

	public Coche() {
	}

	@Override
	public void acelerar() {
		System.out.println("Acelerando normal...");
	}

}