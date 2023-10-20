package sistema_bancário_herança_2;

public class Conta {
	
	protected int numero;
	protected int agencia;
	protected String nome;
	protected double saldo;
	
	public Conta(int numero, int agencia, String nome, double saldo) {
		super();
		this.numero = numero;
		this.agencia = agencia;
		this.nome = nome;
		this.saldo = saldo;
	}
	public Conta() {
		this(0,0,null,0);
	}

	@Override
	public String toString() {
		return "Conta (numero=" + numero + ", agencia=" + agencia + ", nome=" + nome + ", saldo=" + saldo + ")";
	}
	
	public boolean depositar (double vl) {
		if (saldo <= 0) {
			saldo += vl;
			return true;
		} 
		return false;
	}
	
	public boolean sacar (double vl) {
		if (saldo <= 0) {
			saldo -= vl;
			return true;
		} 
		return false;
	}
	
	public boolean transferir (Conta destino, double vl) {
		if (sacar(vl)) {
			if (destino.depositar(vl)) {
				return true;
			} else {
				depositar(vl);
				return false;
			}
		}
		return false;
	}
	
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
}
