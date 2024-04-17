package programming_1.mainClass;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class MainClass {

	public static void main(String[] args) {

		System.out.println("test!");
		int i = 0;

		for(String arg : args) {
			System.out.println("arg["+ (i++) +"] : " + arg);
		}
	
		
		LocalDateTime ldt = LocalDateTime.now();
		
		System.out.println("ldt: " + ldt);
		
		DateTimeFormatter dtf = DateTimeFormatter.ISO_LOCAL_DATE;
		System.out.println(ldt.format( dtf ));

		dtf = DateTimeFormatter.ISO_LOCAL_TIME;
		System.out.println(ldt.format( dtf ));
	}

}
