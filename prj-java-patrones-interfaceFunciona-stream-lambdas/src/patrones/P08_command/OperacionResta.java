package patrones.P08_command;

public class OperacionResta implements IOperaciones{

	private ObjetoCalculo objetoCalculo;

	public OperacionResta(ObjetoCalculo objetoCalculo) {
		this.objetoCalculo = objetoCalculo;
	}

	@Override
	public void execute() {

		int total = objetoCalculo.getDigitoUno() - objetoCalculo.getDigitoDos();

		System.out.println("Total resta: " + objetoCalculo.getDigitoUno() + " - " + objetoCalculo.getDigitoDos() + " = " + total);

	}

}