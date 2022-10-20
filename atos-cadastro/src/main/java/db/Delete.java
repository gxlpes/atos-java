package db;

import log.Log;
import org.hibernate.Session;
import org.hibernate.Transaction;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import javax.transaction.Transactional;

import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;

public class Delete {


    public static void aluno(Log logger, Scanner read) {
        java.util.logging.Logger.getLogger("org.hibernate").setLevel(Level.OFF);

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("atos_cadastro"); // instancia o entity manager com config do persistence.xml
        EntityManager em = emf.createEntityManager(); // contexto de persistência e conexão com o banco

        List<Aluno> alunos = Consult.all(logger);

        if (!alunos.isEmpty()) {
            System.out.println("Qual aluno você deseja excluir do cadastro? Digite o seu ID");
            int aluno1 = Integer.parseInt(read.nextLine());
            System.out.println("Você tem certeza que deseja excluir o aluno com ID " + aluno1 + "?");
            System.out.println("Digite o ID novamente para confirmar a sua escolha");
            int aluno2 = Integer.parseInt(read.nextLine());


            if (aluno1 == aluno2) {
                Aluno p = em.find(Aluno.class, aluno1);
                em.getTransaction().begin();
                em.remove(p);
                em.getTransaction().commit();
                System.out.println("Aluno deletado do sistema de cadastro");
            } else {
                System.out.println("IDs não coincidem, tente novamente");
            }
        }
    }

    @Transactional
    public static void truncate() {
        java.util.logging.Logger.getLogger("org.hibernate").setLevel(Level.OFF);

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("atos_cadastro");
        EntityManager em = emf.createEntityManager();

        Session session = (Session) em.getDelegate();
        Transaction transaction = session.getTransaction();

        transaction.begin();
        session.createSQLQuery("TRUNCATE  Aluno").executeUpdate();
        System.out.println("Tabela  deletada do sistema de cadastro");

        transaction.commit();
        session.close();
    }
}

