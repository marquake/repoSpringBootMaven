package programming_2.testOverride;

public interface Implementacion extends MaxInterface {

	int constante_int = 1_234;
	
	public void ejecutar();

	public default void ejecucionDefecto() {
	}

	public static void manipular() {
	}

	public static void returnBack() {
	}

	public abstract void retornoDato();

	public default void metodo() {
		
	}
}