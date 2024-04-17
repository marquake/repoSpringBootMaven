package test;

import junit.framework.TestCase;

public class ClasePrincipal {

	public static void main(String[] args) {
		System.out.println("TEST EJECUTANDO PERFECTAMENTE!!!");
		ClasePrincipal test = new ClasePrincipal();
		
		test.metodo1();
		test.metodo2();
		test.metodo3();
	}

	public void metodo1() {
		System.out.println("EJECUTANDO MÉTODO 1");
	}
	public void metodo2() {
		System.out.println("EJECUTANDO MÉTODO 2");	
	}
	public void metodo3() {
		System.out.println("EJECUTANDO MÉTODO 3");
	}
	
}