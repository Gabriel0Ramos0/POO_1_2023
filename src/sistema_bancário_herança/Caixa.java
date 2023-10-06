package sistema_bancário_herança;

import javax.swing.JOptionPane;

public class Caixa {
	
	public static void main(String[] args) {
		
		Conta conta = new Conta(0, 0, null, 0);
		
		String menu = "1- Cadastrar Conta\n" 
				+ "2- Fazer uma Operação\n" 
				+ "3- Consutar conta\n"
				+ "4- Sair";
		
		int op = 0;
		do {
			op = Integer.parseInt(JOptionPane.showInputDialog(menu));
			
			if (op == 1) {
				conta.selecionaConta();				
				conta.CadastraConta();
				JOptionPane.showMessageDialog(null, "Conta criada com sucesso!");
			}
			
			if (op == 2) {
				
				
			}
			
			if (op == 3) {
				
				
			}
			
			if (op == 4) {
				JOptionPane.showMessageDialog(null, "Saindo...");
			}
			
		}while (op!=4);
	}
	
}
