package prescrição_medicamento;

import java.util.ArrayList;

import java.util.List;

import javax.swing.JOptionPane;

public class Indicação {
	
	private String indica;
	
	public List<String> cadastraInd() {
	    List<String> indicações = new ArrayList<>();
	        indica = JOptionPane.showInputDialog(null, "Indicação do Medicamento");
	    return indicações;
	}

	public String getIndica() {
		return indica;
	}

	public void setIndica(String indica) {
		this.indica = indica;
	}
}
