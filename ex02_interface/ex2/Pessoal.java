package ex02_interface.ex2;

public class Pessoal extends Compromisso implements IPessoal {
    

    @Override
    public void exibeCompromissoPessoal(String nomeCompromisso, String dataCompromisso, int horaCompromisso) {
        System.out.println(nomeCompromisso + " " + dataCompromisso + " " + horaCompromisso);
    }
}
