package patrones.P08_command;

import java.util.ArrayList;

public class Calculadora {

	ArrayList<IOperaciones> listaOperaciones;

	public Calculadora() {
	}
	
	public void addOperacion(IOperaciones operacion){

		if(listaOperaciones == null){
			listaOperaciones = new ArrayList<IOperaciones>();
		}

		listaOperaciones.add(operacion);
	}
	
	public void ejecutarOperaciones(){

		for(IOperaciones operacion : listaOperaciones){
			operacion.execute();
		}
	}

}