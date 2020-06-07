package mk;

public class Sonia extends Lutador{
	
	public Sonia() 
	{
		super("Sônia");
	}
	
	@Override
	public void socar(Lutador oponente) 
	{
		super.socar(oponente);
		oponente.vida -= 8;
	}
	
	@Override
	public void chutar(Lutador oponente) 
	{
		super.chutar(oponente);
		oponente.vida -= 8;
	}
}
