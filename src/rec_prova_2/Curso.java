package rec_prova_2;

public class Curso {
	
	private String nome;
	private int vagas = 1;
	
	public Curso (String nome){
		this.nome = nome;
	}

	public void fazMatricula(Aluno a){
		if (getVagas() > 0){
			vagas--;
			a.setCurso(this);
		}
	}

	public String toString(){
		return getNome() + " - " + getVagas();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getVagas() {
		return vagas;
	}

	public void setVagas(int vagas) {
		this.vagas = vagas;
	}
	
}


