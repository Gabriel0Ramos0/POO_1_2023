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
		this.nome = nome;
	}

	public void setLivrosEscritos(ArrayList<Livro> livrosEscritos) {
		this.livrosEscritos = livrosEscritos;
	}
	
}
