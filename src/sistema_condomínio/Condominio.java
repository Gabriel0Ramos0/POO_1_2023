package sistema_condomínio;

import javax.swing.JOptionPane;

public class Condominio {
	
	private String apartamento;
	
	public void cadastraA() {
		setApartamento(JOptionPane.showInputDialog(null, "Informe o apartamento"));
	}

	public String getApartamento() {
		return apartamento;
	}

	public void setApartamento(String apartamento) {
		this.apartamento = apartamento;
	}
	
}
