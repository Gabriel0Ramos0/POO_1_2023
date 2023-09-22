package prescrição_medicamento;

import javax.swing.JOptionPane;

public class Pessoa {
	
	private String nome;
	private String sintoma;
	
	public Pessoa() {
		cadastraP();
	}
	
	public void cadastraP() {
		setNome(JOptionPane.showInputDialog(null, "Informe o nome da pessoa"));
		setSintoma(JOptionPane.showInputDialog(null, "Informe o Sintoma"));
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if(nome != null && !nome.isEmpty()) {
			this.nome = nome;
		} else {
			setNome(JOptionPane.showInputDialog("Informe o Nome da Pessoa!"));
		}
	}

	public String getSintoma() {
		return sintoma;
	}

	public void setSintoma(String sintoma) {
		if (sintoma != null && !sintoma.isEmpty()) {
			this.sintoma = sintoma;
		} else {
			setSintoma(JOptionPane.showInputDialog(null, "Informe o Sintoma!")); 
		}
		
	}
}
