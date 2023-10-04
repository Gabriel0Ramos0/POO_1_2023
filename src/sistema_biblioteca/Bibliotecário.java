package sistema_biblioteca;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Bibliotecário {
	
	private String nome;
	ArrayList <Livro> livros;
	
	public Bibliotecário(String nome) {
		this.nome = nome;
		this.livros = new ArrayList <Livro>();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if(nome != null && !nome.isEmpty()) {
			this.nome = nome;
		} else {
			setNome(JOptionPane.showInputDialog("É nescessário informar o nome do bibliotecário!"));
		}
	}

	public ArrayList<Livro> getLivros() {
		return livros;
	}

	public void setLivros(ArrayList<Livro> livros) {
		this.livros = livros;
	}
	
}
