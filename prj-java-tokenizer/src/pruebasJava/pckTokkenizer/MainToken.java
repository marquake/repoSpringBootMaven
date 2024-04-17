package pruebasJava.pckTokkenizer;

import java.util.StringTokenizer;

public class MainToken {

	public static void main(String[] args) {
		MainToken mt = new MainToken();
		
		mt.probarToken();

	}

	public void probarToken() {
		
		String datos1 = "2019-04||";
		String datos2 = "2019-04#43267||";
		String datos3 = "2019-04||2020-12||218-03||";
		String datos4 = "2019-04#43267||2020-12#9878||2018-03#12345||";

		System.out.println("Test 1 ----------------------------");
		procesarCadena(datos1);
		
		System.out.println("Test 2: ----------------------------");
		procesarCadena(datos2);

		System.out.println("Test 3: ----------------------------");
		procesarCadena(datos3);
		
		System.out.println("Test 4: ----------------------------");
		procesarCadena(datos4);

//		System.out.println("Test 5 ----------------------------");
//		procesarCadenaSegundaForma(datos1);
//		
//		System.out.println("Test 6: ----------------------------");
//		procesarCadenaSegundaForma(datos2);
//
//		System.out.println("Test 7: ----------------------------");
//		procesarCadenaSegundaForma(datos3);
//		
//		System.out.println("Test 8: ----------------------------");
//		procesarCadenaSegundaForma(datos4);

		System.out.println("Test 9 ----------------------------");
		procesarCadenaTerceraForma(datos1);
		
		System.out.println("Test 10: ----------------------------");
		procesarCadenaTerceraForma(datos2);

		System.out.println("Test 11: ----------------------------");
		procesarCadenaTerceraForma(datos3);
		
		System.out.println("Test 12: ----------------------------");
		procesarCadenaTerceraForma(datos4);		
		
	}
	
	public void procesarCadena(String datos) {
		String datoToken;
		String otroToken;

		StringTokenizer st = new StringTokenizer(datos, "||");
		while(st.hasMoreTokens()) {
			datoToken = (String)st.nextToken();
			System.out.println("datoToken: " + datoToken);

			StringTokenizer st2 = new StringTokenizer(datoToken, "#");

			System.out.println("num tokens # " + st2.countTokens() );

			while(st2.hasMoreTokens()) {
				otroToken = (String)st2.nextToken();
				System.out.println("\t\totroToken: " + otroToken);
			}
		}	
	}

	public void procesarCadenaSegundaForma(String datos) {
		String datoToken;
		//String otroToken;
		
		String mes;
		String pais;

		StringTokenizer st = new StringTokenizer(datos, "||");
		while(st.hasMoreTokens()) {
			datoToken = (String)st.nextToken();
			System.out.println("datoToken: " + datoToken);

			StringTokenizer st2 = new StringTokenizer(datoToken, "#");

			System.out.println("num tokens # " + st2.countTokens() );

			while(st2.hasMoreTokens()) {
				mes = (String)st2.nextToken();
				pais = (String)st2.nextToken();
			
				System.out.println("\t\tmes: " + mes);
				System.out.println("\t\tpais: " + pais);
			}
		}	
	}

	public void procesarCadenaTerceraForma(String datos) {
		String datoToken;
		//String otroToken;
		
		String mes = "";
		String pais = "";

		StringTokenizer st = new StringTokenizer(datos, "||");
		while(st.hasMoreTokens()) {
			datoToken = (String)st.nextToken();
			System.out.println("datoToken: " + datoToken);

			StringTokenizer st2 = new StringTokenizer(datoToken, "#");

			System.out.println("num tokens # " + st2.countTokens() );
			
			int indexMesPais = 0;
			while(st2.hasMoreTokens()) {
				
				if(indexMesPais==0)
					mes = (String)st2.nextToken();

				if(indexMesPais==1)
					pais = (String)st2.nextToken();
			
				System.out.println("\t\tmes: " + mes);
				System.out.println("\t\tpais: " + pais);
			
				indexMesPais++;
			}
		}	
	}
}
