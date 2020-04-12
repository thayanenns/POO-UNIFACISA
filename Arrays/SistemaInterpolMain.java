package q2;

public class SistemaInterpolMain 
{
	public static void main(String [] args) 
	{
		SistemaInterpol sistema = new SistemaInterpol();
		sistema.adicionarProcurados("Phulano Syckrano Bheltranno");
		System.out.println(sistema.ehProcurado("Bheltranno"));
	
	
	}
	

}
