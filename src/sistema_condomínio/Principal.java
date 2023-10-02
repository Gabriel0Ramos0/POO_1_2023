package sistema_condomínio;

import javax.swing.JOptionPane;

public class Principal {
	
	public static void main(String[] args) {
		Condominio condominio = new Condominio();
		
		String menu = "1 - Cadastrar Apartamento\n"
				+ "2 - Cadastrar Despesas\n"
				+ "3- Valor devido por proprietário/alugante\n"
				+ "4- Valor devido do apartamento\n"
				+ "5 - Sair!";
		int op = 0;
		do {
			op = Integer.parseInt(JOptionPane.showInputDialog(menu));
			
			if (op == 1) {
				condominio.cadastrarAP();
				JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!");
			}
			
			if (op == 2) {
				condominio.cadastrarD();
				JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!");
			}
			
			if (op == 3) {
				condominio.valorDevidoPorProprietario();
			}
			
			if (op == 4) {
				condominio.extratoDespesaTotalPorApartamento();
			}
			
		} while(op!=5);
	}
}
