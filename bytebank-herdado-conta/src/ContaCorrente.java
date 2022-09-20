
public class ContaCorrente extends Conta implements Tributavel {
	public ContaCorrente(Double saldo, int agencia, int numero, Cliente cliente) {
		super(saldo, agencia, numero, cliente);
	}
	
	@Override
	public void transferir(Conta conta, Double valor) throws SaldoInsuficienteException{
		System.out.println("Transfencia da conta corrente!");
		super.transferir(conta, valor);
	}
	
	@Override
	public void sacar(Double valor) throws SaldoInsuficienteException{
		Double taxaDeSaque = 0.2;
		super.sacar(valor+taxaDeSaque);
	}

	@Override
	public double getValorImposto() {
		double taxaDeImposto = 0.01;
		return super.getSaldo()*taxaDeImposto;
	}
}
