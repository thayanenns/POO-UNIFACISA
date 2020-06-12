package restaurante;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class TestCliente {

	Cliente cliente;
	
	
	@Before
	public void setUp() {
	
	cliente = new Cliente(1);
	}
	
	@Test
	public void testGetMesa() 
	{
		Assert.assertEquals(1, cliente.getMesa());
	}
	
	@Test
	public void testAdicionarPedido() 
	{
		Cardapio c = new Cardapio();
		cliente.adicionarPedido(c.getCardapio().get(1));
		Assert.assertNotNull(cliente.getPedidos());
		
		Assert.assertEquals(c.getCardapio().get(1), cliente.getPedidos().get(0));
	}
	
	@Test
	public void testRemovePedido() 
	{
		Cardapio c = new Cardapio();
		cliente.adicionarPedido(c.getCardapio().get(1));
		cliente.removePedido(c.getCardapio().get(1));
		Assert.assertFalse(cliente.getPedidos().contains(c.getCardapio().get(1)));
	}
	
	@Test
	public void testGetConta() 
	{
		Cardapio c = new Cardapio();
		cliente.adicionarPedido(c.getCardapio().get(1));
		Assert.assertEquals(16, cliente.getConta(), 0.00001);
		
		cliente.removePedido(c.getCardapio().get(1));
		Assert.assertEquals(0, cliente.getConta(), 0.00001);
	}
	
	
	
	
}
