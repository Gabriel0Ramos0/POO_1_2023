package sistema_bancário_herança;

import javax.swing.JOptionPane;

public class Conta {
	
	protected int numero;
	protected int agencia;
	protected String nome;
	protected double saldo;
	protected double limite;
	protected int nu;
	
	public Conta (int numero, int agencia, String nome, double saldo) {
		this.numero = numero;
		this.agencia = agencia;
		this.nome = nome;
		this.saldo = saldo;
	}
	
	public void CadastraConta() {
		setNumero (Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o número da conta")));
		setAgencia (Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o número da agência")));
		setNome (JOptionPane.showInputDialog(null, "Informe o nome do corretista (Usuário)"));
		if (this instanceof Conta_Especial) {
	        double limiteEspecial = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o limite da Conta Especial"));
	        ((Conta_Especial) this).setLimite(limiteEspecial);
	    }
		setSaldo (Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o saldo")));
		if (this instanceof Conta_Especial) {
			if (getSaldo() > getLimite()) {
				setSaldo (Double.parseDouble(JOptionPane.showInputDialog(null, "Valor acima do permitido (R$ " + getLimite() + "). Por favor, digite um valor dentro do limite!")));
			}
	    }
		if (this instanceof Conta_Universitaria) {
			if (getSaldo() > 2000) {
				setSaldo (Double.parseDouble(JOptionPane.showInputDialog(null, "Valor acima do permitido (R$ 2.000,00). Por favor, digite um valor dentro do limite!")));
			}
	    }
	}
	
	public Conta selecionaConta() {
		int num = Integer.parseInt(JOptionPane.showInputDialog(null, "Selecione uma conta:\n" + "1- Corrente\n" + "2- Especial\n" + "3- Universitária"));
        Conta contaSelecionada = null;

        if (num == 1) {
            contaSelecionada = new Conta_Corrente(getNumero(), getAgencia(), getNome(), getSaldo());
        } else if (num == 2) {
            contaSelecionada = new Conta_Especial(getNumero(), getAgencia(), getNome(), getSaldo(), getLimite());
        } else if (num == 3) {
            contaSelecionada = new Conta_Universitaria(getNumero(), getAgencia(), getNome(), getSaldo());
        }
        return contaSelecionada;
    }
	
	@Override
	public String toString() {
	    String tipoConta = "";
	    
	    if (this instanceof Conta_Corrente) {
	        tipoConta = "Conta Corrente";
	    } else if (this instanceof Conta_Especial) {
	        tipoConta = "Conta Especial";
	    } else if (this instanceof Conta_Universitaria) {
	        tipoConta = "Conta Universitária";
	    } else {
	        tipoConta = "Tipo de conta desconhecido";
	    }

	    return "Tipo de Conta: (" + tipoConta + ")\n" +
	           "Número: " + numero + "\n" +
	           "Agência: " + agencia + "\n" +
	           "Nome do correntista: " + nome + "\n" +
	           "Saldo: R$" + saldo;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		if (numero > 0) {
	        this.numero = numero;
		} else {
			setNumero(Integer.parseInt(JOptionPane.showInputDialog(null, "O número deve ser maior que 0!")));
		}
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		if (agencia > 0) {
			this.agencia = agencia;
		} else {
			setAgencia(Integer.parseInt(JOptionPane.showInputDialog(null, "O número da agência deve ser maior que 0!")));
		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if(nome != null && !nome.isEmpty()) {
			this.nome = nome;
		} else {
			setNome(JOptionPane.showInputDialog("É nescessário informar o nome!"));
		}
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		if (saldo > 0) {
			this.saldo = saldo;
		} else {
			setSaldo(Double.parseDouble(JOptionPane.showInputDialog(null, "O saldo deve ser maior que 0!")));
		}
	}

	public int getNu() {
		return nu;
	}

	public void setNu(int nu) {
		if (nu > 0) {
		this.nu = nu;
		} else {
			setNu (Integer.parseInt(JOptionPane.showInputDialog(null, "O número deve ser maior que 0!")));
		}
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		if (limite > 0) {
			this.limite = limite;
		} else {
			setLimite(Double.parseDouble(JOptionPane.showInputDialog(null, "O limite deve ser maior que 0!")));
		}
	}
}
