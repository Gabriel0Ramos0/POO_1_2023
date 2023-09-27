package prescrição_medicamento;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Pessoa {
    private String nome;
    private String sintoma;
    private Medicamento medicamento;
    private ArrayList<String> condições; // Lista de condições de saúde como strings

    public Pessoa() {
        condições = new ArrayList<>();
        cadastraP();
    }

    public void cadastraP() {
        setNome(JOptionPane.showInputDialog(null, "Informe o nome da pessoa"));
        setSintoma(JOptionPane.showInputDialog(null, "Informe o Sintoma"));

        int numCondições = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o número de condições de saúde"));
        for (int i = 0; i < numCondições; i++) {
            String condição = JOptionPane.showInputDialog(null, "Informe a Condição de Saúde");
            condições.add(condição);
        }
    }

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if(nome != null && !nome.isEmpty()) {
			this.nome = nome;
		} else {
			setNome(JOptionPane.showInputDialog("Informe o Nome da Pessoa!"));
		}
	}	

	public String getSintoma() {
		return sintoma;
	}

	public void setSintoma(String sintoma) {
		if (sintoma != null && !sintoma.isEmpty()) {
			this.sintoma = sintoma;
		} else {
			setSintoma(JOptionPane.showInputDialog(null, "Informe o Sintoma!")); 
		}
	}

	public Medicamento getMedicamento() {
		return medicamento;
	}

	public void setMedicamento(Medicamento medicamento) {
		this.medicamento = medicamento;
	}

	public ArrayList<String> getCondições() {
		return condições;
	}

	public void setCondições(ArrayList<String> condições) {
		this.condições = condições;
	}
}
