package ex_02_construtores.Aluno;

public class Aluno {
    String nomeAluno;
    int matriculaAluno;
    String dataNascAluno;
    int anoEntradaAluno;

    public Aluno(String nome, int matricula) {
        nomeAluno = nome;
        matriculaAluno = matricula;
        System.out.println(nomeAluno + " " + matriculaAluno);
    }

    public Aluno (String data) {
        dataNascAluno = data;
        System.out.println(dataNascAluno);
    }

    public Aluno(String nome, int matricula, int ano) {
        nomeAluno = nome;
        matriculaAluno = matricula;
        anoEntradaAluno = ano;
        System.out.println(nomeAluno + " " + matriculaAluno + " " + anoEntradaAluno) ;
    }
}
