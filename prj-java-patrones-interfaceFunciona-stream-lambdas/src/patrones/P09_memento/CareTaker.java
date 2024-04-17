package patrones.P09_memento;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {

	List<Memento> listMementos = new ArrayList<Memento>();
	
	public void addMemento(Memento memento){
		System.out.println("Guardando... [" + memento.getState() + "]");
		listMementos.add(memento);
	}

	public Memento getMemento(int index){
		System.out.println("Reestableciendo estado #" + index + ") " + ((Memento)listMementos.get(index)).getState() );
		return listMementos.get(index);
	}

	public void showList(){
		int i = 0;

		for(Memento memento : listMementos){
				System.out.println("#" + (i++) + ") " + memento.getState() );
			
		}
	}
}
