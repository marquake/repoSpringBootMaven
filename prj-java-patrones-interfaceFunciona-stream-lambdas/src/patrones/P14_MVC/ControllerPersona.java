package patrones.P14_MVC;

public class ControllerPersona {

	private Persona persona;
	private View vista;

	public ControllerPersona(Persona persona, View view) {
		this.persona = persona;
		this.vista = view;
	}

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	public View getVista() {
		return vista;
	}

	public void setVista(View vista) {
		this.vista = vista;
	}

	public void updateEstilo1(){
		vista.printPersonaEstilo1(persona);
	}

	public void updateEstilo2(){
		vista.printPersonaEstilo2(persona);
	}

}
