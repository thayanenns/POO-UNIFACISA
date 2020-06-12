package contaBancaria;

public class ContaCorrente extends ContaBancaria{
	
	protected static final double porcentagem  = 0.25;

	public ContaCorrente(String nome, String senha) {
		super(nome, senha);

	}
	
	@Override
	public void transferir(String senha, double valor, ContaBancaria conta) throws SaldoInsuficienteException, SenhaInvalidaException
	{
		double custo = (porcentagem/ 100) * valor; 
		if(this.senha.equals(senha))
		{
			if(this.saldo >= valor) 
			{
				conta.saldo += valor;
				this.saldo -=valor;
				if(valor< 5000) 
				{
					conta.saldo-= custo;
				}
				else 
				{
					conta.saldo -= 15;
				}
			}
			else {
				throw new SaldoInsuficienteException("Saldo insuficiente!");
			}
		}
		else {
			throw new SenhaInvalidaException("Senha inválida!");
		}
	}
}
