package q1Carro;

public class LojaDeCarros {
	public static void main (String [] args) 
	{
		Carro.promocao = true;
		Carro palio = new Carro("Palio","Fiat",35000);
		System.out.println(palio + "\n");
		
		Carro palio2 = new Carro("Palio","Fiat",35000);
		palio2.cor = "Prateado";
		System.out.println(palio2 + "\n");
		
		Carro civic = new Carro("Civic","Honda","Azul",110000,4,true,true,true,true);
		System.out.println(civic +"\n");
		
		Carro corolla = new Carro("Corolla","Toyota",110000);
		corolla.vidroEletrico = true;
		corolla.direcaoEletrica = true;
		corolla.arCondicionado = true;
		corolla.cambioAutomatico = true;
		
		System.out.println(corolla + "\n");
		
		Carro gol = new Carro();
		
		gol.nome = "Gol";
		gol.marca = "Volkswagen";
		gol.cor = "Branco";
		gol.precoBase = 55000;
		gol.portas = 4;
		gol.arCondicionado = true;
		gol.cambioAutomatico = true;
		gol.direcaoEletrica = true;
		gol.vidroEletrico = true;
		System.out.println(gol);
		
	
		
		
	}
}
