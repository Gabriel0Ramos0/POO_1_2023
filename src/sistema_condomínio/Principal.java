package sistema_condomínio;

import javax.swing.JOptionPane;

public class Principal {
	
	
	public static void main(String[] args) {
		
		String menu = "1 - Cadastrar Condomínio\n"
				+ "2 - Cadastrar Apartamento\n"
				+ "3 - Cadastrar Despesas\n"
				+ "4 - Listar data e valor de cada apartamento\n"
				+ "5 - Sair!";
		int op = 0;
		do {
			op = Integer.parseInt(JOptionPane.showInputDialog(menu));
			
			if (op == 1) {
				
			}
			
			
		} while (op == 5);
	}
}
