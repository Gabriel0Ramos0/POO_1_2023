package b_classes_objetos;

import javax.swing.JOptionPane;

public class Carro {

	String marca;
	int fabricacao, ano, ano_i, ano_f;
	double porcentagem;
	String cor;
	
	
	
	void cadastra () {
		marca = JOptionPane.showInputDialog(null, "Informe a marca");
		fabricacao = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o ano de fabricação"));
		cor = JOptionPane.showInputDialog(null, "Informe a cor").toUpperCase();
	}
	
	int getAnoFabricacao() {
        return fabricacao;
    }
	
	String getmarca () {
		return marca;
	}
	
	String getcor () {
		return cor;
	}
	String exibirDados() {
		return marca + " - " + cor + " - " + fabricacao + "\n";
	}	
}
