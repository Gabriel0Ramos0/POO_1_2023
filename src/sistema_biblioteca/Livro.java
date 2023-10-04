package sistema_biblioteca;

import javax.swing.JOptionPane;

public class Livro {
	
	private String titulo;
	private Autor autor;
	private Bibliotecário bibliotecario;
	
	public Livro(String titulo, Autor autor, Bibliotecário bibliotecario) {
		this.titulo = titulo;
		this.autor = autor;
		this.bibliotecario = bibliotecario;		
	}
	
	public static String emprestaL(String nome) {
		return "Livro emprestado para: " + nome;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		if(titulo != null && !titulo.isEmpty()) {
			this.titulo = titulo;
		} else {
			setTitulo(JOptionPane.showInputDialog("É nescessário informar um  título!"));
		}
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
	
}
