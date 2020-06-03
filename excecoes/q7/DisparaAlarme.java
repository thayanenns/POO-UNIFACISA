package questao7;
import java.util.Scanner;

public class DisparaAlarme {
	public static void main(String[] args) throws InterruptedException, HoraInvalidaException, MinutoInvalidoException {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite a hora do alarme: ");
		int hora = teclado.nextInt();
		System.out.print("Digite o minuto do alarme: ");
		int minuto = teclado.nextInt();
		Alarme alarme;
		try {
			alarme = new Alarme(hora, minuto);
			while (!alarme.isAgora()) {
				System.out.print(".");
				Thread.sleep(1000);
			}
			System.out.println();
			System.out.println("Alarme disparado");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		catch(HoraInvalidaException f) 
		{
			f.printStackTrace();
		}
		catch(MinutoInvalidoException g) 
		{
			g.printStackTrace();
		}
		teclado.close();

	}
}