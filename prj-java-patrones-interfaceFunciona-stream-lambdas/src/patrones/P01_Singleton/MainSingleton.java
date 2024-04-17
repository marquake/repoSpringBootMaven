package patrones.P01_Singleton;

public class MainSingleton {

	public MainSingleton() {
	}

	public static void main(String[] args) {

		MainSingleton ms = new MainSingleton();
		
		ms.test();

	}

	public void test(){
		ClaseUnica claseUnica1 = ClaseUnica.getInstancia("1");
		ClaseUnica claseUnica2 = ClaseUnica.getInstancia("2");
		ClaseUnica claseUnica3 = ClaseUnica.getInstancia("3");
		ClaseUnica claseUnica4 = ClaseUnica.getInstancia("4");
	}

}
