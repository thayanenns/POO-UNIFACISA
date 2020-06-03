package questao2;

import java.util.Scanner;

public class NomeInvertidoApp {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		try {
			System.out.print("Digite o seu nome: ");
		
			Pessoa pessoa = new Pessoa();
			pessoa.setNome(teclado.nextLine());
			System.out.println("Nome invertido: " + pessoa.getNomeInvertido());
		}catch(NomeInvalidoException e) 
		{
			e.printStackTrace();
		}
		teclado.close();
	}
}
