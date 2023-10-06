package sistema_bancário_herança;

import javax.swing.JOptionPane;

public class Conta_Corrente extends Conta{

	public Conta_Corrente(int numero, int agencia, String nome, double saldo) {
		super(numero, agencia, nome, saldo);
		JOptionPane.showMessageDialog(null, "Conta Corrente selecionada!");
	}
	
	
}
