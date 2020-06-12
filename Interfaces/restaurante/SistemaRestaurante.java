package restaurante;

import java.util.ArrayList;
import java.util.List;

public class SistemaRestaurante {
	
	protected List<Cliente> clientes;
	protected List<Item> pedidos;

	private double saldoRestaurante;
	
	

	public SistemaRestaurante() 
	{
		clientes = new ArrayList<Cliente>();
	}
	
	public void adicionarCliente(Cliente c) 
	{
		clientes.add(c);
	}
	
	public void adicionarPedido (int mesa, Item i) throws ClienteInexistenteException 
	{	
		boolean existeMesa = false;
		for (Cliente c : clientes) {
			if(c.getMesa() == mesa) 
			{	
				pedidos.add(i);
				existeMesa = true;
			}
		}
		if(existeMesa == false) 
		{
			throw new ClienteInexistenteException("Cliente Inexistente");
		}
	}
	
	public void removerPedido (int mesa, Item i) throws PedidoInexistenteException 
	{	
		boolean existePedido = false;
		for (Cliente c : clientes) {
			if(c.getMesa() == mesa) 
			{	
				pedidos.remove(i);
				existePedido = true;
			}
			if(existePedido == false) 
		{
			throw new PedidoInexistenteException("Pedido Inexistente");
		}
		}
	}
	
	public double computaPagamentoCliente(int mesa) 
	{
		double pagamento = 0;
		for (Cliente c : clientes)
		{
			if(c.getMesa() == mesa) 
			{
				pagamento = c.getConta();
				return pagamento;
			}
		}
		return pagamento;
	}
	
	public void receberPagamentoCliente(int mesa, double pagamento) throws PagamentoInvalidoException 
	{
		saldoRestaurante = 0;
		for (Cliente c : clientes) {
			if(c.getMesa() == mesa) {
				if(pagamento != computaPagamentoCliente(mesa)) 
				{
					throw new PagamentoInvalidoException("Pagamento inválido, o valor não corresponde com a conta");
				}
				else 
				{
					saldoRestaurante += pagamento;
					c.pedidos.clear();
				}
			}
		}
	}
	public List<Cliente> getClientes()
	{
		return clientes;
	}
	public double getSaldoRestaurante() {
		return saldoRestaurante;
	}
}