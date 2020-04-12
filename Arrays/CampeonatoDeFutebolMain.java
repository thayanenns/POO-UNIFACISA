package q3;
import java.util.Arrays;

public class CampeonatoDeFutebolMain 
{
	public static void main(String[] args)
	{
		CampeonatoDeFutebol camp = new CampeonatoDeFutebol();
		camp.adicionarTimes("Treze Campinense Botafogo Autoesporte");
		
		String[] jogos = camp.criarCampeonato();
		System.out.println(Arrays.toString(jogos));
		
	}

}

