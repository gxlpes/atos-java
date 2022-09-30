package ex_02_construtores;
public class Pessoa {

    private String nomePessoa = "desconhecido";
    private int idadePessoa;

    public Pessoa (String nome, int idade) {
        nomePessoa = nome;
        idadePessoa = idade;
    }

    public Pessoa(int idade) {
        idadePessoa = idade;
    }

    public void exibirDados() {
        System.out.println("O nome é" + " " + nomePessoa +" "+ "e a idade é" + " "+ idadePessoa + " " + "anos");
    }
}