package rec_prova_2;

public class Mestrado extends PosGraduação {
	public Mestrado(String nome){
		super(nome);
	}	

	public void fazMatricula(Aluno a) {
		if (a.getNivel() >= 1)
			super.fazMatricula(a);
		}

	public String toString() {
		return super.toString() + ": Mestrado";
	}

}
