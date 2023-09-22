package matrícula_escolar;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Disciplina {
	
	private String nome;
	private int cargaHoraria;
	private Professor professor;
	
	public void cadastrar(ArrayList<Professor> professores) {
		setNome(JOptionPane.showInputDialog("Informe o nome da Disciplina"));
		setCargaHoraria(Integer.parseInt(JOptionPane.showInputDialog("Carga horária")));
		String menuProf = "";
		int cont = 1;  
		for (Professor p : professores) {
			menuProf += cont + " - " + p.exibirDados()+"\n";
			cont ++;
		}
		int escolhaProf = Integer.parseInt(JOptionPane.showInputDialog(menuProf));
		setProfessor(professores.get(escolhaProf - 1));
	}
	
	public String exibirDados() {
		return getNome()+"("+getCargaHoraria()+ ") - " + getProfessor().exibirDados();
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		if(nome != null && !nome.isEmpty()) {
			this.nome = nome;
		}else {
			setNome(JOptionPane.showInputDialog("É nescessário informar o nome da disciplina!"));
		}
	}
	public int getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(int cargaHoraria) {
	    while (cargaHoraria <= 0) {
	        String input = JOptionPane.showInputDialog("Informe uma carga horária maior que 0!");
	        cargaHoraria = Integer.parseInt(input);
	    }
	    this.cargaHoraria = cargaHoraria;
	}

	public Professor getProfessor() {
		return professor;
	}
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	
}