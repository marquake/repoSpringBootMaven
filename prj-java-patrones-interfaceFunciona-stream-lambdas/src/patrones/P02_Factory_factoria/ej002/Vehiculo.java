package patrones.P02_Factory_factoria.ej002;

public class Vehiculo {

	private int matricula;

	public Vehiculo() {
	}

	public void run(){
		System.out.println("Vehiculo arrancado...");
	}
	
	public int getMatricula(){
		return matricula;
	}
}
