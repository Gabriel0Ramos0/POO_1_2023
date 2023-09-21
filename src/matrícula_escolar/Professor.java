package matrícula_escolar;

import javax.swing.JOptionPane;

public class Professor {
	
	private String nome;
	private String formacao;
	private String materia;
	private int nu;
	
	public void cadastraP() {
		setNome(JOptionPane.showInputDialog(null, "Informe o nome do professor"));
		JOptionPane.showMessageDialog(null, "Formações: " + "\n\n1- Graduação" + "\n2- Especialização" + "\n3- Pós Graduação");
		setNu (Integer.parseInt(JOptionPane.showInputDialog(null, "Informe sua formação: 1/ 2/ 3")));
		
		if (nu == 1){
			setFormacao ("Graduação");
			setMateria (JOptionPane.showInputDialog(null, "Informe a matéria da " + getFormacao()));
		} else if (nu == 2){
			setFormacao ("Especialização");
			setMateria (JOptionPane.showInputDialog(null, "Informe a matéria da " + getFormacao()));
		} else if (nu == 3){
			setFormacao ("Pós Graduação");
			setMateria (JOptionPane.showInputDialog(null, "Informe a matéria da " + getFormacao()));
		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if(nome!="") {
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

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		if (materia!="") {
		this.materia = materia;
		} else {
			setMateria(JOptionPane.showInputDialog(null, "Informe a matéria correspondente a formação!"));
		}
	}

	public int getN() {
		return nu;
	}

	public void setNu(int nu) {
		if(nu >= 1 && nu <=3) {
			this.nu = nu;
		}else {
			setNu (Integer.parseInt(JOptionPane.showInputDialog("Informe um número correspondente! (1/2/3)")));
		}
	}
		
}
