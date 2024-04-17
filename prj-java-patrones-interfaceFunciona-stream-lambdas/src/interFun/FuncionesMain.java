package interFun;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

@SuppressWarnings("unchecked")
public class FuncionesMain {

	private Predicate<String> predicado = x -> x.contains("F");

	private Function<String, String> mayusculas = x -> x.toUpperCase();
	private Function<String, String> minusculas = x -> x.toLowerCase();

	ArrayList<String> listaNombres = new ArrayList<String>();


	public FuncionesMain(){
		listaNombres.add("Miguel");
		listaNombres.add("Pedro");
		listaNombres.add("Isabel");
		listaNombres.add("Fernandito");
		listaNombres.add("Ana");
	}

	public static void main(String[] args) {
		
		FuncionesMain funcionesMain = new FuncionesMain();
		//funcionesMain.test1();
		funcionesMain.test2();
	}

	
	public void test1(){
		ejecutar(mayusculas, "esto va en minúsculas");
		ejecutar(minusculas, "esto va en mayúsculas");
	}
	
	public void ejecutar(Function<String, String> funcion, String valor ){
		
		String resultado;

		resultado = funcion.apply( valor );
		
		System.out.println("RESULTADO: " + resultado );
	
	}

	public void test2(){

		ArrayList<String> listaTest1 = (ArrayList<String>) listaNombres.clone();

		listaTest1.stream().filter(predicado).forEach(System.out :: println);

		System.out.println("--------");

		ArrayList<String> listaTest2 = (ArrayList<String>) listaNombres.clone();

		listaTest2.stream().filter(x -> x.contains("el")).forEach(System.out :: println);

		System.out.println("--------");

		ArrayList<String> listaTest3 = (ArrayList<String>) listaNombres.clone();

		Predicate<String> predicado = x -> x.contains("el");

		listaTest3.stream().filter( predicado ).forEach(System.out :: println);

		System.out.println("--------");

		ArrayList<String> listaTest4 = (ArrayList<String>) listaNombres.clone();

		listaTest4.stream().filter( getPredicadoContains("a") ).forEach(System.out :: println);
		
		System.out.println("--------");
		
		listaTest4.stream()
			.filter( getPredicadoContains("a") )
			//.map()
			.sorted()
			.forEach(System.out :: println);

	}

	public Predicate<String> getPredicadoContains(String cadenaContenida){
		return x -> x.contains(cadenaContenida);
	}
}