package matrícula_escolar;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Aluno {
	
	private String nome;
	private String disc;
	private int n;
	ArrayList <Disciplina> disciplinas = new ArrayList<Disciplina>();
	private ArrayList<Double> notas = new ArrayList<>();
	
	public void cadastraA() {
        setNome(JOptionPane.showInputDialog(null, "Informe o nome do aluno"));

        Disciplina disciplinaEscolhida = escolherDisciplina();

        if (disciplinaEscolhida != null) {
            for (int i = 0; i < 3; i++) {
                double nota = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a nota " + (i + 1)));
                notas.add(nota);
                disciplinaEscolhida.adicionarNota(this, nota);
            }

            JOptionPane.showMessageDialog(null, "Aluno matriculado na disciplina: " + disciplinaEscolhida.getNome());
        }
        
    }

    public ArrayList<Double> getNotas() {
        return notas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    private Disciplina escolherDisciplina() {
        String nomeDisciplina = JOptionPane.showInputDialog(null, "Informe o nome da disciplina");

        for (Disciplina disciplina : Disciplina.disciplinas) {
            if (disciplina.getNome().equalsIgnoreCase(nomeDisciplina)) {
                return disciplina;
            }
        }
        
        Disciplina novaDisciplina = new Disciplina();
        novaDisciplina.setNome(nomeDisciplina);
        Disciplina.disciplinas.add(novaDisciplina);
        return novaDisciplina;
    }

	public String getDisc() {
		return disc;
	}

	public void setDisc(String disc) {
		this.disc = disc;
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}
}
