package sistema_bancário_herança;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Operação {
	
	private double valor;
	static ArrayList<Conta> listaDeContas = new ArrayList<>();
	
	public void Deposito(Conta conta, ArrayList<Conta> listaDeContas) {
        setValor (Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o valor do depósito")));
        if (getValor() <= 0) {
            JOptionPane.showMessageDialog(null, "O valor do depósito deve ser maior que zero.");
            return;
        }
        
        double novoSaldo = conta.getSaldo() + getValor();
        conta.setSaldo(novoSaldo);

        JOptionPane.showMessageDialog(null, "Depósito de R$" + getValor() + " realizado com sucesso!");
    }
	
	public void Saque(Conta conta, ArrayList<Conta> listaDeContas) {
		setValor (Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o valor do saque")));
        if (getValor() <= 0) {
            JOptionPane.showMessageDialog(null, "O valor do saque deve ser maior que zero.");
            return;
        } else if (valor > conta.getSaldo()) {
            JOptionPane.showMessageDialog(null, "Saldo insuficiente para realizar o saque.");
        }
        
        double novoSaldo = conta.getSaldo() - getValor();
        conta.setSaldo(novoSaldo);

        JOptionPane.showMessageDialog(null, "Saque de R$" + getValor() + " realizado com sucesso!");
	}

	public void Transferência(Conta contaOrigem, ArrayList<Conta> listaDeContas) {
	    setValor(Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o valor da transferência")));
	    if (getValor() <= 0) {
	        JOptionPane.showMessageDialog(null, "O valor da transferência deve ser maior que zero.");
	        return;
	    }

	    Conta contaDestino = Principal.localizaConta();

	    if (contaDestino == null) {
	        JOptionPane.showMessageDialog(null, "Conta de destino não encontrada.");
	        return;
	    }

	    if (contaOrigem != contaDestino) {
	        if (contaOrigem.getSaldo() >= getValor()) {
	            double novoSaldoOrigem = contaOrigem.getSaldo() - getValor();
	            contaOrigem.setSaldo(novoSaldoOrigem);

	            double novoSaldoDestino = contaDestino.getSaldo() + getValor();
	            contaDestino.setSaldo(novoSaldoDestino);

	            JOptionPane.showMessageDialog(null, "Transferência de R$" + getValor() + " realizada com sucesso da conta de origem para a conta de destino.");
	        } else {
	            JOptionPane.showMessageDialog(null, "Saldo insuficiente para realizar a transferência.");
	        }
	    } else {
	        JOptionPane.showMessageDialog(null, "Você não pode transferir para a mesma conta.");
	    }
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
}
