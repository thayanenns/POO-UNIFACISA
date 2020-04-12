package q2;
import java.util.ArrayList;
import java.util.List;
public class SistemaInterpol{
	List<String> procurados = new ArrayList <String>();

	public void adicionarProcurados(String nomes) 
	{
		procurados.add(nomes);
	}
		
	public boolean ehProcurado(String nome) 
	{	
		boolean ehProcurado = false;
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


