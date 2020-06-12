package contaBancaria;

public abstract class ContaBancaria {

	protected String nome;
	protected String senha;
	protected double saldo;
	protected double custoTransferencia;
	
	public ContaBancaria(String nome, String senha) {
		this.nome = nome;
		this.senha = senha;
		this.saldo = 6000;
	}
	
	public String getNome() {
		return nome;
	}
		
	
	public double getSaldo() {
		return saldo;
	}
	
	public abstract void transferir(String senha, double valor, ContaBancaria conta) throws SaldoInsuficienteException, SenhaInvalidaException;
	
}

//transferir lança SaldoInsuficienteException
//ansferir lança SenhaInvalidaException