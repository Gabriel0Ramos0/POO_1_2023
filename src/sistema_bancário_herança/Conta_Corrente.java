package sistema_bancário_herança;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Conta_Corrente extends Conta{
	ArrayList<Conta> listaDeContas;

	public Conta_Corrente(int numero, int agencia, String nome, double saldo) {
		super(numero, agencia, nome, saldo);
		JOptionPane.showMessageDialog(null, "Conta Corrente selecionada!");
	}
	public void SelecionaOperação() {
		setNu (Integer.parseInt(JOptionPane.showInputDialog(null, "Operações:\n\n" + "1- Depósito\n" + "2- Saque\n" + "3- Transferência")));
		
		if (getNu() == 1) {
			super.Deposito();
		} else if (getNu() == 2) {
			super.Saque();
		} else if (getNu() == 3) {
			super.Transferência();
		}
	}
}
