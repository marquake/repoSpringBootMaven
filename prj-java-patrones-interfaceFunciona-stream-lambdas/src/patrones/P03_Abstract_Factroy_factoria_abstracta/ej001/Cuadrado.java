package patrones.P03_Abstract_Factroy_factoria_abstracta.ej001;

public class Cuadrado implements ObjetoCreado {

	public Cuadrado() {
	}

	@Override
	public void decirNombre() {
		System.out.println("Soy un cuadrado");
		
	}

}
