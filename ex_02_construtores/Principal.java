package ex_02_construtores;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        int construct;
        String nome;
        int idade;

        Scanner leitura = new Scanner (System.in);

        System.out.println("Digite qual constructor você gostaria de usar");
        construct = leitura.nextInt();

        if(construct == 1) {
            System.out.println("Digite o nome da pessoa: ");
            nome = leitura.next();

            System.out.println("Digite a idade da pessoa: ");
            idade = leitura.nextInt();

            Pessoa pessoaNova = new Pessoa(nome, idade);
            pessoaNova.exibirDados();
        } else {
            System.out.println("Digite a idade da pessoa: ");
            idade = leitura.nextInt(); 
            Pessoa pessoaNova = new Pessoa(idade);
            pessoaNova.exibirDados();
        }





        leitura.close();
    }
}
