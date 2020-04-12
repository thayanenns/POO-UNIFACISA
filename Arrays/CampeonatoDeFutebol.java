package q3;
import java.util.Arrays;

public class CampeonatoDeFutebol {
	
	String[] times;
	
	public void adicionarTimes(String times)
	{
		this.times = times.split(" ");
	}
	
	public String[] criarCampeonato() 
	{
		int qtddJogos = (this.times.length - 1)*2;
		String [] campeonato = new String[qtddJogos];
		int contador = 0;
		for(int i = 0; i < times.length - 1; i++) 
		{
			String timeCasa = times[i];
			for(int j = i+1; j < times.length; j++) 
			{
				String timeFora = times[j];
				campeonato[contador] = timeCasa + " X " + timeFora;
				contador++;
			}
		}
		return campeonato;		
	}	
}
