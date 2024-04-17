package programming_2.trees.contarNodos;

public class MainContarNodos {

	public MainContarNodos() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		int numHijos = 0;

		Nodo nodo5 = new Nodo(5, null, null);
		Nodo nodo4 = new Nodo(4, null, null);

		Nodo nodo8 = new Nodo(8, null, null);

		Nodo nodo2 = new Nodo(2, null, null);
		
		Nodo nodo7 = new Nodo(7, nodo8, null);

		Nodo nodo6 = new Nodo(6, nodo5, nodo4);

		Nodo nodo3 = new Nodo(3, nodo7, nodo6);

		Nodo nodoRaiz = new Nodo(0, nodo2, nodo3);
		
		//System.out.println("FORMA 1: Hay " + contarNodos(nodoRaiz, numHijos) + " nodos.");
		//System.out.println("FORMA 2: Hay " + contarNodos2(nodoRaiz) + " nodos.");

		int cont = 0;
		System.out.println("Profundidad máxima es: " + profundidadMaxima(nodoRaiz) );
	}

	public static int profundidadMaxima(Nodo nodo) {

		if (nodo == null)
			return 0;

		int profIzq = profundidadMaxima(nodo.getNodoIzq());
		int profDch = profundidadMaxima(nodo.getNodoDch());

		System.out.println("\tIzq["+nodo.getValor()+"]: " + profIzq);
		System.out.println("\tDch["+nodo.getValor()+"]: " + profDch);

		return 1 + Math.max(profIzq, profDch);
	}

	public static int contarNodos(Nodo nodo, int numHijos) {

		System.out.println("nodo["+nodo.getValor()+"]");

		if (nodo != null)
		{
			numHijos++;
			if (nodo.getNodoIzq() != null) {
				numHijos = contarNodos( nodo.getNodoIzq(), numHijos );
			}
			if (nodo.getNodoDch() != null) {
				numHijos = contarNodos( nodo.getNodoDch(), numHijos );
			}
		}

		return numHijos;
	}
	
	public static int contarNodos2(Nodo nodo) {
		
		if (nodo == null)
			return 0;

		int numIzq = contarNodos2( nodo.getNodoIzq() );
		int numDch = contarNodos2( nodo.getNodoDch() );
		
		return 1 + numIzq + numDch;
	}

}



class Nodo{

	private Nodo nodoIzq = null;
	private Nodo nodoDch = null;
	private int valor = 0;

	public Nodo(int valor, Nodo hijoIzq, Nodo hijoDch) {
		this.valor = valor;
		this.nodoIzq = hijoIzq;
		this.nodoDch = hijoDch;
	}

	public Nodo getNodoIzq() {
		return nodoIzq;
	}
	public void setNodoIzq(Nodo nodoIzq) {
		this.nodoIzq = nodoIzq;
	}
	public Nodo getNodoDch() {
		return nodoDch;
	}
	public void setNodoDch(Nodo nodoDch) {
		this.nodoDch = nodoDch;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

}