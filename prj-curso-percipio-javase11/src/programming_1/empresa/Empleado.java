package programming_1.empresa;

public class Empleado {

	public String nombre;
	private String tipoEmpleado;

	public Empleado() {
		//this.tipoEmpleado = "default";
	}

	public static String getTipoEmpleado() {
		return "default";
	}

	public String toString() {
		System.out.println("Empleado: " + this.nombre);

		return "Empleado: " + this.nombre + 
			   " Tipo: " + getTipoEmpleado();
	}

}
