package sistema_biblioteca;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Bibliotecário {
	
	private String nome;
    private ArrayList<Livro> livrosResponsabilidade;

    public Bibliotecário(String nome) {
        this.nome = nome;
        this.livrosResponsabilidade = new ArrayList<>();
    }

    public void cadastrarLivro(String titulo, Autor autor) {
        Livro livro = new Livro(titulo, autor, this);
        livrosResponsabilidade.add(livro);
        autor.adicionarLivro(livro);
    }

    public void listarLivrosSobResponsabilidade() {
        System.out.println("Livros sob a responsabilidade do bibliotecário " + nome + ":");
        for (Livro livro : livrosResponsabilidade) {
            System.out.println("- " + livro.getTitulo() + " (Autor: " + livro.autor.getNome() + ")");
        }
    }

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public ArrayList<Livro> getLivrosResponsabilidade() {
		return livrosResponsabilidade;
	}

	public void setLivrosResponsabilidade(ArrayList<Livro> livrosResponsabilidade) {
		this.livrosResponsabilidade = livrosResponsabilidade;
	}
	
}
