package farmácia_herança;

public class Equipamentos_Médicos extends Produto {
	
	private int quant;

	public Equipamentos_Médicos() {
		super();
		setQuant (0);
	}

	public Equipamentos_Médicos(String nome, int estoque, double valor, int quant) {
		super(nome, estoque, valor);
		this.quant = quant;
	}

	@Override
	public boolean venda(Cliente cliente, int qt) {		
		if (qt <= getQuant()) {
			cliente.setSaldoDevedor( -valor * qt);
			return true;
		} else {
			System.out.println("Nao ha quantidade para venda. Compra nao efetuada!\n");
			return false;
		}
	}

	public int getQuant() {
		return quant;
	}

	public void setQuant(int quant) {
		this.quant = quant;
	}
		
}
