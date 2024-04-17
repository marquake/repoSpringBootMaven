package patrones.P11_Estrategia;

public class Contexto implements Strategia {
	
	Strategia estrategia;
	
	
	public Contexto(Strategia estrategia) {
		this.estrategia = estrategia;
	}

	@Override
	public void ejecutarEstrategia() {
		estrategia.ejecutarEstrategia();
	}

}
