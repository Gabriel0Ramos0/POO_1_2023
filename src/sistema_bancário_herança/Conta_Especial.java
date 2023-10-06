package sistema_bancário_herança;

import javax.swing.JOptionPane;

public class Conta_Especial extends Conta {

	public Conta_Especial(int numero, int agencia, String nome, double saldo) {
		super(numero, agencia, nome, saldo);
		JOptionPane.showMessageDialog(null, "Conta Especial selecionada!");
	}

}
