package restaurante;

public enum SaborBebida {
	COCA(3.5), ENERGETICO(10), AGUA(2.5);
	
	private double custo;
	
	private SaborBebida(double custo) {
		this.custo = custo;
	}
	
	public double getCusto() {
		return custo;
	}
}

