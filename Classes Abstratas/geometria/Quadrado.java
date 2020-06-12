package geometria;

public class Quadrado extends Quadrilatero{
	
	public Quadrado(Cor cor, double lado1, double lado2, double lado3, double lado4) {
		super(cor, lado1, lado2, lado3, lado4);
		
	}


	@Override
	public double calculaArea() {
		
		return lado1 *lado1;
	}

	@Override
	public double calculaPerimetro() {
		// TODO Auto-generated method stub
		return lado1 + lado2 + lado3 + lado4;
	}

	
}
