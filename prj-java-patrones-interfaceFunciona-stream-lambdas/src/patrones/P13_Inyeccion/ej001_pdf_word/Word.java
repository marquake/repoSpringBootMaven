package patrones.P13_Inyeccion.ej001_pdf_word;

public class Word implements Documento {

	public Word() {
	}

	@Override
	public void imprimir() {
		System.out.println("Imprimiendo word...");

	}

}
