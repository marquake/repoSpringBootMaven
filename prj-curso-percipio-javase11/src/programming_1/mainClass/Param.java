package programming_1.mainClass;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;



public class Param {

	public static void main(String[] args) {

		String[] lista = {":t", "12", "&&"};
		//test(lista);

	}

	public static void test(String[] args) throws IOException {
		
		for (String arg : args) {
			
			
			System.out.println(":t".equals(arg) );
			
			OutputStream os = new OutputStream() {
				
				@Override
				public void write(int b) throws IOException {

				}
			};
			ObjectOutputStream oos = new ObjectOutputStream(os);

			//InputStream is = 
			
		}
		
		
	}
}
