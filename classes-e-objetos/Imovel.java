package q2Imóveis;

public class Imovel {
	
	protected String tipo, imobiliaria;
	protected int pavimentos, pavimento, quartos, suítes, banheiros, metrosQuadrados;
	protected boolean elevador, piscina, quadra;
	
	public Imovel(String tipo, String imobiliaria, int quartos, int suites, int banheiros, int metrosQuadrados, boolean piscina, boolean quadra) 
	{
		this.tipo = "Casa";
		this.imobiliaria = imobiliaria;
		this.quartos = quartos;
		this.suítes = suites;
		this.banheiros = banheiros;
		this.metrosQuadrados = metrosQuadrados;
		this.piscina = piscina;
		this.quadra = quadra;
		
	}
	
	public Imovel(String tipo, String imobiliaria, int pavimentos, int pavimento, int quartos, int suites, int banheiros, int metrosQuadrados, boolean elevador, boolean piscina, boolean quadra) 
	{
		this.tipo = "Apto";
		this.imobiliaria = imobiliaria;
		this.pavimentos = pavimentos;
		this.pavimento = pavimento;
		this.quartos = quartos;
		this.suítes = suites;
		this.banheiros = banheiros;
		this.metrosQuadrados = metrosQuadrados;
		this.elevador = elevador;
		this.piscina = piscina;
		this.quadra = quadra;
		
		
	}
	
	public double calculaPreco() 
	{	double precoTotal = 0;
		precoTotal += (metrosQuadrados * 5000);
		if (this.pavimento >= 5)
			precoTotal += (pavimento - 4)*2000;
		if (this.elevador == true)
			precoTotal += 2500;
		if(this.piscina == true)
			precoTotal += 2500;
		if (this.quadra == true)
			precoTotal += 2500;
		
		return precoTotal;
	}
	
	public String toString() 
	{	
		String descricao = "";
		
		if(this.tipo == "Casa")
		{
			descricao += "CASA " + "\n";
			descricao += "Imobiliaria: " + this.imobiliaria + "\n" ;
			descricao += "Quartos: " + this.quartos + "\n";
			descricao += "Suítes: " + this.suítes + "\n";
			descricao += "Banheiros: " + this.banheiros + "\n"; 
			descricao += "Metros Quadrados: " + this.metrosQuadrados +"m²" + "\n";
			descricao += "Piscina: " + (this.piscina? "Sim" : "Não") + "\n";
			descricao += "Quadra: " + (this.quadra? "Sim" : "Não") + "\n";
			descricao += "Preço Total: " + "R$" + calculaPreco();
			System.out.println("\n" + descricao + "\n");
		}
			
			else 
			{
				descricao += "Apartamento " + "\n";
				descricao += "Imobiliaria: " + this.imobiliaria + "\n" ;
				descricao += "Pavimentos: " + this.pavimentos + "\n";
				descricao += "Pavimento: " + this.pavimento + "\n";
				descricao += "Quartos: " + this.quartos + "\n";
				descricao += "Suítes" + this.suítes + "\n";
				descricao += "Banheiros: " + this.banheiros + "\n"; 
				descricao += "Metros Quadrados: " + this.metrosQuadrados +"m²" + "\n";
				descricao += "Elevador: " + (this.elevador? "Sim" : "Não") + "\n";
				descricao += "Piscina: " + (this.piscina? "Sim" : "Não") + "\n";
				descricao += "Quadra: " + (this.quadra? "Sim" : "Não") + "\n";
				descricao += "Preço Total: " + "R$" +  calculaPreco();

				System.out.println("\n" + descricao + "\n");
			}
		return "";
	}
}
