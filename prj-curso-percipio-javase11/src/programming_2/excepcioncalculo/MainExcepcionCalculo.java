package programming_2.excepcioncalculo;

public class MainExcepcionCalculo {

	public MainExcepcionCalculo() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		try {
			
			//anularReajuste(1);

			anularReajusteCorregido(1);
			
		} catch (Exception e) {
			System.out.println("main capturo");
			//e.printStackTrace();
		}
	}

	public static void anularReajusteCorregido(int ID_LANZAR) throws Exception {
		
		try {
			if (ID_LANZAR == 1) {
				throw new EoException();
			} else if (ID_LANZAR == 2) {
				throw new CreateException();
			} else if (ID_LANZAR == 3) {
				throw new Exception();
			} 
		} catch (EoException e) {
			System.out.println("1capturo anularReajusteCorregido()");
			throw new EoException();
		} catch (CreateException e) {
			System.out.println("2capturo anularReajusteCorregido()");
			throw new CreateException();
		} catch (Exception e) {
			System.out.println("3capturo anularReajusteCorregido()");
			throw new Exception();
		}
	}

	public static void anularReajuste(int ID_LANZAR) throws EoException {
		
		try {
			if (ID_LANZAR == 1) {
				throw new EoException();
			} else if (ID_LANZAR == 2) {
				throw new CreateException();
			} else if (ID_LANZAR == 3) {
				throw new Exception();
			} 
		} catch (EoException e) {
			System.out.println("1capturo anularReajuste()");
			//throw new EoException();
		} catch (CreateException e) {
			System.out.println("2capturo anularReajuste()");
			//throw new CreateException();
		} catch (Exception e) {
			System.out.println("3capturo anularReajuste()");
			//throw new Exception();
		}
	}

}
