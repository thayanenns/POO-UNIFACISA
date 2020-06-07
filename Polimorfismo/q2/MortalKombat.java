package mk;

import java.util.Random;

public class MortalKombat {
	private Lutador l1, l2;
	

	public MortalKombat(Lutador l1, Lutador l2) 
	{
		this.l1 = l1;
		this.l2 = l2;
		figth();
	}
	
	public void figth() 
	{	l1.frase();
		l2.frase();
		while(l1.getVida() > 0 && l2.getVida() > 0) 
		{
			Random r = new Random();
			int lutadorDaVez = r.nextInt((2)+1);
			int golpeDaVez = r.nextInt((4)+1);
			if (lutadorDaVez == 1)
			{
				switch (golpeDaVez) {
				case 1:
					l1.socar(l2);
					break;
				case 2:
					l1.chutar(l2);
					break;
				case 3:
					l1.atirar(l2);
					break;
				case 4:
					l1.lancarMagia(l2);
					break;
				}
			}
				else if(lutadorDaVez == 2) 
				{
					switch (golpeDaVez) {
					case 1:
						l2.socar(l1);
						break;
					case 2:
						l2.chutar(l1);
						break;
					case 3:
						l2.atirar(l1);
						break;
					case 4:
						l2.lancarMagia(l1);
						break;
					}
				}
		}
		if(l1.getVida() < 0) 
		{
			l1.vida = 0;
		}
		if(l2.getVida() < 0) 
		{
			l2.vida = 0;
		}
		if(l1.getVida() <= 0) 
		{
			System.out.println("\n"+l2.nome + " venceu!!");
		}
		else 
		{
			System.out.println("\n"+l1.nome + " venceu!!");
		}
		
		}

	public static void main(String[] args) {
		Lutador l1 = new Lutador("Jax");
		Lutador l2 = new Lutador("Sonia");
		MortalKombat mk = new MortalKombat(l1,l2);
		}
	}



