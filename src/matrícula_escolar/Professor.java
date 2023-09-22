package matrícula_escolar;

import javax.swing.JOptionPane;

public class Professor {
	
	private String nome;
	private String formacao;
	private int nu;
	
	public Professor() {
		cadastraP();
	}
	
	public void cadastraP() {
		setNome(JOptionPane.showInputDialog(null, "Informe o nome do professor"));
		JOptionPane.showMessageDialog(null, "Formações: " + "\n\n1- Graduação" + "\n2- Especialização" + "\n3- Pós Graduação");
		setNu (Integer.parseInt(JOptionPane.showInputDialog(null, "Informe sua formação: 1/ 2/ 3")));
		
		if (nu == 1){
			setFormacao ("Graduação");
		} else if (nu == 2){
			setFormacao ("Especialização");
		} else if (nu == 3){
			setFormacao ("Pós Graduação");
		}
	}
	
	public String exibirDados() {
		return getNome()+"("+getFormacao()+")";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if(nome != null && !nome.isEmpty()) {
			this.nome = nome;
		}else {
			setNome(JOptionPane.showInputDialog("É nescessário informar o nome!"));
		}
	}

	public String getFormacao() {
		return formacao;
	}

	public void setFormacao(String formacao) {
		this.formacao = formacao;
	}

	public int getN() {
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
