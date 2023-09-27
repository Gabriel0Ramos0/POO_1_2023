package prescrição_medicamento;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Principal {
	static private ArrayList <Pessoa> pessoas = new ArrayList<Pessoa>();
	static private ArrayList <Medicamento> medicamentos = new ArrayList<Medicamento>();
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
				prescreverMedicamento();
			}
			
			if (op == 4) {
			    StringBuilder detalhes = new StringBuilder();
			    for (Pessoa pessoa : pessoas) {
			        detalhes.append("Detalhes da Pessoa:\n");
			        detalhes.append("Nome: ").append(pessoa.getNome()).append("\n");
			        detalhes.append("Sintoma: ").append(pessoa.getSintoma()).append("\n");

			        Medicamento medicamentoPrescrito = pessoa.getMedicamento();
			        if (medicamentoPrescrito != null) {
			            detalhes.append("\nMedicamento Prescrito:\n");
			            detalhes.append(medicamentoPrescrito.exibirNome()).append("\n");
			        } else {
			            detalhes.append("Nenhum medicamento prescrito para esta pessoa.\n");
			        }
			        detalhes.append("\n");
			    }
			    JOptionPane.showMessageDialog(null, detalhes.toString());
			}			
		}while(op!=5);
	}
	
	public static void prescreverMedicamento() {
	    Pessoa pessoa = Util.selecionaPessoa(pessoas);
	    Medicamento medicamento = Util.selecionaMedi(medicamentos);
	    boolean sintomaCorrespondente = false;
	    boolean contraIndicacaoEncontrada = false;

	    for (Indicação indicacao : medicamento.getIndicações()) {
	        if (indicacao.getIndica().equalsIgnoreCase(pessoa.getSintoma())) {
	            sintomaCorrespondente = true;
	            break;
	        }
	    }

	    for (Condição condição : pessoa.getCondições()) {
	        if (medicamento.getContraindicações().contains(condição.getCondi())) {
	            contraIndicacaoEncontrada = true;
	            break;
	        }
	    }

	    if (sintomaCorrespondente && !contraIndicacaoEncontrada) {
	        pessoa.setMedicamento(medicamento);
	        JOptionPane.showMessageDialog(null, "Medicamento prescrito com sucesso!");
	    } else if (contraIndicacaoEncontrada) {
	        JOptionPane.showMessageDialog(null, "O medicamento escolhido não é indicado devido à condição da pessoa.");
	    } else {
	        JOptionPane.showMessageDialog(null, "Não é possível prescrever o medicamento para esta pessoa.");
	    }
	}
}
