package q2;

public class Q2LojaDeCarros {
	public static void main (String [] args) 
	{	System.out.println("\n" + "SEM DESCONTO" + "\n");
		
		Q2Carro palio = new Q2Carro("Palio","Fiat",35000);
		System.out.println(palio + "\n");
		
		Q2Carro palio2 = new Q2Carro("Palio","Fiat",35000);
		palio2.cor = "Prateado";
		System.out.println(palio2 + "\n");
		
		Q2Carro civic = new Q2Carro("Civic","Honda","Azul",110000,4,true,true,true,true);
		System.out.println(civic +"\n");
		
		Q2Carro corolla = new Q2Carro("Corolla","Toyota",110000);
		corolla.vidroEletrico = true;
		corolla.direcaoEletrica = true;
		corolla.arCondicionado = true;
		corolla.cambioAutomatico = true;
		
		System.out.println(corolla + "\n");
		
		Q2Carro gol = new Q2Carro();
		
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
		
		System.out.println("\n" + "COM DESCONTO" + "\n");
		
		palio.promocao = true;
		System.out.println(palio + "\n");
		
		palio2.promocao = true;
		System.out.println(palio2 + "\n");
		
		civic.promocao = true;
		System.out.println(civic + "\n");
		
		corolla.promocao = true;
		System.out.println(corolla + "\n");
		
		gol.promocao = true;
		System.out.println(gol + "\n");
		
		
	}
}
