import java.util.Arrays;
public class StringUtils {

	
	public static String formataAtributo(String atributo) 
	{
		String atributoF = atributo.split(" ")[0];
		for (int i = 1; i < atributo.split(" ").length; i++)
		{
			String palavra = atributo.split(" ")[i];
			int numeroLetra = palavra.charAt(0) - 32;
			char letra = (char) numeroLetra;
			
			String letra1 = Character.toString((char)numeroLetra);
			String primeira = palavra.substring(0,1);
			
		    palavra = palavra.replaceFirst(primeira,letra1);
		    atributoF += palavra;
		}
		return atributoF;		
	}
	
	public static String formataMetodo(String metodo) 
	{
		String metodoF = metodo.split(" ")[0];
		for (int i = 1; i < metodo.split(" ").length; i++)
		{
			String palavra = metodo.split(" ")[i];
			int numeroLetra = palavra.charAt(0)-32;
			char letra = (char) numeroLetra;
			
			String letra1 = Character.toString((char)numeroLetra);
			String primeira = palavra.substring(0,1);
			
		    palavra = palavra.replaceFirst(primeira,letra1);
		    metodoF += palavra; 
		}
		return metodoF;	
	}
	
	public static String formataClasse(String classe) 
	{
		classe = " " + classe;
		String classeF = classe.split(" ")[0];
		for (int i = 1; i < classe.split(" ").length; i++) 
		{
			String palavra = classe.split(" ")[i];
			int numeroLetra = palavra.charAt(0)-32;
			char letra = (char) numeroLetra;
			String letra1 = Character.toString((char)numeroLetra);
			String primeira = palavra.substring(0,1);
		    palavra = palavra.replaceFirst(primeira,letra1);
		    classeF += palavra; 
		}
		return classeF;
	}
	
	public static String ordenaStrings(String palavra1, String palavra2) 
	{
		String [] array = new String [2];
		array [0] = palavra1;
		array [1] = palavra2;
		Arrays.sort(array);
		
		
		return array[0] + " " + array[1];
	}
	
	public static boolean ehPalindromo(String palavra) 
	{
		String palindromo = new StringBuilder(palavra).reverse().toString();
		return palavra.equalsIgnoreCase(palindromo);
	}
	
	public static String transformaParaCaixaAlta(String palavra) 
	{
		return palavra.toUpperCase();
	}

	public static int contaVogais(String frase) 
	{ 	
		int qntddVogais = 0;
		char [] vogais = new char [] {'a','e','i','o','u'};
 		for (int i = 0; i < frase.length(); i++)
		{	
 			for (int j = 0; j < vogais.length; j++) 
 			{	
 				if (vogais[j] == frase.toLowerCase().charAt(i))
				{	
 					qntddVogais ++;
				}
 			}
		}
 		return qntddVogais;
	}
	public static String removeEspacosSuperfluos(String frase) 
	{	
		for (int i = 0; i < frase.length(); i++) 
		{
			frase = frase.replace("  ", " ");
		}
		return frase.trim();
	}
	
	public static int[] ocorrencias(String frase, String subPalavra)
	{
		int[] posicoes = new int[subPalavra.length()];
		int cont = 0;
		for (int i = 0; i < (frase.length()-subPalavra.length()); i++) 
		{ 
			if(subPalavra.equalsIgnoreCase(frase.substring(i,i+subPalavra.length()))) 
			{
				posicoes[cont++]+=i;
			}
		}
		return posicoes;
	}


	public static int binarioPraDecimal(String binario) 
	{
		int contador = 0;
		int decimal = 0;
		for (int i = binario.length(); i > 0 ; i--) 
		{
			if(binario.charAt(i-1)=='1') 
			{
				decimal+=Math.pow(2, contador);
				contador++;
			}
			else 
			{
				contador++;
			}
		}
		return decimal;
	}
	
	
	public static int getQtdadePalavras(String frase) 
	{ 
		String[] fraseSemEspacos = frase.split(" ");
		int qtddPalavras = fraseSemEspacos.length;
		return qtddPalavras;
	}
	
	public static int [] histogramaLetras(String texto) 
	{
		int alfabeto = 'z' - 'a' + 1; 
		String frases = texto ;
		int[] histograma = new int[alfabeto];
		String e = frases.toLowerCase();
		for (int i = 0; i < e.length(); i++) 
		{	
			char letra  = e.charAt(i);
			if ('a' <= letra && letra <= 'z')
			{	
				histograma[letra - 'a']++;
			}
		}
		return histograma;
	}
}
