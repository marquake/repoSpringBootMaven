package patrones.P11_Estrategia;

public class MainStrategy {

	public MainStrategy() {
	}

	public static void main(String[] args) {
		MainStrategy mainStrategy = new MainStrategy();
		
		mainStrategy.test();
	}

	public void test(){

		EstrategiaUno estraUno = new EstrategiaUno();
		EstrategiaDos estraDos = new EstrategiaDos();

		Contexto contexto = new Contexto(estraUno);
		
		contexto.ejecutarEstrategia();
		
		contexto = new Contexto(estraDos);
		
		contexto.ejecutarEstrategia();

	}
}
