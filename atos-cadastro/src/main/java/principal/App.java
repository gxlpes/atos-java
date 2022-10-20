package principal;

import db.Consult;
import db.Delete;
import db.Insert;
import db.Update;

import log.Log;

import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;

public class App {
    public static void main(String[] args) throws IOException {
        Log logger = new Log("Log.text");
        Scanner read = new Scanner(System.in);
        padrao(logger, read);
    }

    public static void padrao(Log logger, Scanner read) throws IOException {

        logger.logger.setLevel(Level.FINEST);
        logger.logger.finest("Iniciou procedimento padrão para escolha de função");

        System.out.println("\nSISTEMA DE CADASTRO ATOS");

        System.out.println("1) Atualizar \n2) Inserir \n3) Excluir \n4) Consultar \n5) Sair");

        String sUserChoice = read.nextLine();
        int userChoice = Integer.parseInt(sUserChoice);

        switch (userChoice) {
            case 1:
                System.out.println("\nATUALIZAR");
                Update.aluno(logger, read);
                logger.logger.finest("Atualização realizada");
                break;

            case 2:
                System.out.println("\nINSERIR ALUNO");
                Insert.novoAluno(logger, read);
                logger.logger.finest("Inserção realizada");
                break;

            case 3:
                System.out.println("\nEXCLUIR ALUNO");
                System.out.println("Você deseja excluir toda a tabela ou apenas um aluno?");
                String dec = read.nextLine();

                if (dec.equalsIgnoreCase("aluno")) {
                    Delete.aluno(logger, read);
                } else {
                    Delete.truncate();
                }

                logger.logger.finest("Exclusão realizada");
                break;

            case 4:
                System.out.println("\nCONSULTAR");
                Consult.all(logger);
                logger.logger.finest("Consulta realizada");
                break;

            case 5:
                System.out.println("\nSISTEMA ENCERRANDO...");
                logger.logger.finest("Saída do programa");
                System.exit(1);
                break;
        }

        padrao(logger, read);

    }
}
