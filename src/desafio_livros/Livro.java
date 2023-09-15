package desafio_livros;

import javax.swing.JOptionPane;

import java.util.ArrayList;

public class Livro {
	
	private String titulo;
	private double preço;
	private ArrayList<Autor> autores = new ArrayList<Autor>();
	
	public void cadastralivro() {
		setTitulo (JOptionPane.showInputDialog(null, "Informe o título do livro").toLowerCase());
		setPreço (Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o preço")));
		int qt = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a quantidade de autores"));
		if (qt <= 4) {
			for (int i=1; i <= qt; i++)	 {
				Autor a = new Autor();
				a.cadastraautor();
				autores.add(a);
			}
		} else {
			JOptionPane.showMessageDialog(null, "Não pode ter mais que 4 autores ou menos que 1");
		}
	}
	
	public String exibirl() {
		return getTitulo() + "\n" + "R$ " + getPreço();
	}
	
	public String exibira() {
		return exibira() + "\n" + getTitulo();
	}
	
	public String exibiri() {
		return exibira() + "\n";
	}
	
	public String getNome() {
		return getNome();
	}
	
	public String getSexo() {
		return getSexo();
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public double getPreço() {
		return preço;
	}

	public void setPreço(double preço) {
		if (preço <= 0) {
            this.preço = preço;
        } else {
            setPreço(Double.parseDouble(JOptionPane.showInputDialog(null, "O preço deve ser maior que zero.")));
        }
	}

	public ArrayList<Autor> getAutores() {
		return autores;
	}

	public void setAutores(ArrayList<Autor> autores) {
		this.autores = autores;
	}

	public void cadastraautor() {
		Autor a = new Autor();
		a.cadastraautor();
		autores.add(a);
	}
	
	
}
