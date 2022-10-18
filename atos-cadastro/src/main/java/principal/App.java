package principal;

import db.Consult;
import db.Delete;
import db.Insert;
import db.Update;


import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;

public class App {
    static String user;
    static int userChoice;

    public static void main(String[] args) throws IOException {
        padrao();
    }

    public static void padrao() throws IOException {
        Scanner read = new Scanner(System.in);

        System.out.println("\nSISTEMA DE CADASTRO ATOS");

        System.out.println("1) Atualizar \n2) Inserir \n3) Excluir \n4) Consultar \n5) Sair");

        userChoice = read.nextInt();

        switch (userChoice) {
            case 1:
                System.out.println("\nATUALIZAR");
                Update.aluno();
                break;
            case 2:
                System.out.println("\nINSERIR ALUNO");
                Insert.novoAluno();
                break;
            case 3:
                System.out.println("\nEXCLUIR ALUNO");
                Delete.aluno();
                break;
            case 4:
                System.out.println("\nCONSULTAR");
                Consult.all();
                break;
            case 5:
                System.out.println("\nSISTEMA ENCERRANDO...");
                System.exit(1);
                break;
        }
        padrao();;
    }
}
