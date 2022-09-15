
public class Fluxo {
	public static void main(String[] args) {
		System.out.println("Inicia do main");
		try {
			metodo1();
		} catch (ArithmeticException | NumberFormatException | MinhaException e) {
			String msg = e.getMessage(); //mostra oq causou a exception
        	System.out.println("Exception foi capturada: " + msg);
		}
		System.out.println("Fim do main");
	}

	private static void metodo1() {
		System.out.println("Inicia do metodo1");
		metodo2();
		System.out.println("Fim do metodo1");
	}

	private static void metodo2() {
		System.out.println("Inicia do metodo2");
		
		//ArithmeticException exception = new ArithmeticException("deu ruim");
		//throw exception;
		
		//throw new NullPointerException(); //geralmente vai ser feito assim, sem criar uma referencia
		
		throw new MinhaException("deu ruim, minha exception");
		
		//System.out.println("Fim do metodo2");
	}	
}
