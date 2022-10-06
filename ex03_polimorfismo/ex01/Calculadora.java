package ex03_polimorfismo.ex01;
import java.util.Scanner;

public class Calculadora {
    static String operacao;
    static float n1, n2;

    public static void main (String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        n1 = read.nextFloat();
        System.out.println("Digite o segundo número: ");
        n2 = read.nextFloat();
        System.out.println("Qual operação você gostaria de fazer?");
        operacao = read.next();

        switch (operacao) {
                case "s": 
                Somar somar = new Somar();
                somar.calcular(n1, n2);
                somar.exibeResultado();

                break;

                case "m":
                Multiplicar multiplicar = new Multiplicar();
                multiplicar.calcular(n1, n2);
                multiplicar.exibeResultado();

                case "d":
                Dividir dividir = new Dividir();
                dividir.calcular(n1, n2); 
                dividir.exibeResultado();

                case "x":
                Diminuir diminuir = new Diminuir();
                diminuir.calcular(n1, n2); 
                diminuir.exibeResultado();

        
            default:
            System.out.println("Digite uma operação existente!");
                break;
        }

        
        read.close();
    }
}
