package ex03_polimorfismo.ex02;
import java.util.Scanner;


public class Dados {
    static String nome, email;
    static Scanner read = new Scanner(System.in);

    public void readName() {
        System.out.println("Digite o nome do usuário: ");
        nome = read.next();
    }
    
    public void readEmail() {
        System.out.println("Digite o email do usuário: ");
        email = read.next();
        read.close();
    }
    
    }
