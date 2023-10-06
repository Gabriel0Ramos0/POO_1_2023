package sistema_biblioteca;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Autor {
	
	private String nome;
    private ArrayList<Livro> livrosEscritos;

    public Autor(String nome) {
        this.nome = nome;
        this.livrosEscritos = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro) {
        livrosEscritos.add(livro);
    }

    public ArrayList<Livro> getLivrosEscritos() {
        return livrosEscritos;
    }

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if(nome != null && !nome.isEmpty()) {
			this.nome = nome;
		} else {
			setNome(JOptionPane.showInputDialog("Informe o Nome do Autor(a)!"));
		}
	}

	public void setLivrosEscritos(ArrayList<Livro> livrosEscritos) {
		this.livrosEscritos = livrosEscritos;
	}
	
}
