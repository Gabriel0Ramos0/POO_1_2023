package prescrição_medicamento;

import javax.swing.JOptionPane;

import java.util.ArrayList;

public class Medicamento {
    
    private String nome;
    private String tipo;
    private int nu;
    private ArrayList<Indicação> indicações;
    private ArrayList<ContraIndicação> contraindicações;
    
    public Medicamento() {
    	indicações = new ArrayList<>();
        contraindicações = new ArrayList<>();
        cadastraM();
    }
    
    public void cadastraM() {
        setNome(JOptionPane.showInputDialog(null, "Informe o nome do medicamento"));
        JOptionPane.showMessageDialog(null, "Administração:\n" + "\n1- Injetável" + "\n2- Tópico" + "\n3- Oral");
        setNu(Integer.parseInt(JOptionPane.showInputDialog(null, "Informe um número correspondente! (1/2/3)")));

        if (nu == 1) {
            setTipo("Injetável");
        } else if (nu == 2) {
            setTipo("Tópico");
        } else if (nu == 3) {
            setTipo("Oral");
        }
        int numIndicações = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a quantidade de Indicações"));
        for (int i = 0; i < numIndicações; i++) {
            Indicação indicação = new Indicação();
            indicação.cadastraInd();
            indicações.add(indicação);
        }
        int numContraindicações = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a quantidade de Contra Indicações" + "\nInforme 0 caso não tenha"));
        for (int i = 0; i < numContraindicações; i++) {
            ContraIndicação contraindicação = new ContraIndicação();
            contraindicação.cadastraContraInd();
            contraindicações.add(contraindicação);
        }
    }
    public String exibirNome() {
        StringBuilder detalhes = new StringBuilder();
        detalhes.append("Nome: ").append(getNome()).append("\n"); 
        return detalhes.toString();
    }
    
    public String exibirDetalhes() {
        StringBuilder detalhes = new StringBuilder();
        detalhes.append("Nome: ").append(getNome()).append("\n"); 
        detalhes.append("Tipo: ").append(getTipo()).append("\n\n");
        detalhes.append("Indicações:\n");
        for (Indicação indicação : indicações) {
            detalhes.append(indicação.getIndica()).append("\n");
        }
        detalhes.append("\nContraindicações:\n");
        for (ContraIndicação contraindicação : contraindicações) {
            detalhes.append(contraindicação.getContraindica()).append("\n");
        }
        return detalhes.toString();
    }

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if(nome != null && !nome.isEmpty()) {
			this.nome = nome;
		} else {
			setNome(JOptionPane.showInputDialog("É nescessário informar o nome do medicamento!"));
		}
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getNu() {
		return nu;
	}

	public void setNu(int nu) {
		while (nu < 1 || nu > 3) {
	        String input = JOptionPane.showInputDialog("Informe um número correspondente! (1/2/3)");
	        nu = Integer.parseInt(input);
	    }
	    this.nu = nu; 
	}

	public ArrayList<Indicação> getIndicações() {
		return indicações;
	}

	public void setIndicações(ArrayList<Indicação> indicações) {
		this.indicações = indicações;
	}

	public ArrayList<ContraIndicação> getContraindicações() {
		return contraindicações;
	}

	public void setContraindicações(ArrayList<ContraIndicação> contraindicações) {
		this.contraindicações = contraindicações;
	}	
}
