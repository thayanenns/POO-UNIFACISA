package restaurante;

public class Bebida implements Item {
	
	protected Tamanho tamanho;
	protected SaborBebida saborBebida;
	protected double preco;

	public Bebida(Tamanho tamanho, SaborBebida saborBebida) 
	{
		this.tamanho = tamanho;
		this.saborBebida = saborBebida;
	}
	
	public Tamanho getTamanho(Tamanho tamanho) 
	{
		return tamanho;
	}
	
	public SaborBebida getSabor(SaborBebida saborBebida) 
	{
		return saborBebida;
	}
	
	public double getPreco() 
	{
		return preco;
	}
	
	public String getDescricao() 
	{
		return toString();
	}
}
