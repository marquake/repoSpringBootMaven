package patronBuilderCoche;

public class MainCocheBuilder {

	public static void main(String[] args) {

		MainCocheBuilder mainCocheBuilder = new MainCocheBuilder();
		
		mainCocheBuilder.ejecutar();

	}

	public void ejecutar() {
		
		Coche cocheSeat = new CocheBuilder().setModelo("SEAT Ibiza").setNumPuertas(4).setVelocidadMax(200).build();
		
		System.out.println(cocheSeat.toString());
		
		Coche cocheBmw = new CocheBuilder().setModelo("BMW").setNumPuertas(2).setVelocidadMax(400).build();

		System.out.println(cocheBmw.toString());

		Coche cocheLogan = new CocheBuilder().setModelo("Renault Logan").setNumPuertas(6).setVelocidadMax(100).build();

		System.out.println(cocheLogan.toString());

	}
}
