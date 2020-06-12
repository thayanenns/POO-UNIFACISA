package restaurante;

public enum Tamanho {
	 PEQUENO(0.0), MEDIO(2), GRANDE(2.8);
	
	private double custo;
	
	private Tamanho(double custo) {
		this.custo = custo;
	}
	
	public double getCusto() {
		return custo;
	}

}
