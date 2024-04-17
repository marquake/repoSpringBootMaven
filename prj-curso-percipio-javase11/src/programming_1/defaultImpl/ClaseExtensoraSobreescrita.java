package programming_1.defaultImpl;

public class ClaseExtensoraSobreescrita implements IDefecto {

	@Override
	public String saludar() {
		return "saludo sobreescrito";
	}

	public String saludito() {
		return "saludito sobreescrito";
	}

	public static String saludoStatico() {
		return "saludo estático";
	}

	public String invokeSaludoStatico() {
		return saludoStatico();
	}
}
