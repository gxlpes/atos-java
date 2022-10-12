public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Execution started");

        try {
            Thread.sleep(5000);
            var x = 4 / 0;
            System.out.println("Result is: " + x);
        } catch (ArithmeticException e) {
            System.err.println("Error on the operation " + e);
        } catch (InterruptedException e) {
            System.err.println("Thread error" + e);
        }

        System.out.println("Execution finished");
    }
}
