package patrones.P13_Inyeccion.ej002_inyeccion;

public class ClaseObjetivo {

	private ClaseInyectada claseInyectada;
	
	public ClaseObjetivo(ClaseInyectada claseInyectada) {
		this.claseInyectada = claseInyectada;
	}

	public void mostrarDato(){
		
		System.out.println("ClaseObjetivo :: mostrarDato()");
		System.out.println("\t ClaseInyectada claseInyectada.valor() : " + claseInyectada.getValor());
		
	}
	
}