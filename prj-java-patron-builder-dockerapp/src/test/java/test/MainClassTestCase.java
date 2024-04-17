/**
 * 
 */
package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author A154308
 *
 */
class MainClassTestCase {

	private static int contadorTest = 0;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("setUpBeforeClass():: " + (contadorTest++) );
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("tearDownAfterClass():: " + (contadorTest++) );

	}

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		System.out.println("setUp():: " + (contadorTest++) );
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterEach
	void tearDown() throws Exception {
		System.out.println("tearDown():: " + (contadorTest++) );
	}

	/**
	 * Test method for {@link test.ClasePrincipal#main(java.lang.String[])}.
	 */
	@Test
	final void testMain() {
		System.out.println("testMain():: " + (contadorTest++) );
//		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link test.ClasePrincipal#metodo1()}.
	 */
	@Test
	final void testMetodo1() {
		System.out.println("testMetodo1():: " + (contadorTest++) );

//		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link test.ClasePrincipal#metodo2()}.
	 */
	@Test
	final void testMetodo2() {
		System.out.println("testMetodo2():: " + (contadorTest++) );

//		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link test.ClasePrincipal#metodo3()}.
	 */
	@Test
	final void testMetodo3() {
		System.out.println("testMetodo3():: " + (contadorTest++) );

//		fail("Not yet implemented"); // TODO
	}

}
