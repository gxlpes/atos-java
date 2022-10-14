package org.example;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class App {
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa(null, "Carlos da Silva", "carlos@gmail.com"); // id da pessoa é null já que o BD vai incrementar os IDs
        Pessoa p2 = new Pessoa(null, "Roberto da Silva", "roberto@gmail.com");
        Pessoa p3 = new Pessoa(null, "Yasmin da Silva", "yasmin@gmail.com");

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("agenda-jpa"); // instancia o entity manager com config do persistence.xml
        EntityManager em = emf.createEntityManager(); // contexto de persistência e conexão com o banco

        em.getTransaction().begin(); // começo da transação

        em.persist(p1); // método persist que vai salvar o conteúdo dentro do banco de dados
        em.persist(p2);
        em.persist(p3);

        em.getTransaction().commit(); // commit da transação

        System.out.println("Implementação realizada com sucesso!");
    }
}
