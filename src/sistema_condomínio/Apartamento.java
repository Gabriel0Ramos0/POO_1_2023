package sistema_condomínio;

import javax.swing.JOptionPane;

public class Apartamento {

	private int numero;
	private String bloco;
	private double tamanhoMetroQuadrado;
	private String nome;
	private static double vldoCondominio = 5.00;
	
	public void cadastraAP() {
		setNumero (Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o número do apartamento")));
		setBloco (JOptionPane.showInputDialog(null, "Informe o bloco do apartamento"));
		setTamanhoMetroQuadrado (Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o tamanho em M²")));
		setNome (JOptionPane.showInputDialog(null, "Informe o nome do Alugante"));
	}
	
	public double calculaValorApartamento() {
		return tamanhoMetroQuadrado * vldoCondominio;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public void setNumero(int numero) {
		if (numero <= 0) {
			setNumero(Integer.parseInt(JOptionPane.showInputDialog(null, "O número deve ser maior que 0!")));
	    }
	    this.numero = numero; 
	}
	
	public String getBloco() {
		return bloco;
	}

	public void setBloco(String bloco) {
		if(bloco != null && !bloco.isEmpty()) {
			this.bloco = bloco;
		} else {
			setBloco(JOptionPane.showInputDialog("É nescessário informar bloco!"));
		}
	}

	public double getTamanhoMetroQuadrado() {
		return tamanhoMetroQuadrado;
	}
	
	public void setTamanhoMetroQuadrado(double tamanhoMetroQuadrado) {
		if (tamanhoMetroQuadrado <= 0) {
			setTamanhoMetroQuadrado(Integer.parseInt(JOptionPane.showInputDialog(null, "O tamanho deve ser maior que 0!")));
	    }
		this.tamanhoMetroQuadrado = tamanhoMetroQuadrado;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		if(nome != null && !nome.isEmpty()) {
			this.nome = nome;
		} else {
			setNome(JOptionPane.showInputDialog("É nescessário informar o nome do Alugante!"));
		}
	}
	
	public static double getVldoCondominio() {
		return vldoCondominio;
	}
	
	public static void setVldoCondominio(double vldoCondominio) {
		Apartamento.vldoCondominio = vldoCondominio;
	}	
}
