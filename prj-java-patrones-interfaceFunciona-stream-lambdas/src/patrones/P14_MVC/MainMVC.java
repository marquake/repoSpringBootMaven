package patrones.P14_MVC;

public class MainMVC {

	public MainMVC() {
	}

	public static void main(String[] args) {
		MainMVC mainMVC = new MainMVC();
		
		mainMVC.test();
	}

	public void test(){
		
		Persona persona = new Persona();
		persona.setId(1);
		persona.setEdad(18);
		persona.setName("Juan");

		View vista = new View();
		
		ControllerPersona controllerPersona = new ControllerPersona(persona, vista);

		controllerPersona.updateEstilo1();
		System.out.println("\n\n");
		controllerPersona.updateEstilo2();
		
		
	}
}
