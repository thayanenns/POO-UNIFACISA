package q2Imóveis;

public class Classificados {
	public static void main (String[]args) 
	{
		Imovel imovel1 = new Imovel("Casa","Imobiliária Falcão", 3 , 1 , 2, 120, true, false);
		System.out.println(imovel1.toString());
		
		Imovel imovel2 = new Imovel("Apto","Imobiliária Falcão", 15, 8, 3, 2, 3, 240, true, true, true);
		System.out.println(imovel2.toString());
		
		Imovel imovel3 = new Imovel("Casa","Imobiliária Altaman", 4, 2, 3, 240, true, true);
		System.out.println(imovel3.toString());
		
		Imovel imovel4 = new Imovel("Casa", "Imobiliária Leblon", 6, 3, 5, 540, true, true);
		System.out.println(imovel4.toString());
		
		Imovel imovel5 = new Imovel("Apto", "Imobiliária Alto Branco", 3, 2, 2, 1, 2, 60, false, false, false);
		System.out.println(imovel5.toString());
		
	
	}
}
