package mk;

public class Jax extends Lutador{
	
	public Jax() 
	{
		super("Jax");
	}
	
	@Override
	public void socar(Lutador oponente) 
	{
		super.socar(oponente);
		oponente.vida -=10;
	}

}
