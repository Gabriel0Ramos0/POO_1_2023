package sistema_bancário_herança;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Caixa {
	
	public static void main(String[] args) {
		ArrayList<Conta> listaDeContas = new ArrayList<>();
		
		Conta conta = new Conta(0, 0, null, 0);
		
		String menu = "1- Cadastrar Conta\n" 
				+ "2- Fazer uma Operação\n" 
				+ "3- Consutar conta\n"
				+ "4- Sair";
		
		int op = 0;
        do {
            op = Integer.parseInt(JOptionPane.showInputDialog(menu));
            
            if (op == 1) {
                Conta novaConta = selecionaTipoConta();
                if (novaConta != null) {
                    novaConta.CadastraConta();
                    listaDeContas.add(novaConta);
                    JOptionPane.showMessageDialog(null, "Conta criada com sucesso!");
                }
            }
            
            if (op == 2) {
            	
            	
            }
            
            if (op == 3) {
                int numContaConsultar = Integer.parseInt(JOptionPane.showInputDialog("Digite o número da conta que deseja consultar"));
                Conta contaSelecionada = null;
                for (Conta c : listaDeContas) {
                    if (c.getNumero() == numContaConsultar) {
                        contaSelecionada = c;
                        break;
                    }
                }
                if (contaSelecionada != null) {
                    JOptionPane.showMessageDialog(null, "Informações da conta selecionada:\n\n" + contaSelecionada);
                } else {
                    JOptionPane.showMessageDialog(null, "Conta não encontrada!");
                }
            }
            
            if (op == 4) {
                JOptionPane.showMessageDialog(null, "Saindo...");
            }
            
        } while (op != 4);
    }
    
    public static Conta selecionaTipoConta() {
        int num = Integer.parseInt(JOptionPane.showInputDialog(null, "Selecione um tipo de conta:\n" + "1- Corrente\n" + "2- Especial\n" + "3- Universitária"));
        Conta novaConta = null;

        if (num == 1) {
            novaConta = new Conta_Corrente(0, 0, null, 0);
        } else if (num == 2) {
            novaConta = new Conta_Especial(0, 0, null, 0);
        } else if (num == 3) {
            novaConta = new Conta_Universitaria(0, 0, null, 0);
        }
        return novaConta;
    }
}
