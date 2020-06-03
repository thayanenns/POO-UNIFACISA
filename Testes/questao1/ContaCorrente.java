package q1;

public class ContaCorrente {
	
	private double limite;	 
	private double saldo;	
	private int numero;
	private String cliente;
	
	public ContaCorrente(double limite, int numero, String cliente) {
		if(limite < 0) {
			limite = 0;
		}
		this.limite = limite;
		this.numero = numero;
		this.cliente = cliente;
		this.saldo = 0;
	}
	
	public void depositar(double quantia) throws ValorInvalidoException{
		if(quantia <= 0)
			throw new ValorInvalidoException("Valor inválido para depósito ");
		
		saldo += quantia;
	}
	
	public double debitar(double quantia) throws ValorInvalidoException{
		if(verificaRetirada(quantia)) {
			saldo -= quantia;
			return quantia;
		} else {
			throw new ValorInvalidoException("Valor inválido para débito ");
		}		
	}
	
	public boolean transferir(double quantia, ContaCorrente conta2) throws ValorInvalidoException
	{
		double valor = debitar(quantia);
		if(valor > 0)
		{
			try 
			{
				conta2.depositar(valor);
			} catch (ValorInvalidoException e) 
			{
				e.printStackTrace();
			}
			return true;
		}
		return false;		
	}
	
	protected boolean verificaRetirada(double quantia) {
		if(quantia > 0 && quantia <= (saldo + limite)) 
			return true;
		else
			return false;
	}
	
	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	public double getLimite() {
		return limite;
	}
	
	public double getSaldo() {
		return saldo;
	}

}