package patrones.P01_Singleton;

public class ClaseUnica {

	private String nombre;
	private static ClaseUnica claseUnica;
	
	private ClaseUnica(String nombre) {
		this.nombre = nombre;
		System.out.println("Construyendo ClaseUnica..." + this.nombre);
	}

	public static ClaseUnica getInstancia(String nombre){

		if(claseUnica == null){
			System.out.println("No existe, se crea la instancia ["+nombre+"]");
			claseUnica = new ClaseUnica(nombre);
		}else{
			System.out.println("El objeto ya existe, retorno la instancia ["+nombre+"]");
		}
		
		System.out.println("Retornando instancia ["+nombre+"]...");
		return claseUnica;
	}
}