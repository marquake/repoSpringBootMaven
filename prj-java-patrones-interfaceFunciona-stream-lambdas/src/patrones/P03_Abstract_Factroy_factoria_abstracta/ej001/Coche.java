package patrones.P03_Abstract_Factroy_factoria_abstracta.ej001;

public class Coche implements ObjetoCreado {

	public Coche() {
	}

	@Override
	public void decirNombre() {
		System.out.println("Soy un coche");
	}

}
