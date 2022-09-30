package ex_02_construtores.Pessoa;
public class Pessoa {

    private String nomePessoa;
    private int idadePessoa;

    public Pessoa (String nome, int idade) {
        nomePessoa = nome;
        idadePessoa = idade;

        System.out.println("O nome é" + " " + nomePessoa +" "+ "e a idade é" + " "+ idadePessoa + " " + "anos");
    }

    public Pessoa(int idade) {
        idadePessoa = idade;

        System.out.printf("A idade da pessoa é %d anos", idadePessoa);
    }

}