package desafio_funcionário;

import javax.swing.*;

public class Principal {
    public static void main(String[] args) {
        String menu = "1 - Contratar Funcionário\n"
                	+ "2 - Informações gerais\n"
                	+ "3 - Sair";
        int op = 0;
        do {
            op = Integer.parseInt(JOptionPane.showInputDialog(menu));

            if (op == 1) {
                String nome = JOptionPane.showInputDialog(null, "Informe o nome do funcionário");
                int idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a idade do funcionário"));
                Funcionário.contratar(nome, idade);

            } else if (op == 2) {
                int totalFuncionarios = Funcionário.getTotalFuncionarios();
                int idadeMinima = Funcionário.getIdadeMinima();
                JOptionPane.showMessageDialog(null, "Total de Funcionários: " + totalFuncionarios + "\nIdade Mínima: " + idadeMinima);

            }
        } while (op != 3);
    }
}
