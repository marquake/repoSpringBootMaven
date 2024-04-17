package patrones.P03_Abstract_Factroy_factoria_abstracta.ej001;

public class Bus implements ObjetoCreado {

	public Bus() {
	}

	@Override
	public void decirNombre() {
		System.out.println("Soy un bus");
		
	}

}