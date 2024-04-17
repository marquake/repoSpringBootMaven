package patrones.P10_Observador;

import patrones.P10_Observador.observadores.ObservadorMulti;
import patrones.P10_Observador.observadores.ObservadorResta;
import patrones.P10_Observador.observadores.ObservadorSuma;
import patrones.P10_Observador.observados.ObjetoObservado;

public class ObservadorMain {

	public ObservadorMain() {
	}

	public static void main(String[] args) {

		ObservadorMain observadorMain = new ObservadorMain();

		observadorMain.test();

	}

	public void test(){

		ObjetoObservado observado = new ObjetoObservado();

		ObservadorMulti observadorMulti = new ObservadorMulti();
		ObservadorResta observadorResta = new ObservadorResta();
		ObservadorSuma observadorSuma = new ObservadorSuma();

		observado.addObserver(observadorResta);
		observado.addObserver(observadorMulti);
		observado.addObserver(observadorSuma);

		observado.setValor(55);
		observado.notificarTodos();

	}

}