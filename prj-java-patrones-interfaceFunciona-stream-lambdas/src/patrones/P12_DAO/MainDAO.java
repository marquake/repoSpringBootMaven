package patrones.P12_DAO;

public class MainDAO {

	public MainDAO() {
	}

	public static void main(String[] args) {
		MainDAO mainDAO = new MainDAO();
		
		mainDAO.test();

	}

	public void test(){
		
		PersonaDAO personalDAO = new PersonaDAOImpl();
		
		personalDAO.updatePersona(null);
		
		Persona persona = personalDAO.getPersona();
		
		System.out.println("persona : " + persona.toString() );

	}
}
