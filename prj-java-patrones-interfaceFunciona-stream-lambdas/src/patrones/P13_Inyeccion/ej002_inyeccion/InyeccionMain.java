package patrones.P13_Inyeccion.ej002_inyeccion;

public class InyeccionMain {

	public InyeccionMain() {
	}

	public static void main(String[] args) {

		InyeccionMain inyeccionMain = new InyeccionMain();

		inyeccionMain.test();

	}

	public void test(){

		ClaseInyectada claseInyectada = new ClaseInyectada(597);
		ClaseObjetivo claseObjetivo = new ClaseObjetivo(claseInyectada);

		claseObjetivo.mostrarDato();
		
		System.out.println("---------------------------------------------------------");
		
		claseInyectada = new ClaseInyectada(432);
		claseObjetivo = new ClaseObjetivo(claseInyectada);

		claseObjetivo.mostrarDato();
	}

}