package patronBuilderCoche;

public class Coche {

	private String modelo;
	private int velocidadMax;
	private int numPuertas;

	public Coche(String modelo, int velocidadMax, int numPuertas) {
		this.modelo = modelo;
		this.velocidadMax = velocidadMax;
		this.numPuertas = numPuertas;
	}

	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getVelocidadMax() {
		return velocidadMax;
	}
	public void setVelocidadMax(int velocidadMax) {
		this.velocidadMax = velocidadMax;
	}
	public int getNumPuertas() {
		return numPuertas;
	}
	public void setNumPuertas(int numPuertas) {
		this.numPuertas = numPuertas;
	}

	public String toString() {
		return "Coche[modelo: " + this.modelo + ", velocidad MAX: " + this.velocidadMax + ", num. puertas: " + this.numPuertas + " ]";
	}

}