package restaurante;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
	private int mesa;
	List<Item> pedidos;
	
	public Cliente(int mesa) 
	{
		this.mesa = mesa;
		this.pedidos = new ArrayList<Item>();
	}
	
	public int getMesa() 
	{
		return mesa;
	}
	
	public void adicionarPedido(Item i) 
	{
		pedidos.add(i);
	}
	
	public void removePedido(Item i) 
	{
		pedidos.remove(i);
	}
	
	public double getConta() 
	{
		double total = 0;
		for (Item item : pedidos) {
			total += item.getPreco();
		}
		return total;
	}
	
	public List<Item> getPedidos()
	{
		return pedidos;
	}

}
