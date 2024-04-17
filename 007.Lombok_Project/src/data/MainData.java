package data;

import lombok.Data;
import lombok.NonNull;

public class MainData {

	public static void main(String[] args) {

		// @NonNull
		Coche coche = new Coche("1234", 0);

		// @NonNull
		Coche coche2 = new Coche("1234 QWE", 3);

		// @Getter
		coche.setMatricula("1345 ASD");
		coche.setNumRuedas(4);

		// @Setter
		coche.getMatricula();
		coche.getNumRuedas();
		
		// @EqualsAndHashCode
		System.out.println("coche.hashCode(): " + coche.hashCode());		
		System.out.println("coche.equals( null ): " + coche.equals( null ));
		
		// @ToString
		System.out.println(coche.toString() );
		
		
	}

}

//Con @Data se añaden:
//
//		@NonNull,  @Getter,  @Setter, @EqualsAndHashCode, @ToString

@Data()
class Coche {

	
	public @NonNull String matricula;
	public @NonNull int numRuedas;
	
}
