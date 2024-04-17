package programming_2.excepciones;

public class TestExcepcion {

	public TestExcepcion() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		System.out.println("Test Padre ::");
		try {
			lanzaPadreException();
		} catch (PadreExcepcion e) {
			System.out.println("PadreException Capturada");
			//e.printStackTrace();
		}

		System.out.println("Test Hijo ::");
		try {
			lanzaHijoException();
		} catch (PadreExcepcion e) {
			System.out.println("HijoExcepcion Capturada");
			//e.printStackTrace();
		}

		System.out.println("Test Padre/Hijo:: Orden[1 - Hijo, 2 - Padre]");

		try {
			lanzaHijoSubePadreException();
		} catch (HijoExcepcion e) {
			System.out.println("HijoExcepcion Capturada");

		} catch (PadreExcepcion e) {
			System.out.println("PadreException Capturada");
		}

		System.out.println("Test Padre/Hijo:: Orden[1 - Padre, 2 - Hijo ]");

		try {
			lanzaHijoSubePadreException();
		} catch (PadreExcepcion e) {
			System.out.println("PadreException Capturada");
		} 
		// No se puede recoger Hijo después de Padre porque ya está
		// recogido el hijo dentro del padre.
		//catch (HijoExcepcion e) {
		//	System.out.println("HijoExcepcion Capturada");
		//}

	}

	public static void lanzaPadreException() throws PadreExcepcion {
		throw new PadreExcepcion();
	}

	public static void lanzaHijoException() throws HijoExcepcion {
		throw new HijoExcepcion();
	}

	// Se lanza excepcion hijo y se promociona padre, es correcto.
	public static void lanzaHijoSubePadreException() throws PadreExcepcion {
		throw new HijoExcepcion();
	}

	// No se puede lanzar excepción Padre si solo se suben hijos
	//public static void lanzaPadreSubeHijoException() throws HijoExcepcion {
	//	throw new PadreExcepcion();
	//}

	public static void test1() {
		try {
			testExcep();
		} catch (Exception e) {
			System.out.println("Exception e");
			e.printStackTrace();
		}
	}

	public static void testExcep() throws Exception{
		
		int a = 100;
		int b = 0;
		
		try {

			int c = a / b;

		} catch (ArithmeticException e1) {
			System.out.println("Error Artih 1");
		} catch (Exception e) {
			System.out.println("Error Excep 2");
		}

	}

}
