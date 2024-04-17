package interFun;

import java.util.Optional;

public class OptionalMain {

	public OptionalMain() {
		// TODO Apéndice de constructor generado automáticamente
	}

	public static void main(String[] args) {
		OptionalMain op = new OptionalMain();
		
		op.test1();
		System.out.println("----------------");
		op.test2();

	}

	public void test1(){

		String variable = null;
		Optional<String> op = Optional.ofNullable( variable );
		System.out.println("# isPresent: " +  op.isPresent() );
		//System.out.println("# op.get(): " +  op.get() );
		System.out.println("# op.orElse() " +  op.orElse( "no esta presente" ) );

		String variableRellena = new String("datos...");
		Optional<String> op2 = Optional.ofNullable( variableRellena );
		System.out.println("# isPresent: " +  op2.isPresent() );
		System.out.println("# op2.get(): " +  op2.get() );
		System.out.println("# op2.orElse() " +  op2.orElse( "no esta presente" ) );
	}

	public void test2(){

		String variableRellena = new String("datos...");
		Optional<String> op2 = Optional.of( variableRellena );
		System.out.println("# isPresent: " +  op2.isPresent() );
		op2.orElse( "IS PRESENT!" );
		
		String variable = null;
		Optional<String> op = Optional.of( variable );
		System.out.println("# isPresent: " +  op.isPresent() );
		op.orElse( "IS PRESENT!" );
	}
}
