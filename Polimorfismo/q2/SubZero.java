package mk;

public class SubZero extends Lutador {
	
	public SubZero() 
	{
		super("Sub Zero");
	}
	@Override
	public void lancarMagia(Lutador oponente) 
	{
		super.lancarMagia(oponente);
		oponente.vida -= 8;
	}

	
}
