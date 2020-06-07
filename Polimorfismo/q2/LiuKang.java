package mk;

public class LiuKang extends Lutador{

	public LiuKang() 
	{
		super("Liu Kang");
	}
	
	@Override
	public void chutar(Lutador oponente) 
	{
		super.chutar(oponente);
		oponente.vida -= 9;
	}
	
	@Override
	public void lancarMagia(Lutador oponente) 
	{
		super.lancarMagia(oponente);
		oponente.vida -= 8;
	}
}
