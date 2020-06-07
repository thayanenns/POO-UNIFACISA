package mk;

public class NigthWolf extends Lutador {
	
	public NigthWolf() 
	{
		super("Nigth Wolf");
	}
	
	@Override
	public void atirar(Lutador oponente) 
	{
		super.atirar(oponente);
		oponente.vida -= 5;
	}
	@Override
	public void lancarMagia(Lutador oponente) 
	{
		super.lancarMagia(oponente);
		oponente.vida -= 6;
	}

}
