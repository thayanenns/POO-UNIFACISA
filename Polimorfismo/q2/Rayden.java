package mk;

public class Rayden extends Lutador{

	public Rayden() 
	{
		super("Rayden");
	}
	
	@Override
	public void lancarMagia(Lutador oponente) 
	{
		super.lancarMagia(oponente);
		oponente.vida -= 9;
	}
	
	
}
