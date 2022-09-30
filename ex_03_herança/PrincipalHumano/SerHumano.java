package ex_03_herança.PrincipalHumano;

public class SerHumano extends Animal {
    
    public static String nome;
    public static int idade;

    public static void falar() {
        System.out.println("Nem todos falam");
    }

    public static void main(String args[]) {
        andar();
        String tipo;
    }
}
