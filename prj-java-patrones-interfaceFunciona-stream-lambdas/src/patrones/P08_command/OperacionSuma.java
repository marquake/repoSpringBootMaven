package patrones.P08_command;

public class OperacionSuma implements IOperaciones {

	private ObjetoCalculo objetoCalculo;

	public OperacionSuma(ObjetoCalculo objetoCalculo) {
		this.objetoCalculo = objetoCalculo;
	}

	@Override
	public void execute() {

		int total = objetoCalculo.getDigitoUno() + objetoCalculo.getDigitoDos();

		System.out.println("Total suma: " + objetoCalculo.getDigitoUno() + " + " + objetoCalculo.getDigitoDos() + " = " + total);
	}

}
