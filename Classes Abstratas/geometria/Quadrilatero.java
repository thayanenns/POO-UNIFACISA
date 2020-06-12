package geometria;

public abstract class Quadrilatero extends Figura {

	protected double lado1;
	protected double lado2;
	protected double lado3;
	protected double lado4;
	
	public Quadrilatero(Cor cor, double lado1, double lado2, double lado3, double lado4) {
		super(cor);
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
		this.lado4 = lado4;
	}
	
	
	
	
}
