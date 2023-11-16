package rec_prova_2;

public class Doutorado extends PosGraduação{
	
	public Doutorado(String nome){
		super(nome);
	}	

	public void fazMatricula(Aluno a) {
		if (a.getNivel() >= 2)
			super.fazMatricula(a);
		}

	public String toString() {
		return super.toString() + ": Doutorado";
	}

}

