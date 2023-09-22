package matrícula_escolar;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Aluno {
	
	private String nome;
	private ArrayList<Disciplina> discMatriculadas = new ArrayList<Disciplina>();
	private ArrayList<Notas> notas = new ArrayList<Notas>();
	
	public void cadastraA() {
		setNome(JOptionPane.showInputDialog("Nome do aluno"));
	}
	
	public double mediaN() {
		double media =0;
		for (Notas n : notas) {
			media = ((n.getN1() + n.getN2() + n.getN3())/3);
		} return media;
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
	public ArrayList<Disciplina> getDiscMatriculadas() {
		return discMatriculadas;
	}
	public void setDiscMatriculadas(ArrayList<Disciplina> discMatriculadas) {
		this.discMatriculadas = discMatriculadas;
	}
	public ArrayList<Notas> getNotas() {
		return notas;
	}
	public void setNotas(ArrayList<Notas> notas) {
		this.notas = notas;
	}
}
