package sistema_biblioteca;

import javax.swing.JOptionPane;

public class Autor {
	
	private String nome;
	private Livro livro;
	
	public Autor() {
		cadastraA();
	}
	
	public void cadastraA() {
		setNome(JOptionPane.showInputDialog(null, "Informe o nome do autor"));
		
	}
	
	public String exibirA() {
		return "Nome do Autor: " + getNome();
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

	public Livro getLivros() {
		return livro;
	}

	public void setLivros(Livro livros) {
		this.livro = livro;
	}
	
}
