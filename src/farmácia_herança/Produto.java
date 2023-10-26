package farmácia_herança;

public class Produto {
	
	protected String nome;
	protected int estoque;
	protected double valor;
	
	public Produto(String nome, int estoque, double valor) {
		super();
		this.nome = nome;
		this.estoque = estoque;
		this.valor = valor;
	}
	
	public Produto() {
		this (null, 0, 0);
	}

	@Override
	public String toString() {
		return "Produto\n\n [nome= " + nome + " - estoque= " + estoque + " - valor= " + valor + "]";
	}
	
	public boolean venda(Cliente cliente, int qt) {
	    if (estoque > 0 && qt <= estoque) {
	        double valorVenda = -valor * qt;
	        cliente.setSaldoDevedor(cliente.getSaldoDevedor() + valorVenda);
	        estoque -= qt;
	        return true;
	    } else {
	        return false;
	    }
	}


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getEstoque() {
		return estoque;
	}

	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
}
