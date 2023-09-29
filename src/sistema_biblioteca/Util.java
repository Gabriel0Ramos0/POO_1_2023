package sistema_biblioteca;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Util {

	public static Autor selecionaAutor(ArrayList<Autor> lista) {
	    StringBuilder menuBuilder = new StringBuilder();
	    int cont = 1;
	    
	    for (Autor a : lista) {
	        menuBuilder.append(cont).append(" - ").append(a.getNome()).append("\n");
	        cont++;
	    }
	    int escolha = Integer.parseInt(JOptionPane.showInputDialog(menuBuilder.toString()));
	    return lista.get(escolha - 1);
	}
	
	public static Livro selecionaLivro(ArrayList<Livro> lista) {
	    StringBuilder menuBuilder = new StringBuilder();
	    int cont = 1;
	    
	    for (Livro a : lista) {
	        menuBuilder.append(cont).append(" - ").append(a.getTitulo()).append("\n");
	        cont++;
	    }
	    int escolha = Integer.parseInt(JOptionPane.showInputDialog(menuBuilder.toString()));
	    return lista.get(escolha - 1);
	}
}
