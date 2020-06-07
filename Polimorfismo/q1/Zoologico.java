package zoologico;

import java.util.ArrayList;
import java.util.List;

public class Zoologico{
	List<Animal> jaulas;
	public Zoologico() 
	{
		jaulas = new ArrayList<Animal>();
		Cachorro c = new Cachorro("Tom",3);
		Cachorro c1 = new Cachorro("Jerry",3);
		Cachorro c2 = new Cachorro("Fred",3);
		Preguica p = new Preguica("Soneca", 4);
		Cavalo ca = new Cavalo("Azulão", 8);
		jaulas.add(c);
		jaulas.add(c1);
		jaulas.add(c2);
		jaulas.add(p);
		jaulas.add(ca);

	}
	
	public void cutucarAnimais() 
	{
		for(Animal j:jaulas) 
		{
			j.emitirSom();
			if(j instanceof Cachorro)
			{
				Cachorro c = (Cachorro) j;
				c.correr();
				
			}
			if(j instanceof Cavalo) 
			{
				Cavalo ca = (Cavalo) j;
				ca.correr();
			}
			
			if(j instanceof Preguica) 
			{
				Preguica p = (Preguica) j;
			}
			
		}
	}
	
	public Zoologico(Animal...animais) 
	{
		jaulas = new ArrayList<Animal>();
		for (Animal a : animais) 
		{
			jaulas.add(a);
		}
	}
		public String escala(String a) 
		{
			if (a == "cachorro" || a == "cavalo") 
			{
				return "Não escala";
			}
			return "Escala";		
		}
	}


