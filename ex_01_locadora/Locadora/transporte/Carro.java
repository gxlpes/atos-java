package transporte;

public class Carro {
	
	public String fabricante;
	public String modelo;

		public void ligar() {
			System.out.println("Carro ligado");
		}
		
		public void desligar() {
			System.out.print("Carro desligado");
		}
		
		public void exibirDados() {
			System.out.println("Dados do carro: " + fabricante + " " + modelo);
		}
		
		public void configuraDados(String fabricanteCarro, String modeloCarro) {
			fabricante = fabricanteCarro;
			modelo = modeloCarro;
		}
		
	}

