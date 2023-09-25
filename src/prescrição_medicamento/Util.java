package prescrição_medicamento;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Util {

		static private Medicamento selecionaMedi(ArrayList<Medicamento> lista) {
			String MenuIn = "";
			int cont = 1;
			for (Medicamento a : lista) {
				MenuIn = cont + " - " + a.getNome()+"\n";
				cont ++;
			}
			int escolha = Integer.parseInt(JOptionPane.showInputDialog(MenuIn));
			return lista.get(escolha-1);
		}
		
		static private Pessoa selecionaPessoa (ArrayList<Pessoa> lista) {
			String MenuIn = "";
			int cont = 1;
			for (Pessoa a : lista) {
				MenuIn = cont + " - " + a.getNome()+"\n";
				cont ++;
			}
			int escolha = Integer.parseInt(JOptionPane.showInputDialog(MenuIn));
			return lista.get(escolha-1);
		}
}
