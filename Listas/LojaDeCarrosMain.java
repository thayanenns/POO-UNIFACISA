package q3;

public class LojaDeCarrosMain {
	public static void main(String[] args) {
		 LojaDeCarros carro1 = new LojaDeCarros("Civic","Honda","Azul",110000,4,true,true,true,true, 0);
		 LojaDeCarros carro2 = new LojaDeCarros("Corolla","Toyota","Preto",110000, 4, true, true, true, true, 1);
	        
	     LojaDeCarros loja = new LojaDeCarros();
	     loja.adicionarCarro(carro1);
	     loja.adicionarCarro(carro2);
	     
	     loja.adicionarPromocaoCarro(0);
	     loja.adicionarPromocaoCarro(1);
	     
	     loja.exibirCarrosDisponiveis();
//	     
//	     loja.venderCarro(0);
//	     loja.venderCarro(1);
//	     loja.limparVendidos();
	     System.out.println("Renda das Vendas: R$ "+loja.computaApuradoDasVendas());
		}	
	}
// Obs: "computaApuradoDasVendas()" possui erros.


