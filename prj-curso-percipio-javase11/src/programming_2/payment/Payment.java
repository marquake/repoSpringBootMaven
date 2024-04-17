package programming_2.payment;

public class Payment {

	int valorDef = 0;

	public Payment() {
	}

	public Payment(int valor) {
		valorDef = valor;
	}

	public void metodoPayment(int valor) {
		valorDef = valor;
	}

	public void displayPayment() {
		System.out.println("Payment :: displayPayment() : valorDef: " + valorDef);
	}
}
