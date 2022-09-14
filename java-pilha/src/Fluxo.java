
public class Fluxo {
	public static void main(String[] args) {
        System.out.println("Inicia do main");
        metodo1();
        System.out.println("Fim do main");
    }

    private static void metodo1() {
        System.out.println("Inicia do metodo1");
        metodo2();
        System.out.println("Fim do metodo1");
    }

    private static void metodo2() {
        System.out.println("Inicia do metodo2");
        for(int i = 1; i <= 5; i++) {
            System.out.println(i);
            try {
            	int a = i/0;
            } catch (ArithmeticException | NumberFormatException e) {
            	String msg = e.getMessage(); //mostra oq causou a exception
            	System.out.println("Exception foi capturada: " + msg);
            	e.printStackTrace(); //mostra o rastro de onde passou a exception
            } catch (NullPointerException e) {
            	System.out.println("Caiu nessa exception");
            }
        }
        System.out.println("Fim do metodo2");
    }
}
