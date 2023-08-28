package desafio_livros;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Principal {
	public static void main(String[] args) {
		ArrayList<Livro> livros = new ArrayList<Livro>();
		
		String menu = "1 - Cadastrar Livro\n"
				+ "2 - Cadastrar Autor\n"
				+ "3 - Buscar por Autor\n"
				+ "4 - Buscar filhos do Autor\n"
				+ "5 - Listar todos os livros\n"
				+ "6 - Listar por Valor do Livro\n"
				+ "7 - Listar por Sexo\n"
				+ "8 - Sair";
		int op = 0;
		do {
			op = Integer.parseInt(JOptionPane.showInputDialog(menu));
			
			if (op == 1) {
				Livro l = new Livro();
				l.cadastralivro();
				livros.add(l);
				
			} else if (op ==2) {
				Livro l = new Livro();
				l.cadastraautor();
				livros.add(l);
				
			}else if (op ==3) {
				String result = "Informações do Autor\n";
				String nome = JOptionPane.showInputDialog(null, "Informe o nome do autor");
				for (Livro livro : livros) {
			        for (Autor autor : livro.getAutores()) {
			            if (nome.equalsIgnoreCase(autor.getNome())) {
			                result += autor.exibira() + "\nLivros associados:\n";

			                for (Livro livroAutor : livros) {
			                    for (Autor autorLivro : livroAutor.getAutores()) {
			                        if (nome.equalsIgnoreCase(autorLivro.getNome())) {
			                            result += livroAutor.getTitulo() + "\n";
			                        }
			                    }
			                }
			            }
			        }
			    }
			    JOptionPane.showMessageDialog(null, result);
				
			}else if (op ==4) {
				String result = "Livros que Autores tem filhos menores de 12\n";
				for (Livro livro : livros) {
			        for (Autor autor : livro.getAutores()) {
			            if ("SIM".equalsIgnoreCase(autor.getFilho()) && autor.getIdadef() <= 12) {
			                result += livro.exibirl() + "\n";
			                break;
			            }
			        }
			    }
			    JOptionPane.showMessageDialog(null, result);
			    
			}else if (op ==5) {
				String result = "Todos os livros cadastrados:\n";
				for (Livro livro : livros) {
			        result += livro.exibirl() + "\nAutores:\n";
			        for (Autor autor : livro.getAutores()) {
			            result += autor.exibira() + "\n";
			        }
			        result += "\n";
			    }
			    JOptionPane.showMessageDialog(null, result);
				
			}else if (op ==6) {
				String result = "Informações da Consulta\n";
				double min = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o valor mínimo"));
				double max = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o valor máximo"));
				for (Livro livro : livros) {
			        if (livro.getPreço() >= min && livro.getPreço() <= max) {
			            result += livro.exibirl() + "\n";
			        }
			    }
			    JOptionPane.showMessageDialog(null, result);
				
			}else if (op ==7) {
				String result = "Consulta por Sexo\n";
				String sexo = JOptionPane.showInputDialog(null, "Informe o sexo que deseja visualizar");
				for (Livro livro : livros) {
			        for (Autor autor : livro.getAutores()) {
			            if (sexo.equalsIgnoreCase(autor.getSexo())) {
			                result += livro.exibirl() + "\n";
			                break;
			            }
			        }
			    }
			    JOptionPane.showMessageDialog(null, result);
				
			}
		
		}while(op!=8);
	}
}