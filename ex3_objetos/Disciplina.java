
public class Disciplina {

	public static void main(String[] args) {
		
		Professor professor = new Professor();
		professor.nome = "Lucas";
		Laboratorio laboratorio = new Laboratorio();
		laboratorio.local = "Sala 2";
		
		System.out.println("O nome do professor é " + professor.nome + " " + "e a sala é " + laboratorio.local);
	
	}

}
