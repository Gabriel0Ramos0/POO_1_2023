package sistema_biblioteca;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Principal {
	
	static private ArrayList<Livro> livros = new ArrayList<Livro>();
    static private ArrayList<Autor> autores = new ArrayList<Autor>();
    static private ArrayList<Bibliotecário> bibliotecarios = new ArrayList<Bibliotecário>();

    public static void main(String[] args) {

        String menu = "1- Cadastrar Autor\n"
                + "2- Cadastrar Livro\n"
                + "3- Cadastrar Bibliotecário\n"
                + "4- Listar Livros\n"
                + "5- Emprestar Livro\n"
                + "6- Sair";

        int op = 0;
        do {
            op = Integer.parseInt(JOptionPane.showInputDialog(menu));

            if (op == 1) {
                cadastrarAutor();
                JOptionPane.showMessageDialog(null, "Autor cadastrado com sucesso!");
            }

            if (op == 2) {
                cadastrarLivro();
            }

            if (op == 3) {
                cadastrarBibliotecario();
            }

            if (op == 4) {
                listarLivros();
            }

            if (op == 5) {
                emprestarLivro();
            }

            if (op == 6) {
                JOptionPane.showMessageDialog(null, "Saindo...");
            }

        } while (op != 6);
    }

    static void cadastrarAutor() {
        String nomeAutor = JOptionPane.showInputDialog("Digite o nome do autor:");
        Autor autor = new Autor(nomeAutor);
        autores.add(autor);        
    }

    static void cadastrarLivro() {
    	if (bibliotecarios.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Nenhum bibliotecário cadastrado. Por favor, cadastre um bibliotecário primeiro.");
            cadastrarBibliotecario();
        }
        String tituloLivro = JOptionPane.showInputDialog("Digite o título do livro:");
        Autor autor = Util.selecionaAutor(autores);
        Bibliotecário bibliotecario = Util.selecionaBibliotecario(bibliotecarios);        
        Livro livro = new Livro(tituloLivro, autor, bibliotecario);
        livros.add(livro);
        JOptionPane.showMessageDialog(null, "Livro cadastrado com sucesso!");
    }

    static void cadastrarBibliotecario() {
        if (!bibliotecarios.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Já existe um bibliotecário cadastrado. Apenas um bibliotecário é permitido!");
            return;
        }
        String nomeBibliotecario = JOptionPane.showInputDialog("Digite o nome do bibliotecário:");
        Bibliotecário bibliotecario = new Bibliotecário(nomeBibliotecario);
        bibliotecarios.add(bibliotecario);
        JOptionPane.showMessageDialog(null, "Bibliotecário cadastrado com sucesso!");
    }

    static void listarLivros() {
    	String nomeBibliotecario = bibliotecarios.get(0).getNome();
        StringBuilder lista = new StringBuilder("Lista de Livros pelos cuidados de: " + nomeBibliotecario + "\n");
        for (Livro livro : livros) {
            lista.append("- ").append(livro.getTitulo()).append(" Autor - ").append(livro.getAutor().getNome()).append("\n");
        }
        JOptionPane.showMessageDialog(null, lista.toString());
    }

    static void emprestarLivro() {
        Livro livroParaEmprestar = Util.selecionaLivro(livros);

        if (livroParaEmprestar != null) {
            String nomePessoa = JOptionPane.showInputDialog("Digite o nome da pessoa para quem o livro será emprestado:");
            livroParaEmprestar.emprestar(nomePessoa);
        } else {
            JOptionPane.showMessageDialog(null, "Livro não encontrado.");
        }
    }
}
