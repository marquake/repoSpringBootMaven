package patrones.P13_Inyeccion.ej001_pdf_word;

public class Impresora {

	private Documento documento;

	public Impresora(Documento documento) {
		this.documento = documento;
	}
	
	public void imprimir(){
		documento.imprimir();
	}

}
