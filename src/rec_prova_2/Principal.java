package rec_prova_2;

public class Principal {
	public static void main(String[] args) {
		Aluno a = new Aluno("Ana");
		Graduação g = new Graduação ("G1");
		g.setVagas(10);
		Doutorado d = new Doutorado ("D1");
		d.setVagas(3);
		g.fazMatricula(a);
		System.out.println(a);
		a.aprova();
		g.fazMatricula(a);
		a.aprova();
		System.out.println(a);
		d.fazMatricula(a);
		System.out.println(a);
	}
}
