package utilityClass;

import lombok.experimental.UtilityClass;

@UtilityClass
public class Utilidad {

	// La notación de Utility me ha convertido todos los métodos de esta clase
	// en métodos estáticos.
	
	public int suma(int a, int b) {
		return a+b;
	}

	public int resta(int a, int b) {
		return a-b;
	}

}