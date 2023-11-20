package sistema_bancário_herança_2;

public class Conta_Universitária extends Conta {

	public Conta_Universitária() {
		super();
	}
	
	public Conta_Universitária(int numero, int agencia, String cliente, double saldo) {
		super(numero, agencia, cliente, saldo);
	}
	
	@Override
	public boolean deposito(double vl) {
		if(saldo + vl < 2000) {
			return super.deposito(vl);
		}
		return false;
	}	
}
