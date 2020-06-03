package q1;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ContaCorrenteTes  {
	

	private static final double TOLERANCE = 0.000000001; 
	ContaCorrente conta1, conta2;
	
	@Before
	public void setup() {
		
		conta1 = new ContaCorrente(5000.00, 1, "Maria");
		conta2 = new ContaCorrente(5000.00, 2, "João");
	}
	

	@Test
	public void testDepositarValorPositivo() throws ValorInvalidoException
	{
		conta1.depositar(1000);
		Assert.assertEquals(1000, conta1.getSaldo(), ContaCorrenteTes.TOLERANCE);
	}

	@Test(expected = ValorInvalidoException.class)
	public void testDepositarValorNegativo() throws ValorInvalidoException
	{
		conta1.depositar(-1000);
		Assert.assertEquals(0, conta1.getSaldo(), ContaCorrenteTes.TOLERANCE);
	}
	

	@Test(expected = ValorInvalidoException.class)
	public void testDepositarValorNulo() throws ValorInvalidoException
	{
		conta1.depositar(0);
	}
	
	@Test
	public void testDebitarValorPositivo() throws ValorInvalidoException 
	{
		conta1.depositar(1000);
		conta1.debitar(100);
		Assert.assertEquals(900, conta1.getSaldo(), ContaCorrenteTes.TOLERANCE);
	}
	
	@Test(expected = ValorInvalidoException.class)
	public void testDebitarValorNegativo() throws ValorInvalidoException 
	{
		conta1.debitar(-100);
	}
	@Test(expected = ValorInvalidoException.class)
	public void testDebitarValorNulo() throws ValorInvalidoException
	{
		conta1.debitar(0);
	}
	
	@Test
	public void testVerificaRetirada() {
		
		Assert.assertTrue(conta1.verificaRetirada(500));
		Assert.assertFalse(conta1.verificaRetirada(5001));
		
	}

	@Test
	public void testTransferir() throws ValorInvalidoException 
	{	
		Assert.assertEquals(true, conta1.transferir(500, conta2));
		Assert.assertEquals(true, conta2.transferir(200, conta1));
	}
	@Test(expected = ValorInvalidoException.class)
	public void testTransferirValorInvalidos() throws ValorInvalidoException 
	{	 
		Assert.assertEquals(false, conta1.transferir(-200, conta2));
		Assert.assertEquals(false, conta1.transferir(0, conta2));
	}
	
}
	
	
