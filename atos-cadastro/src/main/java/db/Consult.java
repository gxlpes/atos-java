package db;

import javax.persistence.*;
import java.util.List;
import java.util.logging.Level;


public class Consult {

    public static void all() {

            java.util.logging.Logger.getLogger("org.hibernate").setLevel(Level.OFF);
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("atos_cadastro"); // instancia o entity manager com config do persistence.xml
            EntityManager em = emf.createEntityManager(); // contexto de persistência e conexão com o banco

            String jpql = "select u from db.Aluno u";
            TypedQuery<Aluno> query = em.createQuery(jpql, Aluno.class);
            query.setMaxResults(40);

            List<Aluno> alunos = query.getResultList();

            for (Aluno aluno : alunos) {
                System.out.println("ID: " + aluno.getId() + " | " + "CPF: " + aluno.getCpf() + " | " + "Nome: " + aluno.getNome() + " | " + "Email: " + aluno.getEmail() + " | " + "Estado: " + aluno.getEstado() + " | " + "Cidade: " + aluno.getCidade() + " | " + "Ano: " + aluno.getAno() + " | " + "Semestre: " + aluno.getSemestre());
            }

            em.close();
            emf.close();



    }


}
