package programming_1.empresa;

public class MainEmpresa {

	public static void main(String[] args) {

		System.out.println("Empleado: " + Empleado.getTipoEmpleado() );
		System.out.println("EmpleadoVentas: " + EmpleadoVentas.getTipoEmpleado() );
		System.out.println("EmpleadoIngeniero: " + EmpleadoIngeniero.getTipoEmpleado() );

		System.out.println("");

		Empleado emp = new Empleado();
		EmpleadoVentas empV = new EmpleadoVentas();
		EmpleadoIngeniero empI = new EmpleadoIngeniero();

		System.out.println("emp: " + emp.toString() );
		System.out.println("empV: " + empV.toString() );
		System.out.println("empI: " + empI.toString() );

		System.out.println("");
		
		//Empleado emp = new Empleado();
		Empleado empV_1 = new EmpleadoVentas();
		Empleado empI_1 = new EmpleadoIngeniero();

		System.out.println("emp: " + emp.toString() );
		System.out.println("empV_1: " + empV_1.toString() );
		System.out.println("empI_1: " + empI_1.toString() );

		
	}

}