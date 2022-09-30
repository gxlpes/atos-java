package ex_02_construtores.Pessoa;
import java.util.Scanner;

public class PrincipalPessoa {
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

        } else {
            System.out.println("Digite a idade da pessoa: ");
            idade = leitura.nextInt(); 

            Pessoa pessoaNova = new Pessoa(idade);
        }





        leitura.close();
    }
}
