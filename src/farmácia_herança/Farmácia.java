package farmácia_herança;

import java.util.ArrayList;

public class Farmácia {
	
	public static void main(String[] args) {
		ArrayList <Produto> listaCompra = new ArrayList<Produto> ();
		ArrayList <Cliente> listaCliente = new ArrayList<Cliente> ();
		
		listaCliente.add(new Cliente("Roger", 0));
		listaCliente.add(new Cliente("Valmiro", 0));
		listaCliente.add(new Cliente("Jeferson", 0));
		listaCompra.add(new Medicamento("GEL", 10, 2.50, "SIM", "Marcos"));
		listaCompra.add(new Equipamentos_Médicos("Bisturi", 0, 4.50, 5));
		listaCompra.add(new Perfumaria("Jequiti perfume: Celso Portiolli", 100, 65.80));
		
		//Farmácia.venda(listaCompra.get(0), listaCliente.get(0), 2);
		Farmácia.venda(listaCompra.get(1), listaCliente.get(1), 5);
		//Farmácia.venda(listaCompra.get(2), listaCliente.get(2), 7);

		//System.out.println(listaCompra.get(0));
		//System.out.println(listaCliente.get(0));
		System.out.println(listaCompra.get(1));
		System.out.println(listaCliente.get(1));
		//System.out.println(listaCompra.get(2));
		//System.out.println(listaCliente.get(2));
		
		
	}
	public static boolean venda(Produto produto, Cliente cliente, int qt) {
	    return produto.venda(cliente, qt);
	}
}
