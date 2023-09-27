package prescrição_medicamento;

import java.util.ArrayList;

import java.util.List;

import javax.swing.JOptionPane;

public class ContraIndicação {

	private String contraindica;
	
	public List<String> cadastraContraInd() {
	    List<String> contraindicações = new ArrayList<>();
	        contraindica = JOptionPane.showInputDialog(null, "Contra Indicação do Medicamento");
	    return contraindicações;
	}
	
	public String getContraindica() {
		return contraindica;
	}

	public void setContraindica(String contraindica) {
		this.contraindica = contraindica;
	}
	
}
