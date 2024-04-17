package patrones.P09_memento;

public class Originator {

	private String state;

	public void setState(String state){
		System.out.println("Estado actual: " + state );
		this.state = state;
	}

	public String getState(){
		System.out.println("Estado actual: " + this.state );
		return this.state;
	}

	public Memento saveStateToMemento(){
		return new Memento(state);
	}

	public void getStateFromMemento(Memento memento){
		this.state = memento.getState();
	}

}
