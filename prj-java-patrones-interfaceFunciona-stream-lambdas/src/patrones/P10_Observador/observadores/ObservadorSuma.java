package patrones.P10_Observador.observadores;

import java.util.Observable;

import patrones.P10_Observador.observados.ObjetoObservado;

public class ObservadorSuma extends Observador {

	public ObservadorSuma() {
	}

	@Override
	public void update(Observable o, Object arg) {
		System.out.println("ObservadorSuma :: update");
	
		ObjetoObservado oo = (ObjetoObservado) o;

		System.out.println("oo.getValor(): " + oo.getValor()  + " + 80");

		oo.setValor( oo.getValor() + 80);
		
		System.out.println("oo.getValor(): " + oo.getValor());

	}

}
