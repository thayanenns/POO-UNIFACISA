package zoologico;

public class Animal {
	private String nome;
	private int idade;
	
	public Animal(String nome, int idade) 
	{
		this.nome = nome;
		this.idade = idade;
	}
	
	public void emitirSom() 
	{
		System.out.println("Animal emitindo som");
	}
	
	@Override
	public String toString() 
	{
		return "Nome: "+nome+"; Idade: "+ idade;
	}


}
