package prescrição_medicamento;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Pessoa {
    private String nome;
    private String sintoma;
    private int numCondições;
    private Medicamento medicamento;
    private ArrayList<String> condições;

    public Pessoa() {
        condições = new ArrayList<>();
        cadastraP();
    }

    public void cadastraP() {
        setNome(JOptionPane.showInputDialog(null, "Informe o nome da pessoa"));
        setSintoma(JOptionPane.showInputDialog(null, "Informe o Sintoma"));

        setNumCondições (Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o número de condições de saúde" + "\nInforme 0 caso não tenha")));
        for (int i = 0; i < getNumCondições(); i++) {
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

	public int getNumCondições() {
		return numCondições;
	}

	public void setNumCondições(int numCondições) {
		 while (numCondições < 0) {
			 String input = JOptionPane.showInputDialog("Informe um número não negativo!");
			 numCondições = Integer.parseInt(input);
		 }
		this.numCondições = numCondições;
	}
	
}
