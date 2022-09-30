package ex_03_herança.Principal;

public class Usuario {
    protected static String nome, email;
    protected static int telefone;

    public static void exibeDados() {
         System.out.println("Nome cadastrado" + " " + nome + "com o email" + " " + telefone + " " + "e o telefone" + " " + telefone);
    }
}
