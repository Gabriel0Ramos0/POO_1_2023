package matrícula_escolar;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Principal {
	
	private static ArrayList<Professor> professores = new ArrayList<Professor>();
	private static ArrayList<Disciplina> disciplinas = new ArrayList<Disciplina>();
	private static ArrayList<Aluno> alunos = new ArrayList<Aluno>();
	
	public static void main(String[] args) {
		
		String menu = "1 - Cadastrar Professor\n"
				+ "2 - Cadastrar Disciplina\n"
				+ "3 - Cadastrar Aluno\n"
				+ "4 - Matricular Aluno\n"
				+ "5 - Adicionar nota ao aluno\n"
				+ "6 - Listar as Disciplinas e Médias do Aluno\n"
				+ "7 - Listar Disciplinas lecionadas por Professores com Pós Graduação\n"
				+ "8 - Sair";
		int op = 0;
		do {
			op = Integer.parseInt(JOptionPane.showInputDialog(menu));
			
			if (op == 1) {
				professores.add(new Professor());
				JOptionPane.showMessageDialog(null, "Professor Cadastrado com Sucesso!");
			}
			
			if (op == 2) {
				Disciplina d = new Disciplina();
				d.cadastrar(professores);
				disciplinas.add(d);
				JOptionPane.showMessageDialog(null, "Disciplina Cadastrada com Sucesso!");
			}
			
			if (op == 3) {
				Aluno a = new Aluno();
				a.cadastraA();
				alunos.add(a);
				JOptionPane.showMessageDialog(null, "Aluno Cadastrado com Sucesso!");
			}
			
			if (op == 4) {
				matricula();
				JOptionPane.showMessageDialog(null, "Aluno Matriculado com Sucesso!");
			}
		
			if (op == 5) {
				informarNota();
				JOptionPane.showMessageDialog(null, "Notas Adicionadas ao Aluno!");
			}
			
			if (op == 6) {
			    StringBuilder result = new StringBuilder("Média do Aluno nas Disciplinas:\n");
			    for (Aluno aluno : alunos) {
			        result.append("Aluno: ").append(aluno.getNome()).append("\n");
			        for (Disciplina disciplina : aluno.getDiscMatriculadas()) {
			            result.append("Disciplina: ").append(disciplina.getNome()).append("\n");
			            double media = aluno.mediaN();
			            result.append("Média: ").append(media).append("\n");
			        }
			        result.append("\n");
			    }
			    JOptionPane.showMessageDialog(null, result.toString());
			}

			if (op == 7) {
			    StringBuilder disciplinasComPosGraduacao = new StringBuilder("Disciplinas com professores com Pós Graduação:\n");
			    for (Disciplina disciplina : disciplinas) {
			        if (disciplina.getProfessor() != null && disciplina.getProfessor().getFormacao().equalsIgnoreCase("Pós Graduação")) {
			            disciplinasComPosGraduacao.append(disciplina.getNome()).append("\n");
			        }
			    }
			    JOptionPane.showMessageDialog(null, disciplinasComPosGraduacao.toString());
			}
			
		} while(op!=8);
	}
	public static void matricula() {
		Aluno a = Util.selecionaAluno(alunos);
		Disciplina d =  Util.selecionaDisciplina(disciplinas);
		a.getDiscMatriculadas().add(d);
	}
	
	public static void informarNota() {
		Aluno a = Util.selecionaAluno(alunos);
		Disciplina d =  Util.selecionaDisciplina(a.getDiscMatriculadas());
		Notas n = new Notas();
		n.setDisc(d);
		n.setN1(Double.parseDouble(JOptionPane.showInputDialog("Nota 1")));
		n.setN2(Double.parseDouble(JOptionPane.showInputDialog("Nota 2")));
		n.setN3(Double.parseDouble(JOptionPane.showInputDialog("Nota 3")));
		a.getNotas().add(n);
		
	}
}
