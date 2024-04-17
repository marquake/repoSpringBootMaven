package patrones.P03_Abstract_Factroy_factoria_abstracta.ej001;

public class Circulo implements ObjetoCreado {

	public Circulo() {
	}

	@Override
	public void decirNombre() {
		System.out.println("Soy un circulo");
		
	}

}
