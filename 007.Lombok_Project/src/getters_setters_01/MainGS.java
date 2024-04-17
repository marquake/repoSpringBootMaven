/**
 * 
 */
package getters_setters_01;

import lombok.Getter;
import lombok.Setter;

/**
 *
 *
 */
public class MainGS {

	/**
	 * 
	 */
	public MainGS() {

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		PersonaGS pgs = new PersonaGS();

		pgs.setSoloSet("esto es solo set");

		System.out.println("pgs.getSoloGet(): " + pgs.getSoloGet());

		System.out.println("pgs.datoNoAlcanzableConGetSet: " + pgs.datoNoAlcanzableConGetSet);
		
		pgs.setVariable_Get_Set("variable get y set");

		System.out.println("pgs.getVariable_Get_Set(): " + pgs.getVariable_Get_Set() );
		
	}

}

/**
 * Añade metodos setter y getters
 *
 */
class PersonaGS {

	public String datoNoAlcanzableConGetSet;

	@Getter
	public String soloGet;

	@Setter
	public String soloSet;

	@Getter @Setter
	public String variable_Get_Set;

	public PersonaGS()
	{
		this.soloGet = "variable solo get";
	}
}

