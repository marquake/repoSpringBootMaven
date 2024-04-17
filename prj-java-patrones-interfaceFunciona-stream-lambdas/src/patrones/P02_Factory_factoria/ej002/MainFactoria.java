package patrones.P02_Factory_factoria.ej002;

public class MainFactoria {

	public MainFactoria() {
	}

	public static void main(String[] args) {

		MainFactoria mainFactoria = new MainFactoria();
		
		mainFactoria.test();
		
	}

	void test(){
		
		FabricaVehiculos fabricaVehiculos = new FabricaVehiculos();
		
		Vehiculo vehiculoCoche = fabricaVehiculos.fabricarVehiculo("coche");
		Vehiculo vehiculoMoto = fabricaVehiculos.fabricarVehiculo("moto");
		Vehiculo vehiculobus = fabricaVehiculos.fabricarVehiculo("bus");

		vehiculoCoche.run();
		vehiculoMoto.run();
		vehiculobus.run();

	}
}
