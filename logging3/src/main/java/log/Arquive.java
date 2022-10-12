package log;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Arquive {
    public Logger logger;
    FileHandler fh;
    public Object log;

    // verifica se o arquivo de log já existe
    public Arquive(String nome_arquivo) throws IOException {
        File f = new File(nome_arquivo);
        if (!f.exists()) {
            f.createNewFile();
        }

        fh = new FileHandler(nome_arquivo, true); // cria o arquivo especificado
        logger = Logger.getLogger(("Logging")); // método estático presente dentro da classe Logger
        logger.addHandler(fh);
        SimpleFormatter formatter = new SimpleFormatter();
        fh.setFormatter(formatter);
    }
}