package patrones.P02_Factory_factoria.ej001;


public class MainFactory {

	public MainFactory() {
	}

	public static void main(String[] args) {

		MainFactory mainFactory = new MainFactory();
		
		mainFactory.test();
	}

	public void test(){

		Animal perro = null;
		Animal gato = null;

		FabricaAnimales fabrica = new FabricaAnimales();
		
		perro = fabrica.crearAnimal("perro");
		
		gato = fabrica.crearAnimal("gato");
		
		perro.hablar();

		gato.hablar();
		
	}
}
