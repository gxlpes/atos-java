package db;

import log.Log;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;

public class Update {
    static int countCampo;

    public static void aluno(Log logger, Scanner read) {
        java.util.logging.Logger.getLogger("org.hibernate").setLevel(Level.OFF);

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("atos_cadastro"); // instancia o entity manager com config do persistence.xml
        EntityManager em = emf.createEntityManager(); // contexto de persistência e conexão com o banco

        List<Aluno> alunos = Consult.all(logger);

        if (!alunos.isEmpty()) {
            System.out.println("Digite o ID que você deseja alterar os atributos");
            int alunoId = Integer.parseInt(read.nextLine());
            Aluno aluno = em.find(Aluno.class, alunoId);

            System.out.println("Qual campo você deseja alterar?");
            System.out.println("1) CPF \n2) Nome \n3) Email \n4) Estado \n5) Cidade");
            int campo = Integer.parseInt(read.nextLine());


            switch (campo) {
                case 1:
                    System.out.println("Digite o novo CPF: ");
                    String cpf = read.next();
                    aluno.setCpf(cpf);
                    System.out.println("Campo alterado");
                    logger.logger.finest("CPF alterado " + aluno.getNome());
                    countCampo++;
                    break;
                case 2:
                    System.out.println("Digite o novo nome: ");
                    String nome = read.nextLine();
                    aluno.setNome(nome);
                    System.out.println("Campo alterado");
                    logger.logger.finest("Nome alterado " + aluno.getNome());
                    countCampo++;
                    break;
                case 3:
                    System.out.println("Digite o novo email: ");
                    String email = read.next();
                    aluno.setEmail(email);
                    System.out.println("Campo alterado");
                    logger.logger.finest("Email alterado " + aluno.getNome());
                    countCampo++;
                    break;
                case 4:
                    System.out.println("Digite o novo estado: ");
                    String estado = read.next();
                    aluno.setEstado(estado);
                    System.out.println("Campo alterado");
                    logger.logger.finest("Estado alterado " + aluno.getNome());
                    countCampo++;
                    break;
                case 5:
                    System.out.println("Digite a nova cidade: ");
                    String cidade = read.nextLine();
                    aluno.setCidade(cidade);
                    System.out.println("Campo alterado");
                    logger.logger.finest("Cidade alterada " + aluno.getNome());
                    countCampo++;
                    break;
                case 6:
                    System.out.println("Digite o novo ano: ");
                    Integer ano = read.nextInt();
                    aluno.setAno(ano);
                    System.out.println("Campo alterado");
                    logger.logger.finest("Ano alterado do aluno " + aluno.getNome());
                    countCampo++;
                    break;
                case 7:
                    System.out.println("Digite o novo semestre: ");
                    Integer semestre = read.nextInt();
                    aluno.setSemestre(semestre);
                    System.out.println("Campo alterado");
                    logger.logger.finest("Semestre alterado do aluno " + aluno.getNome());
                    countCampo++;
                    break;
            }

            System.out.println("Você deseja alterar outro campo?");
            String decis = read.nextLine();

            if (decis.equalsIgnoreCase("sim")) {
                countCampo = 0;

                em.getTransaction().begin();
                em.merge(aluno);
                em.getTransaction().commit();

                aluno(logger, read);

            } else {
                em.getTransaction().begin();
                em.merge(aluno);
                em.getTransaction().commit();

                System.out.println("Total de " + countCampo + " campo(s) alterados");
                countCampo = 0;

                em.close();
                emf.close();
            }
        }
    }


}
