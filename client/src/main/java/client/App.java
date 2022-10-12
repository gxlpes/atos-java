package client;

import java.io.IOException;
import java.util.Scanner;

import client.db.Consult;
import client.db.Insert;

public class App {
    static String decisao, nome, celular;

    public static void main(String[] args) throws InterruptedException, IOException {
        Scanner read = new Scanner(System.in);

        System.out.println("Você gostaria de CONSULTAR (c) ou INSERIR (i)?");
        decisao = read.next();

        switch (decisao) {
            case "c":
                Consult c = new Consult();
                break;

            case "i":

                System.out.println("Digite um celular:");
                celular = read.next();

                System.out.println("Digite um nome:");
                nome = read.next();

                Insert i = new Insert(nome, celular);
                break;

            default:
                System.out.println("Digite C ou I para fazer funcionar!");
        }

        read.close();

    }
}