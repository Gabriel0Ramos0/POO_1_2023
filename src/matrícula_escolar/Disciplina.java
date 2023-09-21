package matrícula_escolar;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Disciplina {
	
	private String nome;
	private double horas;
	private Professor professor;
	static ArrayList<Disciplina> disciplinas = new ArrayList<Disciplina>();
	static ArrayList <Professor> professores = new ArrayList<Professor>();
	static ArrayList <Aluno> alunos = new ArrayList <Aluno>();
	
	public void cadastraD() {
		String nome = JOptionPane.showInputDialog(null, "Informe o nome da disciplina");
		int cargaHoraria = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a carga horária"));
		String escolha = JOptionPane.showInputDialog(null, "Informe o professor da disciplina");
		
		setNome(nome);
		setHoras(cargaHoraria);
	
		for(Professor p : professores) {
			if(p.getNome().equalsIgnoreCase(escolha)) {
				setProfessor(p);
				break;
			}
		}	
		
		if(getProfessor() == null) {
			JOptionPane.showMessageDialog(null, "Professor não cadastrado! Fazer o cadastro dele:");
			Professor p = new Professor();
			p.cadastraP();
			professores.add(p);
		}
		
		Disciplina.disciplinas.add(this);
	}
	
	public String exibirD() {
		return "Disciplina: " + getNome() + "\nCarga Horária: " + getHoras() + "\nProfessor: " + getProfessor().getNome() + "\nFormação: " + getProfessor().getFormacao();
	}
	
	public String exibirPós() {
	    StringBuilder info = new StringBuilder("Disciplinas com Professores de Pós Graduação:\n");

	    for (Disciplina disciplina : disciplinas) {
	        Professor professor = disciplina.getProfessor();
	        if (professor.getFormacao().equalsIgnoreCase("Pós Graduação") && disciplina.getNome() != null) {
	            info.append("Disciplina: ").append(disciplina.getNome()).append("\n");
	        }
	    }

	    return info.toString();
	}
	
	public String exibirA(Aluno aluno) {
	    for (Aluno a : alunos) {
	        if (a.getNome().equalsIgnoreCase(aluno.getNome())) {
	            ArrayList<Double> notasAluno = a.getNotas();
	            double soma = 0;
	            for (Double nota : notasAluno) {
	                soma += nota;
	            }
	            double media = soma / 3;
	            return "Aluno: " + aluno.getNome() + "\nDisciplina: " + getNome() + "\nMédia: " + media;
	        }
	    }
	    return "Aluno não encontrado nesta disciplina.";
	}


	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getHoras() {
		return horas;
	}
	public void setHoras(double horas) {
		this.horas = horas;
	}
	
	public ArrayList<Professor> getProfessores() {
		return professores;
	}
	
	public void setProfessores(ArrayList<Professor> professores) {
		this.professores = professores;
	}
	
	public Professor getProfessor() {
		return professor;
	}
	
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	
	public boolean temProfessorPosGraduacao() {
	    for (Professor professor : professores) {
	        if (professor.getFormacao().equalsIgnoreCase("Pós Graduação")) {
	            return true;
	        }
	    }
	    return false;
	}
	
	public void adicionarNota(Aluno aluno, double nota) {
        // Encontrar o aluno na lista de alunos
        for (Aluno a : alunos) {
            if (a.getNome().equalsIgnoreCase(aluno.getNome())) {
                a.getNotas().add(nota);
                break;
            }
        }
    }
	
	public void cadastraA() {
		Aluno a = new Aluno();
		a.cadastraA();
		alunos.add(a);
	}
	
	public void cadastraP() {
		Professor p = new Professor();
		p.cadastraP();
		professores.add(p);
	}
	
}