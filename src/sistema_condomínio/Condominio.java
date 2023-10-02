package sistema_condomínio;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Condominio {
	
	private ArrayList <Apartamento> apartamento;
	private ArrayList <Despesas> despesas;
	
	public Condominio() {
		apartamento = new ArrayList<>();
		despesas = new ArrayList<>();
	}
	
	public void cadastrarAP() {
		Apartamento apartamentos = new Apartamento();
		apartamentos.cadastraAP();
		apartamento.add(apartamentos);
	}
	
	public void cadastrarD() {
		Despesas despesa = new Despesas();
		despesa.gerarDespesa();
		despesas.add(despesa);
	}
	
	public void valorDevidoPorProprietario() {
	    int ano = Integer.parseInt(JOptionPane.showInputDialog("Informe o ano da despesa"));
	    int mes = Integer.parseInt(JOptionPane.showInputDialog("Informe o mês da despesa"));
	    StringBuilder valoresDevidos = new StringBuilder("Total devido por proprietário: \n\n");

	    for (Apartamento a : apartamento) {
	        double valorApartamento = a.calculaValorApartamento();
	        double valorDespesas = calcularTotalDespesaPorApartamento(ano, mes);
	        double valorTotal = valorApartamento + valorDespesas;
	        valoresDevidos.append("Proprietário: ").append(a.getNome()).append("\nR$: ").append(valorTotal).append("\n");
	    }
	    JOptionPane.showMessageDialog(null, valoresDevidos.toString());
	}
	
	private double calcularTotalDespesaPorApartamento(int ano, int mes) {
		double valorTotalDespesa = 0;
		for (Despesas d : despesas) {
			if (d.getAno() == ano && d.getMes() == mes) {
				valorTotalDespesa += d.getValor() / apartamento.size();
			}
		}
		return valorTotalDespesa;
	}
	
	private String extratoDespesaPorApartamento(int ano, int mes) {
		String extratoDespesa = "";
		for (Despesas d : despesas) {
			if (d.getAno() == ano && d.getMes() == mes) {
				double valorDespesa = d.getValor() / apartamento.size();
				extratoDespesa += d.getDescricao() + " - R$: " + valorDespesa + "\n";
			}
		}
		return extratoDespesa;
	}
	
	public void extratoDespesaTotalPorApartamento() {
	    StringBuilder listaApartamentos = new StringBuilder();
	    for (Apartamento a : apartamento) {
	        listaApartamentos.append(a.getNumero()).append(" - ").append(a.getNome()).append("\n");
	    }

	    int nApartamento = Integer.parseInt(JOptionPane.showInputDialog("Numero do apartamento:\n" + listaApartamentos.toString()));
	    int ano = Integer.parseInt(JOptionPane.showInputDialog("Informe o ano da despesa"));
	    int mes = Integer.parseInt(JOptionPane.showInputDialog("Informe o mês da despesa"));
	    StringBuilder extrato = new StringBuilder("Extrato do apartamento: ").append(nApartamento).append("\n\n");
	    for (Apartamento a : apartamento) {
	        if (a.getNumero() == nApartamento) {
	            double valorApartamento = a.calculaValorApartamento();
	            double valorTotal = valorApartamento + calcularTotalDespesaPorApartamento(ano, mes);
	            extrato.append("Despesas: \n").append(extratoDespesaPorApartamento(ano, mes))
	            		.append("Condomínio - R$: ").append(valorApartamento)
	            		.append("\n\nValor total R$: ").append(valorTotal);
	        }
	    }
	    JOptionPane.showMessageDialog(null, extrato.toString());
	}

	public ArrayList<Apartamento> getApartamento() {
		return apartamento;
	}

	public void setApartamento(ArrayList<Apartamento> apartamento) {
		this.apartamento = apartamento;
	}

	public ArrayList<Despesas> getDespesas() {
		return despesas;
	}

	public void setDespesas(ArrayList<Despesas> despesas) {
		this.despesas = despesas;
	}

}
