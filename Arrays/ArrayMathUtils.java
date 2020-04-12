import java.util.Arrays;

public class ArrayMathUtils {
	
	public static int [] calculaDivisores(int num) 
	{
	
		int [] divisores = new int [getQtdDivisores(num)];
		int contador = 0;
		for (int i = 1; i <= num; i++) 
		{
			if (num % i == 0)
			{
				divisores[contador] = i;	
				contador++;
			}
		}
		return divisores;
	}
	
	private static  int getQtdDivisores(int num) 
	{	
		int contador = 2;
	
		for (int i = 2; i <= num / 2; i++) 
		{	if (num % i == 0)
			{	contador++;
			}
		}
		return contador;
	}
	
	public static double computaMaior(double[] numeros) 
	{	
		Arrays.sort(numeros);
		int maior = numeros.length -1;
		return (double)numeros[maior];
	}
	
	public static double computaMenor(double[] numeros) 
	{
		
		Arrays.sort(numeros);
	    return (double)numeros[0];
	}
	
	public static double computaMedia(double[] numeros) 
	{
		double soma = 0;
		double media = 0;
		
        for (int i = 0; i < numeros.length; i++) 
        {
            soma += numeros[i];
            media = soma/numeros.length;
        }
        return media;
	}
	public static boolean temNumRepetido(double[] numeros) 
	{
		boolean numRepetido = false;
		
        for (int i = 0; i < numeros.length; i++) 
        {
           	for(int j = 0; j < numeros.length; j++)
           	{
           			if (numeros[i] == numeros[j] && j!=i)
           			{
           				numRepetido = true;
           			}
            }
        }
        return numRepetido;
     }
	
	public static int [][] somaMatrizes(int [][] m1, int [][] m2)
	{

		int [][] soma = new int [m1.length][];
		
		for (int i = 0; i < soma.length; i++) 
		{ 	int a = m1[i].length;
			soma[i] = new int[a];
			for (int j = 0; j < a; j++) 
			{
				soma[i][j] = m1[i][j] + m2[i][j];
				System.out.print(soma[i][j] + " ");
			}
			System.out.println();
		}
		return soma;	
	}
}
