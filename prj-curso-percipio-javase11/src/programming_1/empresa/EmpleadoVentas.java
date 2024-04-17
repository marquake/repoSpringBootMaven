package programming_1.empresa;

public class EmpleadoVentas extends Empleado {

	public static String getTipoEmpleado() {
		return "ventas";
	}

	@Override
	public String toString() {
		System.out.println("Empleado: " + this.nombre);

		return "Empleado: " + this.nombre + 
			   " Tipo: " + getTipoEmpleado();
	}

}
