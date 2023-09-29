package sistema_biblioteca;

import javax.swing.JOptionPane;

public class Bibliotecário {
	
	private String nome;
	private Livro livro;
	
	public Bibliotecário() {
		cadastraB();
	}
	
	public void cadastraB() {
		setNome (JOptionPane.showInputDialog(null, "Informe o nome do bibliotecário"));
		
	}
	
	public String exibirB() {
		return "Bibliotecário: " + getNome();
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

	public Livro getLivro() {
		return livro;
	}

	public void setLivro(Livro livro) {
		this.livro = livro;
	}
	
}
