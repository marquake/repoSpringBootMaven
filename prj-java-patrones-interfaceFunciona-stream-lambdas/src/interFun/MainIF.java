package interFun;

public class MainIF {

	private int valueMain;

	public MainIF() {
	
	}

	public static void main(String[] args) {
		MainIF mainIF = new MainIF();
		
		mainIF.inicio();
	}

	public void inicio(){
		
		Calcular calcular = new Calcular() {
			
			@Override
			public int sumar(int a, int b) {
				return a + b;
			}
		};
	
		System.out.println("Total1= " + calcular.sumar(2, 3) );

		Calcular calcular2 = (int a, int b) -> a + b;
		System.out.println("Total2= " + calcular2.sumar(4, 5) );
		
		Calcular calcular3 = (a, b) -> a + b;
		System.out.println("Total3= " + calcular3.sumar(9, 8) );
		
		Calcular calcular4 = (a, b) -> { return a + b; };
		System.out.println("Total4= " + calcular4.sumar(9, 9) );
		
		// Este ejemplo no tiene sentido pero vale para probar.
		Calcular calcular5 = (a, b) -> {
				int x = 0;
				int y = 0;
			
				x = a;
				y = b;

				int z = x + y;
				System.out.println("T. Interno = " + z);
				
				System.out.println("valueMain[calcular5]: " + valueMain);

				valueMain = 8;

				return z; 
		};
		
		valueMain = 5;
		System.out.println("valueMain: " + valueMain);

		System.out.println("Total5= " + calcular5.sumar(7, 6) );
	
		System.out.println("valueMain: " + valueMain);
		

		
		
	}
	
	
	
}
