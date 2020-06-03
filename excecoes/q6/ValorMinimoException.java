package questao6;

public class ValorMinimoException extends Exception
{
	public ValorMinimoException(int parcelas) {
	super("Insira uma quantidade de parcelas menores que  "+ parcelas+ ".");
	}
}
