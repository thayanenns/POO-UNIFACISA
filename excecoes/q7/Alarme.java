package questao7;


import java.util.Date;
import java.util.GregorianCalendar;

public class Alarme {
	private int hora;
	private int minuto;

	public Alarme(int hora, int minuto) throws HoraInvalidaException , MinutoInvalidoException{
		if(hora < 0 || hora > 23 ) 
		{
			throw new HoraInvalidaException("A hora digitada é inválida");
		}
		if(minuto<0 || minuto > 59)
		{
			throw new MinutoInvalidoException("O minuto digitado é inválido");
		}
		this.hora = hora;
		this.minuto = minuto;
	}

	public boolean isAgora() {
		GregorianCalendar agora = new GregorianCalendar();
		agora.setTime(new Date());
		return this.hora == agora.get(GregorianCalendar.HOUR_OF_DAY)
				&& this.minuto == agora.get(GregorianCalendar.MINUTE);
	}
}
