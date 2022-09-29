package transporte;

public class Moto {
	
	public String marca;
	public String modelo;
	public String cc;

	public void atribuirValores(String marcaMoto, String modeloMoto, String cilindradaMoto) {
		marca = marcaMoto;
		modelo = modeloMoto;
		cc = cilindradaMoto;
	}
	
	public void retornarValores() {
		System.out.println("Dados da moto: " + marca + " " + modelo + " " + cc);
	}

}
