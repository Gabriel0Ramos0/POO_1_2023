package sistema_biblioteca;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Principal {
	
	static private ArrayList <Autor> autores = new ArrayList <Autor>();
	static private ArrayList <Livro> livros = new ArrayList <Livro>();
	
	public static void main(String[] args) {
		
		String menu = "";
		
		int op = 0;
		do {
			op = Integer.parseInt(JOptionPane.showInputDialog(menu));
			
			if (op == 1) {
				
			}
			if (op == 2) {
				
			}
			if (op == 3) {
				
			}
			if (op == 4) {
				
			}			
			
		}while (op == 5);
	}
}
