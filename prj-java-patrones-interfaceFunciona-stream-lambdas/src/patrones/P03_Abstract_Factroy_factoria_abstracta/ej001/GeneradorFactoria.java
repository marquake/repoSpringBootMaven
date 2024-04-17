package patrones.P03_Abstract_Factroy_factoria_abstracta.ej001;

public class GeneradorFactoria {

	public GeneradorFactoria() {
	}

	public FactoriaAbstracta crearFactoria(String nombreFactoria){

		FactoriaAbstracta factoriaAbstracta = null;

		if ( nombreFactoria.equalsIgnoreCase("vehiculo")){
			factoriaAbstracta = new FactoryVehiculo();
		}else if (nombreFactoria.equalsIgnoreCase("geometria")){
			factoriaAbstracta = new FactoryGeometria();
		}

		return factoriaAbstracta;
	}
}
