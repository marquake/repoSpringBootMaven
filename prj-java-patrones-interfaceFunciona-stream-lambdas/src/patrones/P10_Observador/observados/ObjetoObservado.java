package patrones.P10_Observador.observados;

import java.util.Observable;

import patrones.P10_Observador.observadores.Observador;

public class ObjetoObservado extends Observable {

	private int valor;
	
	public ObjetoObservado() {
	}

	public void anadirObservador(Observador observador){
		this.addObserver(observador);
	}
	
	public void notificarTodos(){
		this.notifyObservers();
	}
	
	public void cambiar(){
		this.setChanged();
	}

	public int getValor(){
		return this.valor;
	}
	
	public void setValor(int valor){
		this.valor = valor;
		this.cambiar();
	}
}