package ex_03_herança.PrincipalHumano;
import java.util.Scanner;

public class PrincipalHumano extends Pessoa {
    
public static void main(String args[]) {

    Scanner read = new Scanner(System.in);
    
    System.out.println("Informe o nome: ");
    nome = read.next();

    System.out.println("Informe a idade: ");
    idade = read.nextInt();

    System.out.println("Informe o tipo: ");
    tipo = read.next();

    falar();
    andar();
}

}
