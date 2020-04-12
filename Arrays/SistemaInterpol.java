package q2;
public class SistemaInterpol 
{
	String [] procurados;
	
	
	public void adicionarProcurados(String nomes) 
	{
		this.procurados = nomes.split(" ");
	}
	
	public boolean ehProcurado(String nome) 
	{	boolean ehProcurado = false;
		for (String busca:procurados) 
		{
			if (busca.equalsIgnoreCase(nome))
			{
				ehProcurado = true;
			}
		}
		return ehProcurado;
		
	}
}
