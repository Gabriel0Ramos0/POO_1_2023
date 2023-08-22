package b_classes_objetos;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Tela_Principal {
	public static void main(String[] args) {
		ArrayList<Carro> carros = new ArrayList<Carro>();
		double total =0, totala =0, totalm =0, totalc =0;
		
		String menu = "1- Cadastra\n"
					+ "2- Listar por Marca\n"
					+ "3- Listar por Ano de Fabricação\n"
					+ "4- Listar por Cor\n"
					+ "5- Sair";
			
			int op =0;
			
			do {
				op = Integer.parseInt(JOptionPane.showInputDialog(menu));
				
				if (op == 1) {
					Carro c = new Carro();
					c.cadastra();
					carros.add(c);
					total++;
				}
				
				if (op ==2) {
					String result = "Lista por Marca\n\n";
					String marca = JOptionPane.showInputDialog(null, "Informe a marca que deseja visualizar");
					
					for (Carro c: carros) {
						if (c.getmarca().equals(marca)) {
	                        result += c.exibirDados();
	                        totalm++;
	                    }
					}
					double porcentagem = (totalm / total) * 100;
			        JOptionPane.showMessageDialog(null, result + porcentagem + "%");
					}
					
				if (op == 3) {
				    String result = "Lista por ano\n\n";

				    int ano_i = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o ano inicial"));
				    int ano_f = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o ano final"));

				    for (Carro carro : carros) {
				        if (carro.getAnoFabricacao() >= ano_i && carro.getAnoFabricacao() <= ano_f) {
				            result += carro.exibirDados();
				            totala++;
				        }
				    }
				    double porcentagem = (totala / total) * 100;
				    JOptionPane.showMessageDialog(null, result + porcentagem + "%");
				}
				
				if (op == 4) {
	                String result = "Lista por cor\n\n";
	                String cor = JOptionPane.showInputDialog(null, "Informe a cor do carro").toUpperCase();

	                for (Carro c : carros) {
	                    if (c.getcor().equals(cor)) {
	                        result += c.exibirDados();
	                        totalc++;
	                    }
	                }
	                double porcentagem = (totalc / total) * 100;
	                JOptionPane.showMessageDialog(null, result + porcentagem + "%");
	            }
				
				} while(op != 5);
				
	}
}
