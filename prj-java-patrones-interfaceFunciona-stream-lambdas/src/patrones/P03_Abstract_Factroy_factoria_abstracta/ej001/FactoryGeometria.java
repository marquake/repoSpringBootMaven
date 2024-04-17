package patrones.P03_Abstract_Factroy_factoria_abstracta.ej001;

public class FactoryGeometria implements FactoriaAbstracta {

	public FactoryGeometria() {
	}

	@Override
	public ObjetoCreado crearObjeto(String typeObject) {

		ObjetoCreado objetoCreado = null;	

		if ( typeObject.equalsIgnoreCase("circulo")) {

			objetoCreado = new Circulo();

		}else if (typeObject.equalsIgnoreCase("cuadrado")){

			objetoCreado = new Cuadrado();

		}

		return objetoCreado;

	}


}