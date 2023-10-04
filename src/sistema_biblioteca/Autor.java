package sistema_biblioteca;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Autor {
	
	private String nome;
	private ArrayList<Livro> livros;
	
	public Autor(String nome, ArrayList<Livro> livros) {
		this.nome = nome;
		this.livros = livros;
	}
	
	public void adicionaLivro(Livro livro) {
		livros.add(livro);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if(nome != null && !nome.isEmpty()) {
			this.nome = nome;
		} else {
			setNome(JOptionPane.showInputDialog("É nescessário informar o nome do autor!"));
		}
	}

	public ArrayList<Livro> getLivros() {
		return livros;
	}

	public void setLivros(ArrayList<Livro> livros) {
		this.livros = livros;
	}
	
}
