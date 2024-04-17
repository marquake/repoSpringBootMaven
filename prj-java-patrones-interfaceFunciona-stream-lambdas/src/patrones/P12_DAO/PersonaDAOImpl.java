package patrones.P12_DAO;

public class PersonaDAOImpl implements PersonaDAO {

	@Override
	public Persona getPersona() {

		Persona persona = new Persona();
		
		persona.setId(56);
		persona.setName("Federico");
		persona.setEdad(39);
			
		return persona;
	}

	@Override
	public void updatePersona(Persona persona) {
		System.out.println("Los datos de la persona han sido actualizados");
	}


}
