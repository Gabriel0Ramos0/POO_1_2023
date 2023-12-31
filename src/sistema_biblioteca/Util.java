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

        for (Livro livro : lista) {
            menuBuilder.append(cont).append(" - ").append(livro.getTitulo()).append("\n");
            cont++;
        }

        int escolha = Integer.parseInt(JOptionPane.showInputDialog(menuBuilder.toString()));
        return lista.get(escolha - 1);
    }

    public static Bibliotecário selecionaBibliotecario(ArrayList<Bibliotecário> lista) {
        StringBuilder menuBuilder = new StringBuilder();
        int cont = 1;

        for (Bibliotecário bibliotecario : lista) {
            menuBuilder.append(cont).append(" - ").append(bibliotecario.getNome()).append("\n");
            cont++;
        }

        int escolha = Integer.parseInt(JOptionPane.showInputDialog(menuBuilder.toString()));
        return lista.get(escolha - 1);
    }
}
