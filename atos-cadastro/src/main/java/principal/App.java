package principal;

import db.Consult;
import db.Delete;
import db.Insert;
import db.Update;

import log.Arquive;

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
        Arquive log = new Arquive("Log.txt");

        log.logger.setLevel(Level.FINEST);
        log.logger.finest("Execução do programa");

        System.out.println("SISTEMA DE CADASTRO ATOS");

        System.out.println("1) Atualizar \n2) Inserir \n3) Excluir \n4) Consultar \n5) Sair");

        userChoice = read.nextInt();

        do {
            switch (userChoice) {
                case 1:
                    System.out.println("ATUALIZAR");
                    Update.aluno();
                    log.logger.finest("Atualização processada");
                    break;
                case 2:
                    System.out.println("INSERIR ALUNO");
                    Insert.novoAluno();
                    break;
                case 3:
                    System.out.println("EXCLUIR ALUNO");
                    Delete.aluno();
                    break;
                case 4:
                    System.out.println("CONSULTAR");
                    Consult.all();
                    System.out.println("Deseja retornar a tela inicial?");
                    String dec = read.next();
                    if (dec.equalsIgnoreCase("sim")) {
                        padrao();
                    } else {
                        System.out.println("SISTEMA ENCERRANDO...");
                    }
                    break;
                case 5:
                    user = "n";
                    System.out.println("SISTEMA ENCERRANDO...");
                    break;
            }
            if (userChoice != 5) padrao();

        } while (user.equals("sim"));
    }
}
