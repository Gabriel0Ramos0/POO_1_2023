package sistema_bancário_herança_2;

public class Conta_Especial extends Conta{
	
	private double limite = 0;

	
	
	public Conta_Especial() {
		super();
		setLimite (0);
	}

	public Conta_Especial(int numero, int agencia, String nome, double saldo, double limite) {
		super(numero, agencia, nome, saldo);
		this.limite = limite;
	}	

	@Override
	public boolean sacar(double vl) {
		if(limite + saldo >= vl) {
			saldo -= vl;
			return true;
		}
		return false;
	}
	
	@Override
	public String toString() {
		return "Conta_Especial [limite=" + limite + "]";
	}




	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	
}
