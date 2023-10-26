package farmácia_herança;

public class Medicamento extends Produto {
	
	private String receita;
	private String medico;

	public Medicamento() {
		super();
		setReceita(null);
		setMedico(null);
	}

	public Medicamento(String nome, int estoque, double valor, String receita, String medico) {
		super(nome, estoque, valor);
		this.receita = receita;
		this.medico = medico;
	}
	
	public boolean verificaReceita() {
		if (!receita.isEmpty()) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean venda(Cliente cliente, int qt) {
	    if (getEstoque() > 0 && verificaReceita() && qt <= getEstoque()) {
	        double valorTotal = qt * getValor();
	        if (cliente != null) {
	            cliente.setSaldoDevedor(cliente.getSaldoDevedor() + valorTotal);
	        }
	        setEstoque(getEstoque() - qt);
	        return true;
	    } else {
	    	cliente.setSaldoDevedor(cliente.getSaldoDevedor() + valor * qt);
	        return false;
	    }
	}

	
	@Override
	public String toString() {
	    return "Medicamento\n nome=" + nome + "\n receita=" + receita + "\n medico=" + medico + "\n valor= " + valor;
	}


	public String getReceita() {
		return receita;
	}

	public void setReceita(String receita) {
		this.receita = receita;
	}

	public String getMedico() {
		return medico;
	}

	public void setMedico(String medico) {
		this.medico = medico;
	}
		
}
