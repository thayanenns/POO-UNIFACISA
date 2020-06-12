package restaurante;

public class Refeicao implements Item {

	private Proteina proteina;
	private Carboidrato carboidrato;
	public Refeicao(Proteina proteina, Carboidrato carboidrato) 
	{
		this.proteina = proteina;
		this.carboidrato = carboidrato;
	}
	
	public Proteina getProteina() 
	{
		return proteina;
	}
	public Carboidrato getCarboidrato() 
	{
		return carboidrato;
	}

	@Override
	public double getPreco() {
		// TODO Auto-generated method stub
		return proteina.getCusto() + carboidrato.getCusto();
	}

	@Override
	public String getDescricao() {
		// TODO Auto-generated method stub
		return proteina.name() + " com " + carboidrato.name();
	}
}
