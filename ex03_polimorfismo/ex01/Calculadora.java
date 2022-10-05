package ex03_polimorfismo.ex01;
import java.util.Scanner;

public class Calculadora {
    static String operacao;

    public static void main (String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Qual operação você gostaria de fazer?");
        operacao = read.next();


        Somar somar = new Somar();
        somar.calcular(2, 3);
        somar.exibeResultado();

        read.close()
    }
}
