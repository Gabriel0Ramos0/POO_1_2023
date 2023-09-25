package prescrição_medicamento;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Principal {
	static private ArrayList <Pessoa> pessoas = new ArrayList<Pessoa>();
	static private ArrayList <Medicamento> medicamentos = new ArrayList<Medicamento>();
	static private ArrayList <Indicação> indicações = new ArrayList<Indicação>();
	static private ArrayList <ContraIndicação> contraindi = new ArrayList<ContraIndicação>();
	public static void main(String[] args) {
		
		String menu = "1 - Cadastrar Medicamento\n"
				+ "2 - Cadastrar Pessoa\n"
				+ "3 - Fazer Prescrição para uma Pessoa\n"
				+ "4 - Listar Todas as Pessoas e seus Medicamentos\n"
				+ "5 - Sair";
		int op = 0;
		do {
			op = Integer.parseInt(JOptionPane.showInputDialog(menu));
			
			if (op == 1) {
				medicamentos.add(new Medicamento());
				JOptionPane.showMessageDialog(null, "Medicamento Cadastrado com Sucesso!");
			}
			
			if (op == 2) {
				pessoas.add(new Pessoa());
				JOptionPane.showMessageDialog(null, "Pessoa Cadastrada com Sucesso!");
			}
			
			if (op == 3) {
				
			}
			
			if (op == 4) {
				StringBuilder detalhes = new StringBuilder();
                for (Medicamento medicamento : medicamentos) {
                    detalhes.append("Detalhes do Medicamento:\n").append(medicamento.exibirDetalhes()).append("\n\n");
                }
                JOptionPane.showMessageDialog(null, detalhes.toString());
			}
			
		}while(op!=5);
	}
}
