package db;

import log.Log;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import java.util.Scanner;
import java.util.logging.Level;

public class Insert {

    public static void novoAluno(Log logger, Scanner read) {
        java.util.logging.Logger.getLogger("org.hibernate").setLevel(Level.OFF);

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("atos_cadastro");
        EntityManager em = emf.createEntityManager();

        String dec;
        do {
            System.out.println("Digite o CPF");
            String cpf = read.nextLine();
            System.out.println("Digite o nome completo");
            String nome = read.nextLine();
            System.out.println("Digite o email");
            String email = read.nextLine();
            System.out.println("Digite o estado");
            String estado = read.nextLine().toUpperCase();
            System.out.println("Digite a cidade");
            String cidade = read.nextLine();
            System.out.println("Digite o ano");
            Integer ano = read.nextInt();
            System.out.println("Digite o semestre");
            Integer semestre = read.nextInt();

            Aluno student = new Aluno(null, cpf, nome, email, estado, cidade, ano, semestre);

            em.getTransaction().begin();
            em.persist(student);
            em.getTransaction().commit();

            logger.logger.setLevel(Level.INFO);
            logger.logger.info("Novo aluno inserido no banco de dados, nome " + nome + "e ID " + student.getId());

            System.out.println("Você deseja continuar?");
            read.nextLine();
            dec = read.nextLine();

        } while (dec.equalsIgnoreCase("sim"));

        System.out.println("Implementação realizada com sucesso!");

        em.close();
        emf.close();

    }
}