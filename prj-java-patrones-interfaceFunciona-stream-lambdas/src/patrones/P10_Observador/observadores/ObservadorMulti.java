package patrones.P10_Observador.observadores;

import java.util.Observable;

import patrones.P10_Observador.observados.ObjetoObservado;

public class ObservadorMulti extends Observador {

	public ObservadorMulti() {
	}

	@Override
	public void update(Observable o, Object arg) {
		System.out.println("ObservadorMulti :: update");
		
		ObjetoObservado oo = (ObjetoObservado) o;

		System.out.println("oo.getValor(): " + oo.getValor()  + " x 99");

		oo.setValor( oo.getValor() * 99);
		
		System.out.println("oo.getValor(): " + oo.getValor());
	}

}
