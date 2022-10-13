package client.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.io.IOException;
import java.util.logging.Level;

import client.Arquive;

public class Consult {
    public Consult() throws IOException, InterruptedException {
        Arquive log = new Arquive("LogConsult.txt");
        log.logger.setLevel(Level.FINEST);
        log.logger.finest("DB Consult started");
        Thread.sleep(2000);

        DBvariables var = new DBvariables();
        final String db_query = "SELECT * FROM pessoas";
        System.out.println("Iniciando conexão ao DB");

        try (Connection c = DriverManager.getConnection(var.get_db_url(), var.get_db_user(), var.get_db_password());
                Statement statement = c.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
                ResultSet resultSet = statement.executeQuery(db_query);) {
            System.out.println("Conectado ao MySQL");

            while (resultSet.next()) {
                System.out
                        .println(resultSet.getString(1) + " " + resultSet.getString(2));

            }
            log.logger.finest("DB Consult finished");
        } catch (SQLException sqlException) {
            log.logger.setLevel(Level.WARNING);
            log.logger.warning("Aborting DB Consult.............." + sqlException);
        }
    }
}
