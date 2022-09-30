import java.util.Scanner;
import transporte.*;

public class LocadoraVeiculos {
 public static void main(String [] args) {
	 Carro carro = new Carro();
	 Moto moto1 = new Moto();
	 Moto moto2 = new Moto();

	 String fabricante, modelo, cc;
	 	 
	 Scanner leitura = new Scanner(System.in);
	 System.out.println("Insira a fabricante do carro: ");
	 fabricante = leitura.nextLine();
	 
	 System.out.println("Insira a modelo do carro: ");
	 modelo = leitura.nextLine();
	 
	 carro.configuraDados(fabricante, modelo);
	 
	 System.out.println("Insira a fabricante do moto 1: ");
	 fabricante = leitura.nextLine();
	 System.out.println("Insira a modelo do moto 1: ");
	 modelo = leitura.nextLine();
	 System.out.println("Insira a cc do moto 1: ");
	 cc = leitura.nextLine();
	 moto1.atribuirValores(fabricante, modelo, cc);
	 
	 System.out.println("Insira a fabricante do moto 2: ");
	 fabricante = leitura.nextLine();
	 System.out.println("Insira a modelo do moto 2: ");
	 modelo = leitura.nextLine();
	 System.out.println("Insira a cc do moto 2: ");
	 cc = leitura.nextLine();
	 moto2.atribuirValores(fabricante, modelo, cc);
	 
	 leitura.close();
	 
	 moto1.retornarValores();
	 moto2.retornarValores();
	 carro.exibirDados();
 }
	
}
