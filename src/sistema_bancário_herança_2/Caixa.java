package sistema_bancário_herança_2;

public class Caixa {
	
	public static boolean depositar(Conta conta, double vl) {
		return conta.deposito(vl);
	}
	
	public static boolean sacar(Conta conta, double vl) {
		return conta.saque(vl);
	}
	
	public static boolean trasferir(Conta conta, Conta destino, double vl) {
		return conta.transferencia(destino, vl);
	}
}
