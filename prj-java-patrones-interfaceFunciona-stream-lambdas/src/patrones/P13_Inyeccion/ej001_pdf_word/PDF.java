package patrones.P13_Inyeccion.ej001_pdf_word;

public class PDF implements Documento {

	public PDF() {
	}

	@Override
	public void imprimir() {
		System.out.println("Imprimiendo pdf...");

	}

}