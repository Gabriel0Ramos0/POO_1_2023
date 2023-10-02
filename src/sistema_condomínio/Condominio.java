package sistema_condomínio;

import javax.swing.JOptionPane;

public class Condominio {
	
	private String condiminio;
	
	public void cadastraC() {
		setCondiminio(JOptionPane.showInputDialog(null, "Informe o apartamento"));
	}

	public String getCondiminio() {
		return condiminio;
	}

	public void setCondiminio(String condiminio) {
		this.condiminio = condiminio;
	}
	
}
