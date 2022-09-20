
public class TesteContas {
	public static void main(String[] args) {
		ContaCorrente contaCorrente = new ContaCorrente(100.0, 10, 10, new Cliente());
		ContaPoupanca contaPoupanca = new ContaPoupanca(200.0, 20, 20, new Cliente());
		
		//contaCorrente.transferir(contaPoupanca, 80.0);
		//contaCorrente.sacar(50.0);
		//System.out.println(contaCorrente);
		
		//----------------------------------------------------
		
		SeguroDeVida seguro = new SeguroDeVida();
		CalculadorDeImposto calculador = new CalculadorDeImposto(); 
		calculador.registrar(contaCorrente);
		calculador.registrar(seguro);
		
		System.out.println("Imposto total: " + calculador.getTotalImposto());
	}
}
