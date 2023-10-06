package sistema_bancário_herança;

import javax.swing.JOptionPane;

public class Conta_Universitaria extends Conta{

	public Conta_Universitaria(int numero, int agencia, String nome, double saldo) {
		super(numero, agencia, nome, saldo);
		JOptionPane.showMessageDialog(null, "Conta Universitária selecionada!");
	}

}
