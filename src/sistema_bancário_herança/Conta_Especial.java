package sistema_bancário_herança;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Conta_Especial extends Conta {
	ArrayList<Conta> listaDeContas;

	public Conta_Especial(int numero, int agencia, String nome, double saldo, double limite) {
		super(numero, agencia, nome, saldo);
		JOptionPane.showMessageDialog(null, "Conta Especial selecionada!");
	}
	public void SelecionaOperação() {
		setNu (Integer.parseInt(JOptionPane.showInputDialog(null, "Operações:\n\n" + "1- Depósito\n" + "2- Saque\n" + "3- Transferência")));
		
		if (getNu() == 1) {
			super.Deposito();
		} else if (getNu() == 2) {
			Saque();
		} else if (getNu() == 3) {
			super.Transferência();
		}
	}
	
	@Override
	public void Saque() {
        double valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o valor do saque"));
        
        if (valor > getLimite()) {
        	JOptionPane.showMessageDialog(null, "Não é possível sacar este valor, pois passa do limite oferecido!");
        } else if (valor <= 0) {
            JOptionPane.showMessageDialog(null, "O valor do saque deve ser maior que zero.");
        } else if (valor > getSaldo()) {
            JOptionPane.showMessageDialog(null, "Saldo insuficiente para realizar o saque.");
        } else {
            setSaldo(getSaldo() - valor);
            JOptionPane.showMessageDialog(null, "Saque de R$" + valor + " realizado com sucesso!");
        }
    }
	
	@Override
	public void Transferência() {
        double valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o valor da Transferência"));
        
        if (valor > getLimite()) {
        	JOptionPane.showMessageDialog(null, "Não é possível Transferir este valor, pois passa do limite oferecido!");
        } else if (valor <= 0) {
            JOptionPane.showMessageDialog(null, "O valor da transferência deve ser maior que zero.");
        }    
        Conta contaDestino = Principal.localizaConta();
            
        if (contaDestino == null) {
            JOptionPane.showMessageDialog(null, "Conta de destino não encontrada.");
            return;
        }
        
            if ((getSaldo() - valor) < 0 || (getSaldo() + valor) > getLimite()) {
                JOptionPane.showMessageDialog(null, "Transferência não permitida devido ao limite ou saldo insuficiente.");
                return;
            }

            double novoSaldoOrigem = getSaldo() - valor;
            setSaldo(novoSaldoOrigem);

            double novoSaldoDestino = contaDestino.getSaldo() + valor;
            contaDestino.setSaldo(novoSaldoDestino);

            JOptionPane.showMessageDialog(null, "Transferência de R$" + valor + " realizada com sucesso da conta de origem para a conta de destino.");
        }
    }
