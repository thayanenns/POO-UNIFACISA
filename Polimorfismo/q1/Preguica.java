package zoologico;

public class Preguica extends Animal{

	public Preguica(String nome, int idade) 
	{
		super(nome, idade);
	}
	
	public void escalarArvore() 
	{
		System.out.println("Sim");
	}
	
	@Override
	public void emitirSom() 
	{
		System.out.println("ZZzzzzzzzz");
	}
	
	public void correr() 
	{
		System.out.println("Não vou correr");
	}
	
}
