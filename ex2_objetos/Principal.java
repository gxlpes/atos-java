
public class Principal {

	public static void main(String[] args) {

		Pessoa p = new Pessoa(); // criando um objeto tipo pessoa, fazendo uma instância
		p.idade = 13; // consigo pegar porque é publico
		System.out.println("O nome é: " + p.nome);
		System.out.println("A idade é: " + p.idade);

		
	}

}
