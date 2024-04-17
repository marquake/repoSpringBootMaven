package patrones.P05_facade;

public class FacadeMain {

	public FacadeMain() {
	}

	public static void main(String[] args) {
		ShapeMaker shapeMaker = new ShapeMaker();
		
		shapeMaker.drawCirculo();
		shapeMaker.drawCuadrado();
		shapeMaker.drawTriangulo();
	}

}
