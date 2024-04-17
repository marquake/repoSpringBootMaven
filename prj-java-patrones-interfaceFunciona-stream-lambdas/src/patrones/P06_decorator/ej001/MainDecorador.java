package patrones.P06_decorator.ej001;

public class MainDecorador {

	public MainDecorador() {
	}

	public static void main(String[] args) {
		
		MainDecorador mainDecorador = new MainDecorador();
		mainDecorador.test();

	}

	public void test(){
		
		Coche coche = new Coche();
		
		System.out.println("Coche");
		coche.acelerar();
		
		System.out.println("\n");
		System.out.println("Coche Deportivo");
		CocheDeportivo cocheDeportivo = new CocheDeportivo( new Coche() );
		
		cocheDeportivo.acelerar();
		cocheDeportivo.acelerarDeportivo();
		
		
		
	}

}