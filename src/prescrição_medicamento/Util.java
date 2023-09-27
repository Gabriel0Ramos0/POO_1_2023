package prescrição_medicamento;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Util {

	public static Medicamento selecionaMedi(ArrayList<Medicamento> lista) {
	    StringBuilder menuBuilder = new StringBuilder();
	    int cont = 1;
	    
	    for (Medicamento a : lista) {
	        menuBuilder.append(cont).append(" - ").append(a.getNome()).append("\n");
	        cont++;
	    }
	    
	    int escolha = Integer.parseInt(JOptionPane.showInputDialog(menuBuilder.toString()));
	    return lista.get(escolha - 1);
	}

		
		public static Pessoa selecionaPessoa (ArrayList<Pessoa> lista) {
			StringBuilder menuBuilder = new StringBuilder();
			int cont = 1;
			for (Pessoa a : lista) {
				menuBuilder.append(cont).append(" - ").append(a.getNome()).append("\n");
		        cont++;
		    }
		    
		    int escolha = Integer.parseInt(JOptionPane.showInputDialog(menuBuilder.toString()));
		    return lista.get(escolha - 1);
		}
		
}
