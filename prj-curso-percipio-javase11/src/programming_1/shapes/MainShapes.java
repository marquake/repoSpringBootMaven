package programming_1.shapes;

public class MainShapes {

	public static void main(String[] args) {

		Shape s1 = new Circle();
		System.out.println("s1.getPI(): " + s1.getPI() );

		Circle c1 = new Circle();
		System.out.println("c1.getPI(): " + c1.getPI() );

		Shape s2 = new Shape();
		System.out.println("s2.getPI(): " + s2.getPI() );

	}

}