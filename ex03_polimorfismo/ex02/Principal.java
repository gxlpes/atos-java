package ex03_polimorfismo.ex02;
import java.util.Scanner;

public class Principal {
    static String decisao;
    public static void main (String[] args) {
        Scanner read = new Scanner(System.in);

        Dados d = new Dados();
        d.readName();
        d.readEmail();

        FileAction f = new FileAction();
        f.createFile();
        f.writeFile();
        f.readFile();



        read.close();
    }

}
