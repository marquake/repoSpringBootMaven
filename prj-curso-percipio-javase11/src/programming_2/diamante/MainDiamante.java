package programming_2.diamante;

public class MainDiamante {

	public MainDiamante() {
	}

	public static void main(String[] args) {

		MainDiamante mainDiamante = new MainDiamante();
		
		Diamante<String> diamante = new Diamante();
		diamante.mostrar("");

		Diamante<Integer> diamante2 = new Diamante();
		diamante2.mostrar(3);
		
	}

}



class Diamante<S>{
	
	public void mostrar(S valor) {
	}

	public void mostrarString(String valor) {
	}
	public void mostrarInteger(Integer valor) {
	}
	
}



