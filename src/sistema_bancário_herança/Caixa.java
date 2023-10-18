package sistema_bancário_herança;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Caixa {
		
	private String caixa;
	private int nu;
	
	static ArrayList<Conta> listaDeContas = new ArrayList<>();
	
	public Caixa() {
	    selecionaCaixa();
	    realizaOperacao();
	}
	
	public void selecionaCaixa() {
		JOptionPane.showMessageDialog(null, "Caixas Disponíveis:\n" + "1- Caixa 1\n" + "2- Caixa 2\n" + "3- Caixa 3\n");
		setNu(Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o número correspondente ao caixa")));
		if (getNu() == 1) {
			setCaixa ("Caixa 1");
		} else if (getNu() == 2) {
			setCaixa ("Caixa 2");
		} else {
			setCaixa ("Caixa 3");
		}
	}
	
	public void realizaOperacao() {
		Conta contaSelecionada = Principal.localizaConta();
        if (contaSelecionada != null) {
            if (contaSelecionada instanceof Conta_Corrente) {
                ((Conta_Corrente) contaSelecionada).SelecionaOperação();
            } else if (contaSelecionada instanceof Conta_Especial) {
                ((Conta_Especial) contaSelecionada).SelecionaOperação();
            } else if (contaSelecionada instanceof Conta_Universitaria) {
                ((Conta_Universitaria) contaSelecionada).SelecionaOperação();
            } else {
                JOptionPane.showMessageDialog(null, "Tipo de conta não suportado!");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Conta não encontrada!");
        }
	}

	public String getCaixa() {
		return caixa;
	}

	public void setCaixa(String caixa) {
		this.caixa = caixa;
	}

	public int getNu() {
		return nu;
	}

	public void setNu(int nu) {
		if (nu > 0 & nu < 4) {
		this.nu = nu;
		} else {
			setNu (Integer.parseInt(JOptionPane.showInputDialog(null, "Selecione um número correspondente 1/2/3!")));
		}
	}
	
}
