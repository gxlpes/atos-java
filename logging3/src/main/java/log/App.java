package log;

import java.io.IOException;
import java.util.logging.Level;

public class App {
    static Float result, n1, n2;

    public static void main(String[] args) throws IOException, InterruptedException {

        Arquive log = new Arquive("Log.txt");
        log.logger.setLevel(Level.FINEST);
        log.logger.finest("Execution started");
        Thread.sleep(2000);

        Question q = new Question();
        n1 = q.questionQ1();
        n2 = q.questionQ2();

        result = n1 / n2;

        if (result.isInfinite()) {
            log.logger.setLevel(Level.WARNING);
            log.logger.warning("Result is infinite, aborting execution.");
        } else {
            log.logger.setLevel(Level.INFO);
            log.logger.info("Result is: " + result);
        }

    }
}