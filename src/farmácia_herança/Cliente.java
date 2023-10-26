package farmácia_herança;

public class Cliente {
	
	private String nome;
	private double saldoDevedor;

	public Cliente() {
		this (null, 0);
	}

	public Cliente(String nome, double saldoDevedor) {
		this.nome = nome;
		this.saldoDevedor = saldoDevedor;
	}
	
	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", saldoDevedor= " + saldoDevedor + "]";
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSaldoDevedor() {
		return saldoDevedor;
	}
	public void setSaldoDevedor(double novoSaldo) {
	    saldoDevedor = novoSaldo;
	}
	
	
}
