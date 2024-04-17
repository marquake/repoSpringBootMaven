package patrones.P09_memento;

public class Memento {
	
	private String state;
	
	public String getState() {
		return this.state;
	}

	public Memento(String state){
		this.state = state;
	}
}