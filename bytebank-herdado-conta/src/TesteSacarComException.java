
public class TesteSacarComException {
	
	public static void main(String[] args) {
//		//teste com RuntimeException (unchecked)
//		ContaCorrente contaCorrente = new ContaCorrente(100.0, 1, 1, new Cliente());
//		System.out.println(contaCorrente.getSaldo());
//		contaCorrente.sacar(110.0); //vai acontecer uma exception pois o valor que tentou sacar é maior do que o saldo
//		System.out.println(contaCorrente.getSaldo()); //nem vai chegar a exibir essa linha
		
		//teste com Exception (checked)
		ContaCorrente contaCorrente = new ContaCorrente(100.0, 1, 1, new Cliente());
		System.out.println(contaCorrente.getSaldo());
		try {
			contaCorrente.sacar(110.0); //quando ela e checked deve ser feito um try/catch obrigatorio
		} catch (SaldoInsuficienteException e) {
			System.out.println(e.getMessage());
		}
	}
}