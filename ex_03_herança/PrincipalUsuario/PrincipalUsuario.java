package ex_03_herança.PrincipalUsuario;
import java.util.Scanner;

public class PrincipalUsuario extends Usuario {
    
    public static void main(String[] args ) {
        Scanner leitura = new Scanner (System.in);
   
        System.out.println("Digite o nome desejado: ");
        nome = leitura.next();

        System.out.println("Digite o e-mail desejado: ");
        email = leitura.next();

        System.out.println("Digite o telefone desejado: ");
        telefone = leitura.nextInt();

        Usuario.exibeDados();
    }
}
