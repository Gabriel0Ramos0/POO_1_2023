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
		this.nome = nome;
	}

	public String getSintoma() {
		return sintoma;
	}

	public void setSintoma(String sintoma) {
		this.sintoma = sintoma;
	}
}
