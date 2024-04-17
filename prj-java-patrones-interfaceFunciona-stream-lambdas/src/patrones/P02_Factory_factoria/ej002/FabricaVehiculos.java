package patrones.P02_Factory_factoria.ej002;


public class FabricaVehiculos {

	public FabricaVehiculos() {
	}

	public Vehiculo fabricarVehiculo(String typeVehiculo){
		
		Vehiculo vehiculo = null;
		
		if (typeVehiculo.equalsIgnoreCase("coche")){
			vehiculo = new Coche();
		}else if(typeVehiculo.equalsIgnoreCase("moto")){
			vehiculo = new Moto();
		}else if(typeVehiculo.equalsIgnoreCase("bus")){
			vehiculo = new Bus();
		}else{
			System.out.println("No tenemos el vehículo solicitado");
		}

		return vehiculo;	
		
	}
}
