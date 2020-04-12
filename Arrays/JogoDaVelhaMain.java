package q4;
import java.util.Scanner;

public class JogoDaVelhaMain {
	public static void main(String[] args) {
		System.out.println();
		JogoDaVelha jogo = new JogoDaVelha();
		Scanner s = new Scanner(System.in);
		int linha;
		int coluna;
		do 
		{
			System.out.println("Linha: ");
			linha = s.nextInt();
			System.out.println("Coluna: ");
			coluna = s.nextInt();			
			jogo.jogar(linha, coluna);;
		}
		while(!jogo.detectaFimJogo()); 
		if (jogo.detectaFimJogo() == true)
		{
			System.out.println("\n"+" FIM DE JOGO"+"\n");
		}
	}
}

