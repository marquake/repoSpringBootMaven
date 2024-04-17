package patronBuilderCoche;

public class CocheBuilder {

	private String modelo;
	private int velocidadMax;
	private int numPuertas;
	
	public CocheBuilder() {

	}

	public CocheBuilder setModelo(String modelo) {
		this.modelo = modelo;
		return this;
	}

	public CocheBuilder setVelocidadMax(int velocidadMax) {
		this.velocidadMax = velocidadMax;
		return this;
	}

	public CocheBuilder setNumPuertas(int numPuertas) {
		this.numPuertas = numPuertas;
		return this;
	}

	public Coche build() {
		return new Coche(this.modelo, this.velocidadMax, this.numPuertas);
	}

}
