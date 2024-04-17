package streams.reduccionObjStreams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import javax.sql.rowset.spi.TransactionalWriter;

public class ReduccionObjetos {

	ArrayList<Venta> listaVentas;

	public ReduccionObjetos() {
		listaVentas = new ArrayList<Venta>();
		
		listaVentas.add( new Venta(1, 20) );
		listaVentas.add( new Venta(2, 34) );
		listaVentas.add( new Venta(3, 56) );
		listaVentas.add( new Venta(4, 18) );
		listaVentas.add( new Venta(5, 93) );
		listaVentas.add( new Venta(6, 15) );

	}

	//public static void main(String[] args) {
	public static void main(String... args) {
		ReduccionObjetos reduccionObjetos = new ReduccionObjetos();

		//reduccionObjetos.testReduccion();
		reduccionObjetos.testRangos();

	}

	public void testRangos(){

		//IntStream.range(1, 100).forEach(System.out :: println);
		//IntStream.rangeClosed(1, 100).forEach(System.out :: println);

		// muestro múltiplos de 20
		IntStream.rangeClosed(1, 100)
		.filter(x -> x % 20 == 0)
		.forEach(System.out :: println);

	}

	public void testReduccion(){

		List<Integer> numbers =Arrays.asList(1, 2, 3, 2, 2, 4, 5, 6, 4, 7, 8, 7, 8);
		//List<Integer> numbers2 =Arrays.asList(1, 2, 3, 2, 2, 4, 199, 5, 6, 4, 7, 8, 7, 8);

		Integer total = numbers.stream().reduce(0, (a, b) -> a + b);
		System.out.println("total: " + total);

		numbers.stream().mapToInt(a -> a).forEach(System.out :: println);;
		
		Optional<Venta> venta = listaVentas.stream().reduce(new BinaryOperator<Venta>() {
			@Override
			public Venta apply(Venta t, Venta u) {
				return new Venta(99, t.getImporte() + u.getImporte() ); 
			}
		});
		
		System.out.println("VENTA ");

		System.out.println("\t VENTA ID: " + ((Venta)venta.get()).getId() );
		System.out.println("\t VENTA TOTAL: " + ((Venta)venta.get()).getImporte() );


//		Optional<Venta> ventaStream = listaVentas.stream().reduce( 
//					( Venta a,  Venta b) -> {
//							new Venta().setImporte( a.getImporte() + b.getImporte() );
//							} 
//		);
		
		
	}
	







}
