package geometria;

public class MainFigura {

	public static void main(String[] args) {
	
	Quadrado q = new Quadrado(Cor.Branco, 5, 5, 5,5);
	System.out.println(q.calculaArea() + "\n" + q.calculaPerimetro());
	Retangulo r  = new Retangulo(Cor.Amarelo, 5, 5, 5,5);
	System.out.println(r.calculaArea() + "\n" + r.calculaPerimetro());
	Circulo c  = new Circulo(Cor.Branco, 6);
	System.out.println(c.calculaArea() + "\n" + c.calculaPerimetro());
	Trapezio t  = new Trapezio(Cor.Branco, 7,8,2,1,5);
	System.out.println(t.calculaArea() + "\n" + t.calculaPerimetro());

	
}
}

