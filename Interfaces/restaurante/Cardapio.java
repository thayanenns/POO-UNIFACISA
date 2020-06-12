package restaurante;

import java.util.ArrayList;
import java.util.List;
import restaurante.SaborBebida;
import restaurante.Tamanho;

public class Cardapio {
	
	private List<Item> cardapio;
	private List<Bebida> bebidas;
	private List<Refeicao> refeicoes;
	
	public Cardapio() 
	{
		this.refeicoes = new ArrayList<Refeicao>();
		
		this.refeicoes.add(new Refeicao(Proteina.FRANGO, Carboidrato.ARROZ));
		this.refeicoes.add(new Refeicao(Proteina.FRANGO, Carboidrato.BATATA));
		this.refeicoes.add(new Refeicao(Proteina.FRANGO, Carboidrato.FEIJAO));
		this.refeicoes.add(new Refeicao(Proteina.FRANGO, Carboidrato.PURE));
		
		this.refeicoes.add(new Refeicao(Proteina.LINGUICA, Carboidrato.ARROZ));
		this.refeicoes.add(new Refeicao(Proteina.LINGUICA, Carboidrato.BATATA));
		this.refeicoes.add(new Refeicao(Proteina.LINGUICA, Carboidrato.FEIJAO));
		this.refeicoes.add(new Refeicao(Proteina.LINGUICA, Carboidrato.PURE));
		
		this.refeicoes.add(new Refeicao(Proteina.MAMINHA, Carboidrato.ARROZ));
		this.refeicoes.add(new Refeicao(Proteina.MAMINHA, Carboidrato.BATATA));
		this.refeicoes.add(new Refeicao(Proteina.MAMINHA, Carboidrato.FEIJAO));
		this.refeicoes.add(new Refeicao(Proteina.MAMINHA, Carboidrato.PURE));
		
		this.refeicoes.add(new Refeicao(Proteina.PICANHA, Carboidrato.ARROZ));
		this.refeicoes.add(new Refeicao(Proteina.PICANHA, Carboidrato.BATATA));
		this.refeicoes.add(new Refeicao(Proteina.PICANHA, Carboidrato.FEIJAO));
		this.refeicoes.add(new Refeicao(Proteina.PICANHA, Carboidrato.PURE));
		
		this.bebidas = new ArrayList<Bebida>();
		
		this.bebidas.add(new Bebida(Tamanho.PEQUENO, SaborBebida.AGUA));
		this.bebidas.add(new Bebida(Tamanho.MEDIO, SaborBebida.AGUA));
		this.bebidas.add(new Bebida(Tamanho.GRANDE, SaborBebida.AGUA));
		
		this.bebidas.add(new Bebida(Tamanho.PEQUENO, SaborBebida.COCA));
		this.bebidas.add(new Bebida(Tamanho.MEDIO, SaborBebida.COCA));
		this.bebidas.add(new Bebida(Tamanho.GRANDE, SaborBebida.COCA));
		
		this.bebidas.add(new Bebida(Tamanho.PEQUENO, SaborBebida.ENERGETICO));
		this.bebidas.add(new Bebida(Tamanho.MEDIO, SaborBebida.ENERGETICO));
		this.bebidas.add(new Bebida(Tamanho.GRANDE, SaborBebida.ENERGETICO));
		
		this.cardapio = new ArrayList<Item>();
		
		cardapio.addAll(refeicoes);
		cardapio.addAll(bebidas);
		
		}
	
	public List<Item> getCardapio(){
		return cardapio;
	}
	
	public List<Bebida> getBebida()
	{
		return bebidas;
	}
	
	public List<Refeicao> getRefeicao()
	{
		return refeicoes;
	}
}
