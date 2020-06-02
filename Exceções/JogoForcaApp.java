package questao4;

import java.util.Scanner;

public class JogoForcaApp {
	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args)  {

		System.out.print("Digite palavra secreta: ");
		String palavraSecreta = teclado.nextLine();
		LimparTela();
		try{
		Forca jogo = new Forca(palavraSecreta);
		LerPalpite(jogo);
		while (true) {
			LerPalpite(jogo);
			if(!jogo.getAcabou()) { 
				ImprimirJogo(jogo);
		}
		}
		}
		catch(JogoEncerradoException e) {
				e.printStackTrace();
		}
		finally 
		{
			teclado.close();
		}
	}
	private static void LerPalpite(Forca jogo) throws JogoEncerradoException {
		ImprimirJogo(jogo);
		System.out.print("Digite letra: ");
		char letra = teclado.nextLine().toUpperCase().charAt(0);
		jogo.tentarPalpite(letra);
	}

	private static void ImprimirJogo(Forca jogo) {
		System.out.print("Palavra: ");
		char[] letras = jogo.getPalpites();
		for (int i = 0; i < letras.length; i++) {
			System.out.print(letras[i]);
		}
		System.out.println();
		int erros = jogo.getQtdErros();
		System.out.println("----");
		System.out.println("|  " + ((erros >= 1) ? "O" : ""));
		System.out.print("| " + ((erros >= 2) ? "/" : ""));
		if (erros == 2) {
			System.out.println();
		} else {
			System.out.print((erros >= 4) ? "|" : " ");
			System.out.println((erros >= 3) ? "\\" : "");
		}
		System.out.println((erros >= 4) ? "|  |" : "|");
		System.out.print("| " + ((erros >= 5) ? "/" : ""));
		if (erros == 5) {
			System.out.println();
		} else {
			System.out.println((erros >= 6) ? " \\" : "");
		}
		System.out.println("|");
		System.out.println();
	}

	private static void LimparTela() {
		for (int i = 0; i < 40; i++) {
			System.out.println();
		}
	}
}
