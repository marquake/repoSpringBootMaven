package patrones.P06_decorator.ej001;

public abstract class DecoradorDeportivo implements Vehiculo {

	protected Coche coche; 

	public DecoradorDeportivo(Coche coche) {
		this.coche = coche;
	}

	@Override
	public void acelerar() {
		System.out.println("Acelerando normal...");
	}

	public abstract void acelerarDeportivo();

}