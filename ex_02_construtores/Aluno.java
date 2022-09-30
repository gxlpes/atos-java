package ex_02_construtores;

public class Aluno {
    String nomeAluno;
    int matriculaAluno;
    String dataNascAluno;
    int anoEntradaAluno;

    public Aluno(String nome, int matricula) {
        nomeAluno = nome;
        matriculaAluno = matricula;
    }

    public Aluno (String data) {
        dataNascAluno = data;
    }

    public Aluno(String nome, int matricula, int ano) {
        nomeAluno = nome;
        matriculaAluno = matricula;
        anoEntradaAluno = ano;
    }
}
