package contaBancaria;

public class ContaPoupanca extends ContaBancaria{

	protected static final double custoTransferencia = 5;
	public ContaPoupanca(String nome, String senha) {
		super(nome, senha);

	}
	
	
	@Override
	public void transferir(String senha, double valor, ContaBancaria conta) throws SaldoInsuficienteException, SenhaInvalidaException
	{

		if(this.senha.equals(senha))
		{
			if(this.saldo >= valor) 
			{
				conta.saldo += valor;				
				this.saldo-= custoTransferencia;
				this.saldo -= valor;
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
	
