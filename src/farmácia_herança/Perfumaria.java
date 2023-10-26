package farmácia_herança;

public class Perfumaria extends Produto{
	
	public Perfumaria() {
		super();
	}

	public Perfumaria(String nome, int estoque, double valor) {
		super(nome, estoque, valor);
	}

	@Override
	public boolean venda(Cliente cliente, int qt) {
		cliente.setSaldoDevedor(-valor * qt);
		if (getEstoque() > 0 && cliente.getSaldoDevedor() > -100) {
			return true;
		} else {
			System.out.println("Divida acima de R$100,00. Compra nao efetuada!\n");
			cliente.setSaldoDevedor(cliente.getSaldoDevedor() + valor * qt);
			return false;
		}
	}
}
