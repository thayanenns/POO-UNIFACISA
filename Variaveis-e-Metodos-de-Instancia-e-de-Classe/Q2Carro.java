package q2;

public class Q2Carro {
	protected String nome, marca, cor;
	protected int portas;
	protected boolean vidroEletrico, arCondicionado, cambioAutomatico, direcaoEletrica;
	protected double precoBase;
	protected boolean promocao;
	
	public Q2Carro(String nome, String marca, double precoBase) 
	{
		this.nome = nome;
		this.marca = marca;
		this.precoBase = precoBase;
		this.promocao = false;
		this.cor = "Branco";
		this.portas = 2;
		this.vidroEletrico = false;
		this.arCondicionado = false;
		this.cambioAutomatico = false;
		this.direcaoEletrica = false;
		
	}
	
	public Q2Carro(String nome, String marca, String cor, double precoBase,int portas, boolean vidroEletrico, boolean arCondicionado, boolean direcaoEletrica, boolean cambioAutomatico) 
	{
		this.nome = nome;
		this.marca = marca;
		this.cor = cor;
		this.precoBase = precoBase;
		this.portas = portas;
		this.vidroEletrico = vidroEletrico;
		this.arCondicionado = arCondicionado;
		this.cambioAutomatico = cambioAutomatico;
		this.direcaoEletrica = direcaoEletrica;
		this.promocao = false;
	}
	
	public Q2Carro() 
	{
		
	}
	public double calculaPreco() 
	{
		double precoTotal = precoBase;
		switch (cor) {
			case "branco":
				break;
			case "preto":
				break;
			case "azul":
				break;
			case "vermelho":
				break;
				
			default:
				precoTotal += 1000;
		}
		
		if (vidroEletrico == true)
		{
			precoTotal += 1250;
		}
		
		if (arCondicionado == true) 
		{
			precoTotal += 1250;
		}
		
		if(cambioAutomatico == true) 
		{
			precoTotal += 1250;
		}
		
		if(direcaoEletrica == true) 
		{
			precoTotal += 1250;
		}
		if(promocao)
			precoTotal = precoTotal - (precoTotal*10)/100;
			
			
		return precoTotal;
	}

	
	@Override
	public String toString() {
		String output = "Nome: " + this.nome + "\n";
		output += "Marca: " + this.marca + "\n";
		output += "Cor: " + this.cor + "\n";
		output += "Preço Base: " + "R$ "+this.precoBase +"\n";
		output += "Portas: "+ this.portas + "\n";
		output += "Vidro Elétrico: " +(this.vidroEletrico == true? "Sim" : "Não") + "\n";
		output += "Ar Condicionado: " +(this.arCondicionado == true? "Sim" : "Não") + "\n";
		output += "Direção Elétrica: " +(this.direcaoEletrica == true? "Sim" : "Não") + "\n";
		output += "Câmbio Automático: " +(this.vidroEletrico == true? "Sim" : "Não") + "\n";
		output += "Preço Total: " +"R$ "+ calculaPreco();
		
		
		return output;
	}
}
