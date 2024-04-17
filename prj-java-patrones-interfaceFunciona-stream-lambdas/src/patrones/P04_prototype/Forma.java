package patrones.P04_prototype;

import java.util.Vector;

public abstract class Forma implements Cloneable {

	private int id;
	private int longitud;
	private String nombre;
	private String type;

	public Vector<Integer> vector = new Vector<Integer>();

	public Forma() {
		vector.add(new Integer(1));
		vector.add(new Integer(2));
		vector.add(new Integer(3));
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getLongitud() {
		return longitud;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Object clone(){

		Object clone = null;

		try {

			clone = super.clone();

		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}

		return clone;
	}
	
}
