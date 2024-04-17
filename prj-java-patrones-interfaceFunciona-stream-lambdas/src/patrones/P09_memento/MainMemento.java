package patrones.P09_memento;

public class MainMemento {

	public MainMemento() {
	}

	public static void main(String[] args) {
		MainMemento mainMemento = new MainMemento();
		
		mainMemento.test();
	}

	public void test(){
		
		Originator originator = new Originator();
		CareTaker careTaker = new CareTaker();
		
		originator.setState("Estado 1");
		originator.setState("Estado 2");
		originator.setState("Estado 3");

		careTaker.addMemento( originator.saveStateToMemento() );
		careTaker.showList();

		originator.setState("Estado 4");
		originator.setState("Estado 5");

		careTaker.addMemento( originator.saveStateToMemento() );
		careTaker.showList();

		originator.setState("Estado 6");
		originator.setState("Estado 7");
		originator.setState("Estado 8");
		
		careTaker.addMemento( originator.saveStateToMemento() );
		careTaker.showList();

		originator.getStateFromMemento( careTaker.getMemento(1) );
		originator.getState();
		
		originator.getStateFromMemento( careTaker.getMemento(2) );
		originator.getState();

	}
	
}
