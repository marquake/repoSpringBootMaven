package patrones.P03_Abstract_Factroy_factoria_abstracta.ej001;

public class FactoryVehiculo implements FactoriaAbstracta {

	public FactoryVehiculo() {
	}

	@Override
	public ObjetoCreado crearObjeto(String typeObject) {

		ObjetoCreado objetoCreado = null;

		if(typeObject.equalsIgnoreCase("coche")){
			
			objetoCreado = new Coche();
			
		}else if (typeObject.equalsIgnoreCase("bus")){
			
			objetoCreado = new Bus();
		}

		return objetoCreado;
	}

}
