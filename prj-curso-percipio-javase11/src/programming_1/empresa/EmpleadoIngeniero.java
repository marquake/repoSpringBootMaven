package programming_1.empresa;

public class EmpleadoIngeniero extends Empleado {

	public static String getTipoEmpleado() {
		return "ingeniero";
	}

	@Override
	public String toString() {
		System.out.println("Empleado: " + this.nombre);

		return "Empleado: " + this.nombre + 
			   " Tipo: " + getTipoEmpleado();
	}

}
