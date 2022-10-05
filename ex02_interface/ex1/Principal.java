package ex02_interface.ex1;
import java.util.Scanner;

public class Principal extends Mensagem{
    static String msgB;
    public static void main (String[] args) {
        Principal m = new Principal();

        Scanner  read = new Scanner(System.in);
        System.out.println("Digite uma mensagem:");
        msgB = read.next();

        m.exibeMensagemB();
        m.exibeMensagemA();

        read.close();
    }

    @Override
    void exibeMensagemB() {

        System.out.println(("A mensagem é" + " " + msgB));
    }

    @Override
    void exibeMensagemA() {
        System.out.println("Cuide bem dos animais");
    }

}
