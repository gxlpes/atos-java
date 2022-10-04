package ex01_abstract;

public class Principal extends Pessoa {
    String nome;

    public static void main(String[] args) {
        Principal p = new Principal();
        p.atribuiNome();
        p.exibeNome();
    }

    @Override
    void atribuiNome() {
        nome = "Guilherme";
    }

    @Override
    void exibeNome() {
        System.out.println(nome);
    }
}
