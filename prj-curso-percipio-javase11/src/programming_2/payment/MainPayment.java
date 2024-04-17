package programming_2.payment;

public class MainPayment {

	public static void main(String[] args) {

		CardPayment cp = (CardPayment) new Payment(5);

		cp.metodoCardPayment();
		
		cp.displayPayment();
	}

}
