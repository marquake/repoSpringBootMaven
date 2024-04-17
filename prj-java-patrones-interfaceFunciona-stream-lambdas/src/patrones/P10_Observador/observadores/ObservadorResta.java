package patrones.P10_Observador.observadores;

import java.util.Observable;

import patrones.P10_Observador.observados.ObjetoObservado;

public class ObservadorResta extends Observador {

	public ObservadorResta() {
	}

	@Override
	public void update(Observable o, Object arg) {

		System.out.println("ObservadorResta :: update");

		ObjetoObservado oo = (ObjetoObservado) o;

		System.out.println("oo.getValor(): " + oo.getValor() + " - 23");

		oo.setValor( oo.getValor() - 23);
		
		System.out.println("oo.getValor(): " + oo.getValor());
		
	}

}