package geometria;

public class Trapezio extends Quadrilatero{
	
	private double altura;
	private double baseMaior;
	private double baseMenor;
	
	public Trapezio(Cor cor, double baseInferior, double baseSuperior, double ladoD, double ladoE, double altura) {
		super(cor, baseInferior, baseSuperior, ladoD, ladoE);
		this.altura = altura;

		}

	@Override
	public double calculaArea() {
		return ((lado1+lado2)*altura)/2;
	}

	@Override
	public double calculaPerimetro() {
		// TODO Auto-generated method stub
		return lado1 + lado2 + lado3 + lado4;
	}
	

}
