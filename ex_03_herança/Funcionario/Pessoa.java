package ex_03_herança.Funcionario;

import java.util.Scanner;

public class Pessoa {
    public static String nomePessoa;
    public static int idadePessoa, telefonePessoa;

    public Pessoa() {
        Scanner read = new Scanner(System.in);
        System.out.println("Digite o nome do pessoa: ");
        nomePessoa = read.next();
        System.out.println("Digite a idade do pessoa: ");
        idadePessoa = read.nextInt();
        System.out.println("Digite o telefone do pessoa: ");
        telefonePessoa = read.nextInt();
    }

    public void exibirPessoa() {
        System.out.println(nomePessoa + idadePessoa + telefonePessoa);
    }
}
