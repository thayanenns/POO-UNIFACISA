package q3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LojaDeCarros {
	private String nome, marca, cor;
	private int portas, id;
	private boolean vidroEletrico, arCondicionado, cambioAutomatico, direcaoEletrica;
	private double precoBase, precoTotal;
	private static final double promocao = 0.15;
	
	List<LojaDeCarros> carrosDisponiveis = new ArrayList<LojaDeCarros>();
	List<LojaDeCarros> carrosVendidos = new ArrayList<LojaDeCarros>();

	public LojaDeCarros(String nome, String marca, double precoBase, int id ) 
	{
		this.nome = nome;
		this.marca = marca;
		this.precoBase = precoBase;
		this.cor = "Branco";
		this.portas = 2;
		this.vidroEletrico = false;
		this.arCondicionado = false;
		this.cambioAutomatico = false;
		this.direcaoEletrica = false;
		this.id = id;
		this.precoTotal = calculaPreco();
		
	}
	
	public LojaDeCarros(String nome, String marca, String cor, double precoBase,int portas, boolean vidroEletrico, boolean arCondicionado, boolean direcaoEletrica, boolean cambioAutomatico, int id) 
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
		this.precoTotal = calculaPreco();
		
	}
	
	public LojaDeCarros() 
	{}
	
	public void adicionarCarro(LojaDeCarros carro) 
	{
		this.carrosDisponiveis.add(carro);
	}
	
	public void exibirCarrosDisponiveis() 
	{
		Arrays.toString(carrosDisponiveis.toArray());
	}
	
	public void venderCarro(int id) 
	{
		for (int i = 0; i < this.carrosDisponiveis.size(); i++)
		{
			if (carrosDisponiveis.get(i).getId() == id)
			{
				LojaDeCarros venda = this.carrosDisponiveis.get(i);				
				this.carrosVendidos.add(venda);
				carrosDisponiveis.remove(venda);
			}
		}
	}
	public int computaApuradoDasVendas() 
	{
		int lucro = 0;
		for (LojaDeCarros apurado : carrosVendidos) 
		{
			lucro += apurado.precoTotal;
		}
		return lucro;
	}
	
	public void adicionarPromocaoCarro(int id)
	{
		for (LojaDeCarros carro : carrosDisponiveis) 
		{
			if (carro.id == id) {
				double desconto = carro.calculaPreco() * promocao;
				carro.precoTotal = (carro.calculaPreco()) - desconto;
			}
		}
	}
	
	public int getId() 
	{
		return id;
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
		return precoTotal;
	}

	
	@Override
	public String toString() 
	{
		String output = "Nome: " + this.nome + "\n";
		output += "Marca: " + this.marca + "\n";
		output += "Cor: " + this.cor + "\n";
		output += "Pre�o Base: " + "R$ "+this.precoBase +"\n";
		output += "Portas: "+ this.portas + "\n";
		output += "Vidro El�trico: " +(this.vidroEletrico == true? "Sim" : "N�o") + "\n";
		output += "Ar Condicionado: " +(this.arCondicionado == true? "Sim" : "N�o") + "\n";
		output += "Dire��o El�trica: " +(this.direcaoEletrica == true? "Sim" : "N�o") + "\n";
		output += "C�mbio Autom�tico: " +(this.vidroEletrico == true? "Sim" : "N�o") + "\n";
		output += "Pre�o: " +"R$ "+ calculaPreco() + "\n";
		output += "Pre�o com promo��o: " + "R$" + this.precoTotal + "\n";
		System.out.println(output);
		
		return output;
	}
	
	public void limparVendidos() 
	{
		this.carrosVendidos.clear();
	}
	
	
}