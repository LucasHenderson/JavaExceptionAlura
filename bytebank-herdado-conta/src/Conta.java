

public abstract class Conta {
	private Double saldo;
	private int agencia;
	private int numero;
	private Cliente cliente;
	private static int totalDeContas;
	
	public Conta(Double saldo, int agencia, int numero, Cliente cliente) {
		super();
		totalDeContas++; //sempre que cria uma conta aumenta 1 no contador
		System.out.println("total de contas: " + totalDeContas);
		// e possivel colocar alguns if aqui para verificar os dados (até mesmo impedir a criação do objeto)
		this.saldo = saldo;
		this.agencia = agencia;
		this.numero = numero;
		this.cliente = cliente;
	}

	public Conta(Double saldo) {
		super();
		totalDeContas++;
		System.out.println("total de contas: " + totalDeContas);
		this.saldo = saldo;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public Cliente getCliente() {
		if (cliente == null) {
			return new Cliente();
		}
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public static int getTotalDeContas() {
		return totalDeContas;
	}

	@Override
	public String toString() {
		return "Conta [saldo=" + saldo + ", agencia=" + agencia + ", numero=" + numero + ", cliente=" + cliente + "]";
	}

	public void depositar(Double valor) {
		saldo += valor;
	}

	public void sacar(Double valor) throws SaldoInsuficienteException {
		if (valor > this.saldo) {
			throw new SaldoInsuficienteException("Saldo:"+this.saldo+" | Valor:"+valor);
		}
		
		this.saldo -= valor;
	}

	public void transferir(Conta conta, Double valor) throws SaldoInsuficienteException {
		sacar(valor);
		conta.depositar(valor);
	}
}
