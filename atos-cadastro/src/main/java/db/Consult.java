package db;

import log.Log;

import javax.persistence.*;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;


public class Consult {

    public static List<Aluno> all(Log logger) {

        java.util.logging.Logger.getLogger("org.hibernate").setLevel(Level.OFF);

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("atos_cadastro"); // instancia o entity manager com config do persistence.xml
        EntityManager em = emf.createEntityManager(); // contexto de persistência e conexão com o banco

        String jpql = "select u from db.Aluno u";
        TypedQuery<Aluno> query = em.createQuery(jpql, Aluno.class);
        query.setMaxResults(40);

        List<Aluno> alunos = query.getResultList();

        if (alunos.isEmpty()) {
            System.out.println("Banco de dados vazio. Impossível realizar operação no momento.");

            logger.logger.setLevel(Level.WARNING);
            logger.logger.warning("Tentativa de consulta ao banco de dados que estava vazio");

            return alunos;
        } else {
            for (Aluno aluno : alunos) {
                System.out.println("ID: " + aluno.getId() + " | " + "CPF: " + aluno.getCpf() + " | " + "Nome: " + aluno.getNome() + " | " + "Email: " + aluno.getEmail() + " | " + "Estado: " + aluno.getEstado() + " | " + "Cidade: " + aluno.getCidade() + " | " + "Ano: " + aluno.getAno() + " | " + "Semestre: " + aluno.getSemestre());
            }

            em.close();
            emf.close();

        }

        return alunos;
    }
}
