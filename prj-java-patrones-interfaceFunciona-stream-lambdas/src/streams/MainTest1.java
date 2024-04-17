package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;


public class MainTest1 {

	public MainTest1() {
	}

	public static void main(String[] args) {

		MainTest1 mt1 = new MainTest1();
		//mt1.test1();
		//mt1.test2();
		//mt1.testDistinct();

		//mt1.testMatch();
		//mt1.testFind();
		//mt1.testMap();
		
		mt1.testReduccion();
		
	}

	public void testReduccion(){

		List<Integer> numbers =Arrays.asList(1, 2, 3, 2, 2, 4, 5, 6, 4, 7, 8, 7, 8);
		//List<Integer> numbers =Arrays.asList(1, 2, 3);
		List<Integer> numbers2 =Arrays.asList(1, 2, 3, 2, 2, 4, 199, 5, 6, 4, 7, 8, 7, 8);

		
		Optional<Integer> resultado = numbers.stream().reduce(new BinaryOperator<Integer>() {
										@Override
										public Integer apply(Integer t, Integer u) {
											return t + u;
										}
									});
		
		System.out.println("RESULTADO REDUCCION: " + resultado.get());
		
		
		
		Optional<Integer> result = numbers.stream().reduce( (x, y) -> x + y);
		
		System.out.println("RESULTADO[Stream]: " + result);
		
	}

	public void testMap(){
		List<String> words = Arrays.asList("Oracle", "Java", "Magazine");  

		// Selecciono los registros
		List<Integer> wordLengths = words.stream()
													.map(String::length)
													.collect(Collectors.toList());

		// muestro toda la lista
		wordLengths.forEach(System.out::println);

		System.out.println("---------------------------------------------------------------------");

		// Selecciono registros y muestro toda la lista
		words.stream().map(String::length).forEach(System.out::println);

		System.out.println("---------------------------------------------------------------------");
		words.stream().map( x -> x.concat(" Lenguaje")).forEach(System.out::println);
		
		System.out.println("---------------------------------------------------------------------");
		words.stream().map( x -> x.replace('a', 'x') ).map(x -> x.replace('e', '3')).forEach(System.out::println);
		
		System.out.println("---------------------------------------------------------------------");
		words.stream()
		.map( x -> x.replace('a', '4') )
		.map(x -> x.replace('e', '3'))
		.forEach(System.out::println);

	}
	
	public void testFind(){
		List<Integer> numbers =Arrays.asList(1, 2, 3, 2, 2, 4, 5, 6,4,7,8, 7, 8);
		List<Integer> numbers2 =Arrays.asList(1, 2, 3, 2, 2, 4, 199, 5, 6, 4, 7, 8, 7, 8);

		System.out.println("---------------------------------------------------------------------");
		System.out.println("OBTENGO UN VALOR CUALQUIERA" + numbers2.stream().findFirst().get() );
		
		System.out.println("---------------------------------------------------------------------");

		System.out.println("IF PRESENT :: OBTENGO UN VALOR CUALQUIERA MAYOR DE 100:");
		numbers2.stream().filter(x -> x > 100)
		.findAny()
		.ifPresent(System.out :: println);

		System.out.println("---------------------------------------------------------------------");

		Integer numeroMayor200 = numbers2.stream().filter(x -> x > 200).findAny().orElse(0);
		System.out.println("OR ELSE :: OBTENGO UN VALOR CUALQUIERA MAYOR DE 200: " + numeroMayor200);

		Integer numeroMayor100 = numbers2.stream().filter(x -> x > 100).findAny().orElse(0);
		System.out.println("OR ELSE :: OBTENGO UN VALOR CUALQUIERA MAYOR DE 100: " + numeroMayor100);

		//numbers2.stream().findFirst()

	}
	public void testMatch(){
		
		List<Integer> numbers =Arrays.asList(1, 2, 3, 2, 2, 4, 5, 6,4,7,8, 7, 8);
		//numbers.forEach(System.out::print);
		//System.out.println("");
		for(Integer num : numbers){
			System.out.print(num + "-");
		}
		System.out.println("\n");

		// Son todos pares
		boolean par = numbers.stream().allMatch(x -> x % 2 == 0);
		System.out.println("SON TODOS PARES: " + par);
		
		// Son todos impares
		boolean impar = numbers.stream().allMatch(x -> x % 2 != 0);
		System.out.println("SON TODOS IMPAR: " + impar);
		
		// Hay algún par
		boolean algunPar = numbers.stream().anyMatch(x -> x % 2 == 0);
		System.out.println("EXISTE ALGÚN PAR EN LA LISTA: " + algunPar);

		// Hay algún impar
		boolean algunImpar = numbers.stream().anyMatch(x -> x % 2 != 0);
		System.out.println("EXISTE ALGÚN IMPAR EN LA LISTA: " + algunImpar);
		
		// ninguno es mayor de 10, es verdadero, el mayor es 8.
		boolean ningunoMayor10 = numbers.stream().noneMatch(x -> x > 10);
		System.out.println("NINGUNO ES MAYOR DE 10: " + ningunoMayor10);

		System.out.println("");
		List<Integer> numbers2 =Arrays.asList(1, 2, 3, 2, 2, 4, 99, 5, 6, 4, 7, 8, 7, 8);
 		//numbers2.forEach(System.out::print);
		//System.out.println("");

		for(Integer num : numbers2){
			System.out.print(num + "-");
		}
		System.out.println("");
		
		
		// ninguno es mayor de 10, es falso, esta el 99
		ningunoMayor10 = numbers2.stream().noneMatch(x -> x % 2 != 0);
		System.out.println("NINGUNO ES MAYOR DE 10: " + ningunoMayor10);

		
	}

	public void testDistinct(){

		List<Integer> numbers =Arrays.asList(1, 2, 3, 2, 2, 4, 5, 6,4,7,8, 7, 8);

		numbers.stream().distinct().forEach(System.out :: println);
		System.out.println("-----------");
		numbers.stream().limit(3).forEach(System.out :: println);
		System.out.println("-----------");
		numbers.stream().skip(4).forEach(System.out :: println);
		System.out.println("-----------");
		numbers.stream().forEach(System.out :: println);
		System.out.println("-----------");
		numbers.stream().sorted().forEach(System.out :: println);

	}

	public void test1(){

		List<Integer> numbers =Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8); 
		List<Integer> twoEvenSquares = 
		numbers.stream()    
		.filter(n -> {     
						System.out.println("filtering " + n);   
						return n % 2 == 0;    
						})    
		.map(n -> {     
						System.out.println("mapping " + n);     
						return n * n;    
						})    
		.limit(2).collect(Collectors.toList());

	}

	public void test2(){
		List<Integer> numbers =Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);

		List<Integer> twoEvenSquares = 
		numbers.stream()    
		.filter(n -> {     
		System.out.println("filtering " + n);   
		return n % 2 == 0;    
		})    
		.map(n -> {     
		System.out.println("mapping " + n);     
		return n * n;    
		})    
		.limit(2).collect(Collectors.toList());
	}

	public Function<Integer, Boolean> filtroPar(){
//		n -> {     
//			System.out.println("filtering " + n);
//			return n % 2 == 0;
//			}
		//System.out.println("filtering " + n);
		return (n) -> n % 2 == 0;

	}

}
