package sistema_condomínio;

import javax.swing.JOptionPane;

public class Despesas {
	
	private String descricao;
	private int ano;
	private int mes;
	private double valor;
	
	public void gerarDespesa() {
		setDescricao(JOptionPane.showInputDialog(null, "Digite a descrição:"));
		setAno(Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o ano")));
		setMes(Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o mês em número")));
		setValor (Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o valor em R$")));
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		if (descricao !=null && !descricao.isEmpty()) {
			this.descricao = descricao;
		} else {
		setDescricao (JOptionPane.showInputDialog(null, "Digite uma descrição!"));
		}
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		if (ano <= 0) {
			setAno (Integer.parseInt(JOptionPane.showInputDialog(null, "Ano sem dados ou valor inválido, por favor, insira outro ano")));
		}
		this.ano = ano;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		if (mes <= 0 && mes <= 13) {
			setMes (Integer.parseInt(JOptionPane.showInputDialog(null, "Mês sem dados ou valor inválido, por favor, insira outro mês")));
		}
		this.mes = mes;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		if (valor <= 0) {
			setValor (Integer.parseInt(JOptionPane.showInputDialog(null, "Valor inválido, por favor, insira outro valor")));
		}
		this.valor = valor;
	}
}
