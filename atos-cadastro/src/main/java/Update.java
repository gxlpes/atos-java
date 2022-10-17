import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;

public class Update {
    static String decis;
    static int countCampo;

    public static void aluno() throws IOException {
        java.util.logging.Logger.getLogger("org.hibernate").setLevel(Level.OFF);

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("atos_cadastro"); // instancia o entity manager com config do persistence.xml
        EntityManager em = emf.createEntityManager(); // contexto de persistência e conexão com o banco
        Scanner read = new Scanner(System.in);

        Consult.all();

        System.out.println("Digite o ID que você deseja alterar os atributos");
        int alunoId = read.nextInt();
        Aluno aluno = em.find(Aluno.class, alunoId);

        System.out.println("Qual campo você deseja alterar?");
        System.out.println("1) CPF \n2) Nome \n3) Email \n4) Estado \n5) Cidade");
        int campo = read.nextInt();

        switch (campo) {
            case 1:
                System.out.println("Digite o novo CPF: ");
                String cpf = read.next();
                aluno.setCpf(cpf);
                System.out.println("Campo alterado");
                System.out.println("Você deseja alterar outro campo?");
                decis = read.next();
                countCampo++;

                if (decis.equalsIgnoreCase("sim")) {
                    aluno();
                } else {
                    App.padrao();
                }
                break;
            case 2:
                System.out.println("Digite o novo nome: ");
                String nome = read.next();
                aluno.setNome(nome);
                System.out.println("Campo alterado");
                System.out.println("Você deseja alterar outro campo?");
                decis = read.next();
                countCampo++;

                if (decis.equalsIgnoreCase("sim")) {
                    aluno();
                } else {
                    App.padrao();
                }
                break;
            case 3:
                System.out.println("Digite o novo email: ");
                String email = read.next();
                aluno.setEmail(email);
                System.out.println("Campo alterado");
                System.out.println("Você deseja alterar outro campo?");
                decis = read.next();
                countCampo++;

                if (decis.equalsIgnoreCase("sim")) {
                    aluno();
                } else {
                    App.padrao();
                }
                break;
            case 4:
                System.out.println("Digite o novo estado: ");
                String estado = read.next();
                aluno.setEstado(estado);
                System.out.println("Campo alterado");
                System.out.println("Você deseja alterar outro campo?");
                decis = read.next();
                countCampo++;

                if (decis.equalsIgnoreCase("sim")) {
                    aluno();
                } else {
                    App.padrao();
                }
                break;
            case 5:
                System.out.println("Digite a nova cidade: ");
                String cidade = read.next();
                aluno.setCidade(cidade);
                System.out.println("Campo alterado");
                System.out.println("Você deseja alterar outro campo?");
                decis = read.next();
                countCampo++;

                if (decis.equalsIgnoreCase("sim")) {
                    aluno();
                } else {
                    em.getTransaction().begin();
                    em.merge(aluno);
                    em.getTransaction().commit();
                    System.out.println("Total de " + countCampo + " alterados");
                    em.close();
                    emf.close();
                    App.padrao();
                }
                break;
        }


    }
}
