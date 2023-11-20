package sistema_bancário_herança_2;

public class Conta_Especial extends Conta{
	
	private double limite;

	public Conta_Especial() {
		super();
	}

	public Conta_Especial(int numero, int agencia, String nome, double saldo, double limite) {
		super(numero, agencia, nome, saldo);
		this.limite = limite;
	}	

	@Override
	public boolean saque(double vl) {
		if(getLimite() + saldo >= vl) {
			saldo -= vl;
			return true;
		}
		return false;
	}
	
	@Override
	public String toString() {
		return "Conta_Especial limite=" + getLimite();
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
	
}
