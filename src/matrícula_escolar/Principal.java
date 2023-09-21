package matrícula_escolar;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Principal {
	public static void main(String[] args) {
		ArrayList <Disciplina> disciplinas = new ArrayList<Disciplina>();
		Disciplina disciplinaSelecionada = null;
		Aluno alunoSelecionado = null;
		
		String menu = "1 - Cadastrar Professor\n"
				+ "2 - Cadastrar Disciplina\n"
				+ "3 - Matricular Aluno\n"
				+ "4 - Listar as Disciplinas e Médias do Aluno\n"
				+ "5 - Listar Disciplinas lecionadas por Professores com Pós Graduação\n"
				+ "6 - Sair";
		int op = 0;
		do {
			op = Integer.parseInt(JOptionPane.showInputDialog(menu));
			
			if (op == 1) {
				Disciplina d = new Disciplina();
				d.cadastraP();
				disciplinas.add(d);
				JOptionPane.showMessageDialog(null, "Professor Cadastrado com Sucesso!");
			}
			
			if (op == 2) {
				Disciplina d = new Disciplina();
				d.cadastraD();
				disciplinas.add(d);
				JOptionPane.showMessageDialog(null, "Disciplina Cadastrada com Sucesso!");
				JOptionPane.showMessageDialog(null, d.exibirD());
			}
			
			if (op == 3) {
				Disciplina d = new Disciplina();
				d.cadastraA();
				disciplinas.add(d);
			}
			
			if (op == 4) {
			    if (disciplinaSelecionada != null && alunoSelecionado != null) {
			        String mensagem = disciplinaSelecionada.exibirA(alunoSelecionado);
			        JOptionPane.showMessageDialog(null, mensagem);
			    } else {
			        JOptionPane.showMessageDialog(null, "Nenhum aluno ou disciplina selecionado.");
			    }
			}

			
			if (op == 5) {
			    StringBuilder disciplinasComPosGraduacao = new StringBuilder("Disciplinas com professores com Pós Graduação:\n");
			    for (Disciplina disciplina : disciplinas) {
			        if (disciplina.getProfessor() != null && disciplina.getProfessor().getFormacao().equalsIgnoreCase("Pós Graduação")) {
			            disciplinasComPosGraduacao.append(disciplina.getNome()).append("\n");
			        }
			    }
			    JOptionPane.showMessageDialog(null, disciplinasComPosGraduacao.toString());
			}
			
		} while(op!=6);
	}
}
