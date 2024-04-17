import java.util.ArrayList;

public class Marcos {

 
	
	public Marcos() {
		// TODO Apéndice de constructor generado automáticamente
	}

	public static void main(String[] args) {

		ArrayList listaNumeros = new ArrayList();
		
		listaNumeros.add(1);
		listaNumeros.add(2);
		listaNumeros.add(3);

		System.out.println(listaNumeros.toString());

		listaNumeros.addAll( listaNumeros );

		System.out.println( listaNumeros.toString() );
	}

}