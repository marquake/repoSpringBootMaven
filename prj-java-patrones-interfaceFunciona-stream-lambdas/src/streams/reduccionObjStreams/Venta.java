package streams.reduccionObjStreams;

public class Venta {

	private int id;
	private int importe;

	public Venta() {
	}
	
	public Venta(int id, int importe) {
		this.id = id;
		this.importe = importe;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getImporte() {
		return importe;
	}

	public void setImporte(int importe) {
		this.importe = importe;
	}

}
