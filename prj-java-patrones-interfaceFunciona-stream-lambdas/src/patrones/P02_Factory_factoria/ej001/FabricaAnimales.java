package patrones.P02_Factory_factoria.ej001;

public class FabricaAnimales {

	public FabricaAnimales() {
		System.out.println("Creando Fábrica Animales...");
	}

	public Animal crearAnimal(String tipoAnimal) {

		System.out.println("\tSolicitando Animal [" + tipoAnimal + "]");
		
		Animal animal = null;

		
		if (tipoAnimal.equalsIgnoreCase("perro"))
		{
			animal = new Perro(); 
		}
		else if (tipoAnimal.equalsIgnoreCase("gato"))
		{
			animal = new Gato();
		}

		return animal;
	}


}