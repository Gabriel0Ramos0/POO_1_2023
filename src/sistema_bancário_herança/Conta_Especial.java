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
		Operação operação = new Operação();
		
		if (getNu() == 1) {
			operação.Deposito(this, listaDeContas);
			
		} else if (getNu() == 2) {
			Saque();
			
		} else if (getNu() == 3) {
			Transferencia(this, listaDeContas);
		}
	}
	
	public void Saque() {
        double valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o valor da transferência"));
        
        if (valor > getLimite()) {
        	JOptionPane.showMessageDialog(null, "Não é possível transferir este valor, pois passa do limite oferecido!");
        } else if (valor <= 0) {
            JOptionPane.showMessageDialog(null, "O valor da transferência deve ser maior que zero.");
        } else if (valor > getSaldo()) {
            JOptionPane.showMessageDialog(null, "Saldo insuficiente para realizar a transferência.");
        } else {
            setSaldo(getSaldo() - valor);
            JOptionPane.showMessageDialog(null, "Transferência de R$" + valor + " realizado com sucesso!");
        }
    }
	
	public void Transferencia(Conta contaOrigem, ArrayList<Conta> listaDeContas) {
        double valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o valor da Transferência"));
        
        if (valor > getLimite()) {
        	JOptionPane.showMessageDialog(null, "Não é possível Transferir este valor, pois passa do limite oferecido!");
        } else if (valor <= 0) {
            JOptionPane.showMessageDialog(null, "O valor da transferência deve ser maior que zero.");
        }    
        Conta contaDestino = Caixa.localizaConta();
            
        if (contaDestino == null) {
            JOptionPane.showMessageDialog(null, "Conta de destino não encontrada.");
            return;
        }
        
        if (contaOrigem != contaDestino) {
            if ((contaOrigem.getSaldo() - valor) < 0 || (contaOrigem.getSaldo() + valor) > contaOrigem.getLimite()) {
                JOptionPane.showMessageDialog(null, "Transferência não permitida devido ao limite ou saldo insuficiente.");
                return;
            }

            double novoSaldoOrigem = contaOrigem.getSaldo() - valor;
            contaOrigem.setSaldo(novoSaldoOrigem);

            double novoSaldoDestino = contaDestino.getSaldo() + valor;
            contaDestino.setSaldo(novoSaldoDestino);

            JOptionPane.showMessageDialog(null, "Transferência de R$" + valor + " realizada com sucesso da conta de origem para a conta de destino.");
        } else {
            JOptionPane.showMessageDialog(null, "Você não pode transferir para a mesma conta.");
        }
    }
}
