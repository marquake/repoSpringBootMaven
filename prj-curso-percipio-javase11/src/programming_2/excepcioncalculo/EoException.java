package programming_2.excepcioncalculo;

public class EoException extends Exception {

	public EoException() {
		System.out.println("Creando EoException...");
	}

	public EoException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public EoException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	public EoException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public EoException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

}
