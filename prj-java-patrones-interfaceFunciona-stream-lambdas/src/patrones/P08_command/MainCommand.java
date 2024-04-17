package patrones.P08_command;

public class MainCommand {

	public MainCommand() {
	}

	public static void main(String[] args) {

		MainCommand mainCommand = new MainCommand();
		
		mainCommand.test();
	}

	public void test(){
		Calculadora calculadora = new Calculadora();
		
		ObjetoCalculo objetoCalculo = new ObjetoCalculo();
		objetoCalculo.setDigitoUno(5);
		objetoCalculo.setDigitoDos(8);

		OperacionResta operacionResta = new OperacionResta(objetoCalculo);
		OperacionSuma operacionSuma = new OperacionSuma(objetoCalculo);
		
		calculadora.addOperacion(operacionResta);
		calculadora.addOperacion(operacionSuma);

		calculadora.ejecutarOperaciones();
		
	}
}
