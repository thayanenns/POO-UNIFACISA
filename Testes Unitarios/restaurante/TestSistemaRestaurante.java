package restaurante;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestSistemaRestaurante {

	Cliente cliente;
	SistemaRestaurante sr;
	
	@Before
	public void setUp() 
	{
		cliente = new Cliente(1);
		sr = new SistemaRestaurante();
		sr.adicionarCliente(cliente);
	}
	
	@Test
	public void testAdicionarCliente() {
		
		Assert.assertNotNull(sr.getClientes());
		Assert.assertEquals(1, sr.getClientes().size());
	}
	
	@Test
	public void testAdicionarPedido() throws ClienteInexistenteException {
		Cardapio c = new Cardapio();
		cliente.adicionarPedido(c.getRefeicao().get(2));
		Assert.assertTrue(cliente.pedidos.contains(c.getRefeicao().get(2)));
		
	}
	
	@Test
	public void testRemoverPedido() throws PedidoInexistenteException{
		Cardapio c = new Cardapio();
		cliente.adicionarPedido(c.getRefeicao().get(2));
		cliente.removePedido(c.getRefeicao().get(2));
		Assert.assertFalse(cliente.pedidos.contains(c.getRefeicao().get(2)));
	}
	
	
	@Test
	public void testComputarPagamentoCliente() 
	{
		Assert.assertEquals(0.0,sr.computaPagamentoCliente(cliente.getMesa()),0.00001);
		
	}
	
	@Test(expected=PagamentoInvalidoException.class)
	public void testReceberPagamentoCliente() throws PagamentoInvalidoException {
		sr.adicionarCliente(cliente);
		sr.receberPagamentoCliente(cliente.getMesa(), 150);
		Assert.assertEquals(0.0,sr.getSaldoRestaurante(),0.0000001);
	}
}





	
