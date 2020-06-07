package mk;

public class Lutador {
	protected String nome;
	protected int vida;
	
	public Lutador(String nome) 
	{
		this.nome = nome;
		this.vida = 100;
	}
	
	public void socar(Lutador oponente) 
	{
		oponente.vida -= 7;
		System.out.println(nome + " acabou de socar "+oponente.nome);
	}
	public void chutar(Lutador oponente) 
	{
		oponente.vida -= 5;
		System.out.println(nome + " acabou de chutar "+oponente.nome);
	}
	public void atirar(Lutador oponente) 
	{
		oponente.vida -= 10;
		System.out.println(nome + " acabou de atirar em "+oponente.nome);
	}
	public void lancarMagia(Lutador oponente) 
	{
		oponente.vida -= 12;
		System.out.println(nome + " acabou de lan�ar uma magia em "+oponente.nome);
	}
	
	public String getNome() 
	{
		return nome;
	}
	
	public int getVida() 
	{
		return vida;
	}
	
	public void frase()
	{
		switch(nome) {
		case "Jax":
			 System.out.println("Jax: Matar voc� ser� um prazer!" + "\n");
			 break;
		case "Liu Kang":
			 System.out.println("Liu Kang: Use sua cabe�a ou voc� a perder�!" + "\n");
			break;
		case "NigthWolf":
			System.out.println("NightWolf: Corra! Sua alma n�o est� segura! " + "\n");
			break;
		case "Raiden":
			System.out.println("Raiden: Sua dor foi predestinada!" +  "\n");
			break;
		case "Sub-Zero":
			System.out.println("Sub-Zero: Congelarei sua alma!" + "\n");
			break;
		case "S�nia":
			System.out.println("S�nia: Eu vou quebrar A- SUA - CARA! " + "\n");
			break;
		}
			
	}
	@Override
	public String toString() 
	{
		return "Lutador: " + nome + ", Vida: "+ vida;
	}
}


