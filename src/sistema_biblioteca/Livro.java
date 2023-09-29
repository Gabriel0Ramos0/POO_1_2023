package sistema_biblioteca;

import javax.swing.JOptionPane;

public class Livro {
	
	private String titulo;
	private Autor autor;
	private Bibliotecário bibliotecario;
	
	public Livro() {
		cadastraL();
	}
	
	public void cadastraL() {
		setTitulo (JOptionPane.showInputDialog(null, "Informe o título do livro"));
		bibliotecario.getNome();
	}
	
	public String exibirL() {
		return "Título do Livro: " + getTitulo();
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		if(titulo != null && !titulo.isEmpty()) {
			this.titulo = titulo;
		} else {
			setTitulo(JOptionPane.showInputDialog("É nescessário informar o título do livro!"));
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
