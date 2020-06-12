package geometria;

public class Retangulo extends Quadrilatero{

	public Retangulo(Cor cor, double lado1, double lado2, double lado3, double lado4) {
		super(cor, lado1, lado2, lado3, lado4);
	}

	
	@Override
	public double calculaArea() {
		
		double base = lado1;
		double altura = lado3;
		
		return base * altura;
	}

	
	@Override
	public double calculaPerimetro() {
		return lado1 + lado2 + lado3 + lado4;
	}

}
