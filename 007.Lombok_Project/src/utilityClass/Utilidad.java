package utilityClass;

import lombok.experimental.UtilityClass;

@UtilityClass
public class Utilidad {

	// La notaci�n de Utility me ha convertido todos los m�todos de esta clase
	// en m�todos est�ticos.
	
	public int suma(int a, int b) {
		return a+b;
	}

	public int resta(int a, int b) {
		return a-b;
	}

}