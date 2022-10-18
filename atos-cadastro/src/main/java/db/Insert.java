package db;

import principal.App;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;

public class Insert {
    static String dec;


    public static void novoAluno() throws IOException {
        java.util.logging.Logger.getLogger("org.hibernate").setLevel(Level.OFF);
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("atos_cadastro");
        EntityManager em = emf.createEntityManager();
        Scanner read = new Scanner(System.in);

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


            System.out.println("Você deseja continuar?");
            dec = read.nextLine();

        } while (dec.equals("sim") || dec.equals("Sim"));

        System.out.println("Implementação realizada com sucesso!");

        em.close();
        emf.close();
        read.close();
    }
}