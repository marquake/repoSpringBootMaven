package patrones.P05_facade;

public class ShapeMaker {

	private Shape circulo;
	private Shape cuadrado;
	private Shape triangulo;

	public ShapeMaker() {
		circulo = new Circulo();
		cuadrado = new Cuadrado();
		triangulo = new Triangulo();
	}

	public void drawCirculo(){
		circulo.draw();
	}
	public void drawCuadrado(){
		cuadrado.draw();
	}
	public void drawTriangulo(){
		triangulo.draw();
	}
}
