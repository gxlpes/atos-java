package client.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import java.io.IOException;
import java.util.logging.Level;

import client.Arquive;

public class Insert {

    public Insert(String nome, String celular) throws InterruptedException, IOException {
        Arquive log = new Arquive("LogInsert.txt");
        DBvariables var = new DBvariables();
        log.logger.setLevel(Level.FINEST);
        log.logger.finest("DB Insert started");
        Thread.sleep(2000);

        final String db_query = String.format("INSERT INTO pessoas VALUES ('%s', '%s')", nome, celular);
        System.out.println("Iniciando conexão ao DB");

        try {
            System.out.println(db_query);
            Connection c = DriverManager.getConnection(var.get_db_url(), var.get_db_user(), var.get_db_password());

            System.out.println("Conectado ao MySQL");
            Statement statement = c.createStatement(); // config de acesso aos cursores
            int linhas = statement.executeUpdate(db_query);
            System.out.println("A query afetou " + linhas);
            log.logger.setLevel(Level.FINEST);
            log.logger.finest("DB Insert finished");
            statement.close();
            c.close();
        } catch (SQLException sqlException) {
            log.logger.setLevel(Level.WARNING);
            log.logger.warning("Aborting DB Insert.............." + sqlException);
        }

    }

}