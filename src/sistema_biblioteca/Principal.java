package sistema_biblioteca;

import javax.swing.JOptionPane;

public class Principal {
	
	public static void main(String[] args) {
		
		String menu = "1- Cadastrar Autor\n"
				+ "2- Cdastrar Livro\n"
				+ "3- Cadastrar Bibliotecário\n"
				+ "4- Listar Livros\n"
                + "5- Emprestar Livro\n"
                + "6- Sair";
		
		int op = 0;
		do {
			op = Integer.parseInt(JOptionPane.showInputDialog(menu));
			
			if (op == 1) {
				/*Cadastra Autor*/
			}
			
			if (op == 2) {
				/*Cdastrar Livro*/
			}
			
			if (op == 3) {
				/*Cadastrar Bibliotecário*/
			}
			
			if (op == 4) {
				/*Listar Livros*/
			}	
			
			if (op == 5) {
				/*Emprestar Livro*/
			}	
			
		}while (op != 6);
	}
}
