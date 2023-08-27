package desafio_jogador;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import a_classes_objetos.Pessoa;
import desafio_1.Carro;

public class Tela_Principal {	
	public static void main(String[] args) {
		ArrayList<Time> times = new ArrayList<Time>();
		
		String menu = "1 - Cadastrar\n"
				+ "2 - Listar todos os jogadores de um time\n"
				+ "3 - Artilheiro do Campeonato\n"
				+ "4 - Time com mais gols\n"
				+ "5 - Sair";
		int op = 0;
		do {
			op = Integer.parseInt(JOptionPane.showInputDialog(menu));
			
			if (op == 1) {
				Time t = new Time();
				t.cadastrar();
				times.add(t);
				
			} else if (op == 2) {
				String result = "Jogadores do Time\n";
				String equipe = JOptionPane.showInputDialog(null, "Nome do time");
				for (Time t: times) {
					if (t.getNome().equals(equipe))
					result += t.exibir();
				}
				JOptionPane.showMessageDialog(null, result);
				
			}else if (op == 3) {
				String result = "Artilheiro do Campeonato\n";
				Jogador art = new Jogador();
				for (Time t: times) {
					t.artilheiroTime();
					if (t.artilheiroTime().getGols() > art.getGols()) {
                        art = t.artilheiroTime();
                    }
				}
				JOptionPane.showMessageDialog(null, result + art.getNome());
				
			} else if (op == 4) {
				String result = "Time com mais gols:\n";
				Time ti = new Time();
                for (Time t: times) {
                    if (t.golstime() > ti.golstime()) {
                        ti = t;
                    }
                }
                JOptionPane.showMessageDialog(null, result + ti.getNome());
				
			}
		}while(op!=5);
	}
}
