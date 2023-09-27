package prescrição_medicamento;

import java.util.ArrayList;

import java.util.List;

import javax.swing.JOptionPane;

public class Condição {
	
	private String condi;
	
	public List<String> cadastraC() {
	    List<String> condições = new ArrayList<>();
	        condi = JOptionPane.showInputDialog(null, "Condição de Saúde");
	    return condições;
	}

	public String getCondi() {
		return condi;
	}

	public void setCondi(String condi) {
		this.condi = condi;
	}
	
}
