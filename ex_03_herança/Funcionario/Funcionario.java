package ex_03_herança.Funcionario;
import java.util.Scanner;

public class Funcionario extends Pessoa {
        public static String cargo, setor, funcao;

        public Funcionario() {
            Scanner read = new Scanner(System.in);
            System.out.println("Digite a função do funcionário: ");
            funcao = read.nextLine();
            System.out.println("Digite o cargo do funcionário: ");
            cargo = read.nextLine();
            System.out.println("Digite o setor do funcionário: ");
            setor = read.nextLine();
        }


}
