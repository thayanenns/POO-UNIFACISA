package questao1;

import java.util.Scanner;

public class NomeDoMesApp {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		try{
			System.out.print("Digite o n�mero do m�s: ");
			Mes mes = new Mes(teclado.nextInt());
			System.out.println("Nome do m�s: " + mes.getNome());
		}catch(MesInvalidoException e)
		{
			e.printStackTrace();
		}
			teclado.close();
	}
}
