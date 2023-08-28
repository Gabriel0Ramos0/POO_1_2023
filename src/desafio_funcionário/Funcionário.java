package desafio_funcionário;

import javax.swing.JOptionPane;

public class Funcionário {
    private static int totalFuncionarios = 0;
    private static int idadeMinima = 18;
    private static Funcionário[] funcionarios = new Funcionário[100]; 

    private String nome;
    private int idade;

    public static void contratar(String nome, int idade) {
        for (int i = 0; i < totalFuncionarios; i++) {
            if (funcionarios[i].getNome().equals(nome) && funcionarios[i].getIdade() == idade) {
            	JOptionPane.showMessageDialog(null, "Funcionário com mesmo nome e idade já cadastrado.");
                return;
            }
        }

        if (idade >= idadeMinima) {
            funcionarios[totalFuncionarios] = new Funcionário(nome, idade);
            totalFuncionarios++;
            JOptionPane.showMessageDialog(null, "Funcionário contratado com sucesso: " + nome);
        } else {
        	JOptionPane.showMessageDialog(null, "Não foi possível contratar o funcionário " + nome + " devido à idade mínima.");
        }
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }
    public Funcionário(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public static int getTotalFuncionarios() {
        return totalFuncionarios;
    }

    public static int getIdadeMinima() {
        return idadeMinima;
    }
}
