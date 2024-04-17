package z_TestJava.ppal;

import java.util.Base64;

public class EjemploCodificacionDecodificacionBase64 {
	
	
	
    public static void main(String args[]){
    	EjemploCodificacionDecodificacionBase64 ejc = new EjemploCodificacionDecodificacionBase64();
    	
    	ejc.test1();
    	ejc.test2();
    }

    public void test2() {
    	System.out.println("\nTEST 2 \n");

	    String entradaOriginal = "=!бґbйэъну!!!!!";
	    String cadenaCodificada = Base64.getEncoder().encodeToString(entradaOriginal.getBytes());

	    System.out.println("entradaOriginal: " + entradaOriginal);
	    System.out.println("codificado: " + cadenaCodificada);
	    
	    byte[] bytesDecodificados = Base64.getDecoder().decode(cadenaCodificada);
	    String cadenaDecodificada = new String(bytesDecodificados);
	    
	    System.out.println("decodificado: " + cadenaDecodificada);
        	
    }

    public void test1() {
        String entradaOriginal = "Texto de prueba.";
        String cadenaCodificada = Base64.getEncoder().encodeToString(entradaOriginal.getBytes());

	    System.out.println("entradaOriginal: " + entradaOriginal);

        System.out.println("codificado: " + cadenaCodificada);
        
        byte[] bytesDecodificados = Base64.getDecoder().decode(cadenaCodificada);
        String cadenaDecodificada = new String(bytesDecodificados);
        
        System.out.println("decodificado: " + cadenaDecodificada);
    	
    }

}