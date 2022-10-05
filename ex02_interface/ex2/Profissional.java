package ex02_interface.ex2;

public class Profissional extends Compromisso implements IProfissional {
    

    @Override
    public void exibeCompromissoProfissional(String nomeCompromisso, String dataCompromisso, int horaCompromisso) {
        System.out.println(nomeCompromisso + " " + dataCompromisso + " " + horaCompromisso);
    }
}
