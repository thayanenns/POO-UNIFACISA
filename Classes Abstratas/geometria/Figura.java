package geometria;

public abstract class Figura {
	public Cor cor;
	public Figura(Cor cor) {
		this.cor = cor;
	}

	
	public abstract double calculaArea();
	
	public abstract double calculaPerimetro();
	
	
}
