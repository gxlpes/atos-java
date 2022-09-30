package ex_03_herança.Funcionario;
import java.util.Scanner;

public class Funcionario extends Pessoa {
        public static String cargo, setor, funcao;

        public Funcionario() {
            Scanner read = new Scanner(System.in);
            System.out.println("Digite a funcao do funcionário: ");
            funcao = read.next();
            System.out.println("Digite o cargo do funcionário: ");
            cargo = read.next();
            System.out.println("Digite o setor do funcionário: ");
            setor = read.next();

            System.out.println("Digite o nome da pessoa: ");
            nomePessoa = read.next();
            System.out.println("Digite a idade da pessoa: ");
            idadePessoa = read.nextInt();
            System.out.println("Digite o telefone da pessoa: ");
            telefonePessoa = read.nextInt();
        }

          public static void MostrarFuncionario() {
          System.out.println(nomePessoa + " " + idadePessoa + " "  + telefonePessoa +  " " + cargo + " "  + funcao + " "  +  setor);

        }


}
