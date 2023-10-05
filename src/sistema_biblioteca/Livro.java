package sistema_biblioteca;

import javax.swing.JOptionPane;

public class Livro {
	
	private String titulo;
    Autor autor;
    private Bibliotecário bibliotecario;

    public Livro(String titulo, Autor autor, Bibliotecário bibliotecario) {
        this.titulo = titulo;
        this.autor = autor;
        this.bibliotecario = bibliotecario;
    }

    public void emprestar(String pessoa) {
        JOptionPane.showMessageDialog(null, "O livro '" + titulo + "' foi emprestado para " + pessoa);
    }

    public String getTitulo() {
        return titulo;
    }

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	public Bibliotecário getBibliotecario() {
		return bibliotecario;
	}

	public void setBibliotecario(Bibliotecário bibliotecario) {
		this.bibliotecario = bibliotecario;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
    
}
