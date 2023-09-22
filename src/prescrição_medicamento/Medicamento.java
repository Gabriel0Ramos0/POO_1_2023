package prescrição_medicamento;

import javax.swing.JOptionPane;

public class Medicamento {
	
	private String nome;
	private String tipo;
	private int nu;
	
	public Medicamento() {
		cadastraM();
	}
	
	public void cadastraM() {
		setNome(JOptionPane.showInputDialog(null, "Informe o nome do medicamento"));
		JOptionPane.showMessageDialog(null, "Adiministração:\n" + "\n1- Injetável" + "\n2- Tópico" + "\n3- Oral");
		setNu(Integer.parseInt(JOptionPane.showInputDialog(null, "Informe um número correspondente! (1/2/3)")));
			if (nu == 1) {
				setTipo ("Injetável");
			} else if (nu == 2) {
				setTipo ("Tópico");
			} else if (nu == 3) {
				setTipo ("Oral");
			}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if(nome != null && !nome.isEmpty()) {
			this.nome = nome;
		}else {
			setNome(JOptionPane.showInputDialog("É nescessário informar o nome do medicamento!"));
		}
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getNu() {
		return nu;
	}

	public void setNu(int nu) {
		while (nu < 1 || nu > 3) {
	        String input = JOptionPane.showInputDialog("Informe um número correspondente! (1/2/3)");
	        nu = Integer.parseInt(input);
	    }
	    this.nu = nu; 
	}	
}
