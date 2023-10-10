package sistema_bancário_herança;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Conta_Universitaria extends Conta{
	ArrayList<Conta> listaDeContas;

	public Conta_Universitaria(int numero, int agencia, String nome, double saldo) {
		super(numero, agencia, nome, saldo);
		JOptionPane.showMessageDialog(null, "Conta Universitária selecionada!");
	}
	public void SelecionaOperação() {
		setNu (Integer.parseInt(JOptionPane.showInputDialog(null, "Operações:\n\n" + "1- Depósito\n" + "2- Saque\n" + "3- Transferência")));
		Operação operação = new Operação();
		
		if (getNu() == 1) {
			Deposito(this);
			
		} else if (getNu() == 2) {
			operação.Saque(this, listaDeContas);
			
		} else if (getNu() == 3) {
			Transferencia(this, listaDeContas);
		}
		
	}
	
	public void Deposito(Conta conta) {
		double valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o valor do depósito"));
        if (valor <= 0) {
            JOptionPane.showMessageDialog(null, "O valor do depósito deve ser maior que zero.");
        } else {
            if ((getSaldo() + valor) > 2000) {
                JOptionPane.showMessageDialog(null, "O saldo não pode ultrapassar 2.000,00.");
            } else {
            	double novoSaldo = conta.getSaldo() + valor;
                conta.setSaldo(novoSaldo);

                JOptionPane.showMessageDialog(null, "Depósito de R$" + valor + " realizado com sucesso!");
            }
        }
	}
	
	public void Transferencia(Conta contaOrigem, ArrayList<Conta> listaDeContas) {
        double valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o valor da Transferência"));
        
        if (valor > 2000) {
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
            if ((contaOrigem.getSaldo() - valor) < 0 || (contaOrigem.getSaldo() + valor) > 2000) {
                JOptionPane.showMessageDialog(null, "Transferência não permitida devido ao limite de R$2.000,00 ou saldo insuficiente.");
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
