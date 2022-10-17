import javax.persistence.*;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;


public class Consult {

    public static void all() throws IOException {
        Scanner read = new Scanner(System.in);
        java.util.logging.Logger.getLogger("org.hibernate").setLevel(Level.OFF);
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("atos_cadastro"); // instancia o entity manager com config do persistence.xml
        EntityManager em = emf.createEntityManager(); // contexto de persistência e conexão com o banco

        String jpql = "select u from Aluno u";
        TypedQuery<Aluno> query = em.createQuery(jpql, Aluno.class);
        query.setMaxResults(40);

        List<Aluno> alunos = query.getResultList();

        for (Aluno aluno : alunos) {
            System.out.println("ID: " + aluno.getId() + " | " + "Nome: " + aluno.getNome());
        }

        em.close();
        emf.close();

    }


}
