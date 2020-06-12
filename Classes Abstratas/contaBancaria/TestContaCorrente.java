package contaBancaria;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestContaCorrente {

	ContaCorrente conta1;
	ContaPoupanca conta2;
	
	
	static final double DOUBLE_TOLERANCE = 0.000001;
	
	
	@Before
	public void setup() 
	{
		conta1 = new ContaCorrente("João", "1234");
		conta2 = new ContaPoupanca("Maria", "12345");
		
	}

	@Test
	public void testTransferir() throws SaldoInsuficienteException, SenhaInvalidaException
	{

		conta1.transferir("1234", 4000, conta2);
		Assert.assertEquals(2000, conta1.getSaldo(),DOUBLE_TOLERANCE);
		Assert.assertEquals(9990, conta2.getSaldo(),DOUBLE_TOLERANCE);
		
		conta2.transferir("12345", 5000, conta1);
		Assert.assertEquals(4985, conta2.getSaldo(),DOUBLE_TOLERANCE);
		Assert.assertEquals(7000, conta1.getSaldo(),DOUBLE_TOLERANCE);
		
		conta1.transferir("1234", 5000, conta2);
		Assert.assertEquals(2000,conta1.getSaldo(),DOUBLE_TOLERANCE);
		Assert.assertEquals(9970, conta2.getSaldo(),DOUBLE_TOLERANCE);
		
	}
		
	@Test(expected=SaldoInsuficienteException.class)
	public void testSaldo()throws SaldoInsuficienteException, SenhaInvalidaException{
		conta1.transferir("1234", 50000, conta2);
	}

	@Test(expected= SenhaInvalidaException.class)
	public void testSenha()throws SaldoInsuficienteException, SenhaInvalidaException{
		conta2.transferir("senha", 1000, conta1);
	}
	
//	

}