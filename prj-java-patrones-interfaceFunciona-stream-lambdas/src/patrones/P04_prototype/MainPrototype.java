package patrones.P04_prototype;

public class MainPrototype {

	public MainPrototype() {
		// TODO Apéndice de constructor generado automáticamente
	}

	public static void main(String[] args) {
		MainPrototype mainPrototype = new MainPrototype();
		
		mainPrototype.test();


	}

	public void test(){

		Forma formaCirculo = new Circulo();
		formaCirculo.setId(1);
		formaCirculo.setLongitud(88);
		formaCirculo.setNombre("circulito");
		formaCirculo.setType("circulo concentrico");

		Forma formaCuadradoForma = new Cuadrado();
		formaCuadradoForma.setId(2);
		formaCuadradoForma.setLongitud(54);
		formaCuadradoForma.setNombre("cuadradito");
		formaCuadradoForma.setType("cuadrado 3d");
		
		Forma formaClonada = (Forma) formaCirculo.clone();
		
		System.out.println("formaClonada.getId(): " + formaClonada.getId());
		System.out.println("formaClonada.getLongitud(): " + formaClonada.getLongitud() );
		System.out.println("formaClonada.getNombre(): " + formaClonada.getNombre());
		System.out.println("formaClonada.getType(): " + formaClonada.getType());
		
		System.out.println("formaCirculo: " + formaCirculo);
		System.out.println("formaClonada: " + formaClonada);
		
		formaClonada.setNombre("Circulo clonado");

		System.out.println("formaClonada.getNombre(): " + formaClonada.getNombre());
		System.out.println("formaCirculo.getNombre(): " + formaCirculo.getNombre());
		
		System.out.println("formaCirculo.vector.get(2): " + formaCirculo.vector.get(2));
		System.out.println("formaClonada.vector.get(2): " + formaClonada.vector.get(2));
		
		
		//System.out.println("");
		

	}
}
