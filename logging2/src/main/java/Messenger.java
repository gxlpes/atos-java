
import lombok.extern.slf4j.Slf4j;

@Slf4j

public class Messenger {
    public static void main(String[] args) {
        log.info("Execution started");

        try {
            Thread.sleep(5000);
            var x = 4 / 0;
            log.info("Result is: " + x);
        } catch (ArithmeticException e) {
            log.error("An error has occured ", e);
        } catch (InterruptedException e) {
            log.error("Thread error");
        }

        log.info("Execution finished");
    }
}
