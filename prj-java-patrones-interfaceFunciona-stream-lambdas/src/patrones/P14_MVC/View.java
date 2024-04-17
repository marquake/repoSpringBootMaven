package patrones.P14_MVC;

public class View {

	public View() {
	}

	public void printPersonaEstilo1(Persona persona){
		System.out.println("+ ********************** +");
		System.out.println("| id :" + persona.getId());
		System.out.println("| nombre: " + persona.getName());
		System.out.println("| edad: " + persona.getEdad());
		System.out.println("+ ********************** +");

	}
	
	public void printPersonaEstilo2(Persona persona){
		System.out.println("+ ------------------------+");
		System.out.println("+ - PERSONA : " + persona.getId());
		System.out.println("+ ------------------------+");
		System.out.println("| nombre: " + persona.getName());
		System.out.println("| edad: " + persona.getEdad());
		System.out.println("+ ------------------------+");

	}
}
