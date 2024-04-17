package data_staticConstructor;

import lombok.Data;
import lombok.NonNull;

public class MainData {

	public static void main(String[] args) {

		Coche coche = new Coche("1234 ASD", 3, "RRRR");
		System.out.println("Coche: " + coche.toString() );

		Coche<Integer> coche2 = new Coche<Integer>("1234 ASD", 3, 9876);
		System.out.println("Coche2: " + coche2.toString() );
		
		// Uso de creador estático 
		Moto moto = Moto.of("moto", 2, "Cadena saludo!");
		System.out.println("moto: " + moto.toString());

		Vehiculo vehiculo = Vehiculo.crearVehiculo("7764 RTW");
		System.out.println("vehiculo: " + vehiculo.toString());

	}

}

//Con @Data se añaden:
//
//		@NonNull,  @Getter,  @Setter, @EqualsAndHashCode, @ToString

@Data
class Coche<X> {

	public @NonNull String matricula;
	public @NonNull int numRuedas;
	public @NonNull X variableSinTipo;

}

// Con esto se crea un constructor estático
@Data(staticConstructor = "of")
class Moto<X> {

	public @NonNull String matricula;
	public @NonNull int numRuedas;
	public @NonNull X variableSinTipo;

}

//Con esto se crea un constructor estático
@Data(staticConstructor = "crearVehiculo")
class Vehiculo {

	public @NonNull String matricula;

}
