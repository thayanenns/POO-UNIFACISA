package questao5;

import java.util.Scanner;

import java.util.Scanner;
public class AvaliacaoApp 
{
    public static void main(String[] args) 
    {
        Scanner teclado = new Scanner(System.in);
        boolean nota1Ok = false;
        boolean nota2Ok = false;
        Avaliacao avaliacao = new Avaliacao();
            
        while(!nota1Ok) 
        {
            try 
            { 
                System.out.print("Digite nota do estágio 1: ");
                avaliacao.setNota1(teclado.nextDouble());
                nota1Ok = true;
            } 
            catch (NotaInvalidaException e) 
            {
                e.printStackTrace();
                
            }
        }
        while(!nota2Ok) 
        {    
            try 
            {    System.out.print("Digite nota do estágio 2: ");
                avaliacao.setNota2(teclado.nextDouble());
                nota2Ok = true;
            } 
            catch (NotaInvalidaException e) 
            {
            	e.printStackTrace();
                
            }
        }
        System.out.println("Média: " + avaliacao.getMedia());
        teclado.close();
    }
}