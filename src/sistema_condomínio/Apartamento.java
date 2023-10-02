package sistema_condomínio;

import javax.swing.JOptionPane;

public class Apartamento {

	private String apartamento;
	
	public void cadastraAP() {
		setApartamento(JOptionPane.showInputDialog(null, "Informe o apartamento"));
	}

	public String getApartamento() {
		return apartamento;
	}

	public void setApartamento(String apartamento) {
		this.apartamento = apartamento;
	}
	
}
