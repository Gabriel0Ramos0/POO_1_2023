package desafio_livros;

import javax.swing.JOptionPane;

public class Autor {
	
	private String nome;
	private String sexo;
	private int idade;
	private String filho;
	private int idadef;
	
	public void cadastraautor() {
		setNome (JOptionPane.showInputDialog(null, "Informe o nome do autor"));
		setSexo (JOptionPane.showInputDialog(null, "Informe o sexo"));
		setIdade (Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a idade")));
		setFilho (JOptionPane.showInputDialog(null, "Possui filho com menos de 13 anos?" + "\n Sim ou Não").toUpperCase());
		if (getFilho().equalsIgnoreCase("SIM")) {
            setIdadef (Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a idade do mais novo")));
        }
	}
	
	public String exibira() {
        return "Nome: " + getNome() + "\nSexo: " + getSexo() + "\nIdade: " + getIdade() + "\n";
    }

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		String[] partesNome = nome.split(" ");
        if (partesNome.length == 2) {
            this.nome = nome;
        } else {
            JOptionPane.showMessageDialog(null, "O nome deve conter duas palavras (nome e sobrenome).");
        }
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		if (sexo.equalsIgnoreCase("Masculino") || sexo.equalsIgnoreCase("Feminino")) {
            this.sexo = sexo;
        } else {
            JOptionPane.showMessageDialog(null, "O sexo deve ser Masculino ou Feminino.");
        }
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		if (idade > 0) {
            this.idade = idade;
        } else {
            JOptionPane.showMessageDialog(null, "A idade deve ser maior que zero.");
        }
	}

	public String getFilho() {
		return filho;
	}

	public void setFilho(String filho) {
		this.filho = filho;
	}

	public int getIdadef() {
		return idadef;
	}

	public void setIdadef(int idadef) {
		this.idadef = idadef;
	}
	
}
