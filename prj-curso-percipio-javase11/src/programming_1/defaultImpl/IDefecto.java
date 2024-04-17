package programming_1.defaultImpl;

public interface IDefecto {

	String saludar();
	
	default String saludito() {
		return "saludito default";
	}
}
