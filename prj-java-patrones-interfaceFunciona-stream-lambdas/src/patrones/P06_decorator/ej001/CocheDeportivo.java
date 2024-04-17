package patrones.P06_decorator.ej001;

public class CocheDeportivo extends DecoradorDeportivo {

	public CocheDeportivo(Coche coche) {
		super(coche);
	}

	@Override
	public void acelerar() {
		System.out.println("Acelerando normal...");
	}

	@Override
	public void acelerarDeportivo() {
		System.out.println("Acelerar a topeee!!");	
	}

}