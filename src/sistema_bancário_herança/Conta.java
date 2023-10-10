package sistema_bancário_herança;

import javax.swing.JOptionPane;

public class Conta {
	
	protected int numero;
	protected int agencia;
	protected String nome;
	protected double saldo;
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
		setSaldo (Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o saldo")));
	}
	
	public Conta selecionaConta() {
		int num = Integer.parseInt(JOptionPane.showInputDialog(null, "Selecione uma conta:\n" + "1- Corrente\n" + "2- Especial\n" + "3- Universitária"));
        Conta contaSelecionada = null;

        if (num == 1) {
            contaSelecionada = new Conta_Corrente(getNumero(), getAgencia(), getNome(), getSaldo());
        } else if (num == 2) {
            contaSelecionada = new Conta_Especial(getNumero(), getAgencia(), getNome(), getSaldo());
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
		this.numero = numero;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public int getNu() {
		return nu;
	}

	public void setNu(int nu) {
		this.nu = nu;
	}
		
}
