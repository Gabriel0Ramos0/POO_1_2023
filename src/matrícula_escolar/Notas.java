package matrícula_escolar;

import javax.swing.JOptionPane;

public class Notas {
	
	private Disciplina disc;
	private double n1;
	private double n2;
	private double n3;
	
	
	public Disciplina getDisc() {
		return disc;
	}
	
	public void setDisc(Disciplina disc) {
		this.disc = disc;
	}
	
	public double getN1() {
		return n1;
	}
	public void setN1(double n1) {
		while (n1 < 0 || n1 > 10) {
	        String input = JOptionPane.showInputDialog(null, "Informe uma nota de 0 a 10");
	        n1 = Double.parseDouble(input);
	    }
	    this.n1 = n1;
	}
	
	public double getN2() {
		return n2;
	}
	
	public void setN2(double n2) {
	    while (n2 < 0 || n2 > 10) {
	        String input = JOptionPane.showInputDialog(null, "Informe uma nota de 0 a 10");
	        n2 = Double.parseDouble(input);
	    }
	    this.n2 = n2;
	}
	
	public double getN3() {
		return n3;
	}
	
	public void setN3(double n3) {
		while (n3 < 0 || n3 > 10) {
	        String input = JOptionPane.showInputDialog(null, "Informe uma nota de 0 a 10");
	        n3 = Double.parseDouble(input);
	    }
	    this.n3 = n3;
	}
}