package ex02_interface.ex2;

public class Principal {
    public static void main (String[] args) {
        Profissional cp1 = new Profissional();
        cp1.exibeCompromissoProfissional("Acordar", "06/10/2000", 6);

        Pessoal cp2 = new Pessoal();
        cp2.exibeCompromissoPessoal("Lavar o carro", "05/10/2022", 10);
    }
}
