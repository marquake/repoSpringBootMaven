package programming_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Optional;

public class MainP2 {

	public static String variable = "";

	static MainP2.Saludo sal = new MainP2.Saludo();

	public static void main(String[] args) throws Exception {

		byte bite = 1;

		int num = 1001;

		bite = (byte) num;

		System.out.println("bite: " + bite);

		String x = "   XXXX hOLA   ";
		
		System.out.println("" + x.stripLeading());
		System.out.println("" + x.stripTrailing());	

		String r = "qqq";
		String d = "qqq";
		String a = "qqq";
		
		String y = "qqq";
		System.out.println("" + y.isBlank());
	
		System.out.println("intern: " + y.intern() );
		System.out.println("intern: " + x.intern() );
		y.lines().count();
		
		Optional<Integer> ops = Optional.empty();
		System.out.println(ops);
		
		MainP2.Saludo sal2 = new MainP2.Saludo();

		sal.saludito();
		sal2.saludito();
		
		boolean valor = false;
		
		if (valor) {
			
		}else if(valor){
//			int data[3]={1,2,3};
//			
//
//			int[4] data1={10,20,30,40};


			int data2[]={1,2,3};
			int[] data3={10,20,30,40};

			
		}
		

	}
	
	public void test() {
			
	}

	static class Saludo{
		public void saludito() {
			variable = "";
		}
	}

}
