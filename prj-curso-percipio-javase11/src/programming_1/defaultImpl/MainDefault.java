package programming_1.defaultImpl;

public class MainDefault {

	public static void main(String[] args) {

		ClaseExtensoraDefault ce = new ClaseExtensoraDefault();

		System.out.println( ce.saludar() );
		System.out.println( ce.saludito() );

		ClaseExtensoraSobreescrita ces = new ClaseExtensoraSobreescrita();

		System.out.println( ces.saludar() );
		System.out.println( ces.saludito() );

	}

}
