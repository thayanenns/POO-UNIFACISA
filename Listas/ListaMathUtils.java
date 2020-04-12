package q1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListaMathUtils {
	
	public static List<Integer> calculaDivisores(int num) 
	{
		List<Integer> divisores = new ArrayList<Integer>(getQtdDivisores(num));
		int contador = 0;
		for (int i = 1; i <= num; i++) 
		{
			if (num % i == 0)
			{
				divisores.add(i);	
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
	
	public static double computaMaior(List<Double> numeros) 
	{	
		Collections.sort(numeros);
		int maior = numeros.size()-1;
		return (double) numeros.get(maior);
		
	}
	
	public static double computaMenor(List<Double> numeros) 
	{
        Collections.sort(numeros);
        return (double) numeros.get(0);
	}
	
	public static double computaMedia(List <Double> numeros) 
	{
		double soma = 0;
		double media = 0;
		
        for (int i = 0; i < numeros.size(); i++) 
        {
            soma += numeros.get(i);
            media = soma/numeros.size();
        }
        return media;
	}
	
	public static boolean temNumRepetido(List<Double> numeros) 
	{
		boolean numRepetido = false;
		
        for (int i = 0; i < numeros.size(); i++) 
        {
           	for(int j = 0; j < numeros.size(); j++)
           	{
           			if (numeros.get(i).equals(numeros.get(j)) && j!=i)
           			{
           				numRepetido = true;
           			}
            }
        }
        return numRepetido;
     }
}

