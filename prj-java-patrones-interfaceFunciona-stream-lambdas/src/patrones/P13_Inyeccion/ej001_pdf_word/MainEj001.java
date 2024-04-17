package patrones.P13_Inyeccion.ej001_pdf_word;

public class MainEj001 {

	public MainEj001() {
	}

	public static void main(String[] args) {

		MainEj001 mainEj001 = new MainEj001();

		mainEj001.test();
	}

	public void test(){

		PDF pdf = new PDF();
		Word word = new Word();

		// Inyecto pdf
		Impresora impresora = new Impresora(pdf);
		impresora.imprimir();

		// Inyecto word
		Impresora impresora2 = new Impresora(word);
		impresora2.imprimir();

	}
}
