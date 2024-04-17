package patrones.P03_Abstract_Factroy_factoria_abstracta.ej001;

public class MainFactoriaAbstracta {

	public MainFactoriaAbstracta() {
	}

	public static void main(String[] args) {
		MainFactoriaAbstracta mainFactoriaAbstracta = new MainFactoriaAbstracta();
		mainFactoriaAbstracta.test();
	}

	public void test(){
		GeneradorFactoria generadorFactoria = new GeneradorFactoria();
		
		FactoriaAbstracta factoriaAbstractaVehiculo = generadorFactoria.crearFactoria("vehiculo");
		FactoriaAbstracta factoriaAbstractaGeometria = generadorFactoria.crearFactoria("geometria");

		ObjetoCreado coche =  factoriaAbstractaVehiculo.crearObjeto("coche");
		ObjetoCreado bus =  factoriaAbstractaVehiculo.crearObjeto("bus");

		ObjetoCreado circulo =  factoriaAbstractaGeometria.crearObjeto("circulo");
		ObjetoCreado cuadrado =  factoriaAbstractaGeometria.crearObjeto("cuadrado");
		
		coche.decirNombre();
		bus.decirNombre();

		circulo.decirNombre();
		cuadrado.decirNombre();

	}
}