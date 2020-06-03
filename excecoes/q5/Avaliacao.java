package questao5;

public class Avaliacao {
	private double nota1;
	private double nota2;

	public void setNota1(double nota1) throws NotaInvalidaException {
		if (nota1 < 0.0 || nota1> 10.0) 
		{
			throw new NotaInvalidaException("A nota deve estar no intervalo entre 0,0 e 10,0");
		}
		this.nota1 = nota1;
	}

	public void setNota2(double nota2) throws NotaInvalidaException{
		if (nota2 < 0.0 || nota2> 10.0) 
		{
			throw new NotaInvalidaException("A nota deve estar no intervalo entre 0,0 e 10,0");
		}
		this.nota2 = nota2;
	}

	public double getMedia() {
		return (nota1 + nota2) / 2;
	}
}
