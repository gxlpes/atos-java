package com.principal;

import com.jpaMapeamento1.Department;
import com.jpaMapeamento1.Employee;
import com.jpaMapeamento1.Log;


import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;



public class ManyToOne {

    public static void main( String[ ] args ) throws IOException
    {

        //LOGGER
        Log meuLogger = new Log("Log.txt");
        try {
            //Log meuLogger = new Log("Log.txt");
            meuLogger.logger.setLevel(Level.FINE);
            meuLogger.logger.info("Log de informação");
            meuLogger.logger.warning("Log de Aviso");
            meuLogger.logger.severe("Log Severo");


        } catch (Exception e) {
            meuLogger.logger.info("Exception:" + e.getMessage()); //escrever no arquivo de log o erro
            e.printStackTrace();//escrever no console o erro

        }


        EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "jpaMapeamento_n_1" ); //criar o gerenciador da fábrica de entidades
        EntityManager entitymanager = emfactory.createEntityManager( ); //criar uma entidade
        meuLogger.logger.info("\nA entidade manager factory jpaMapeamento_n_1 foi criada!!");//escrever no log

        entitymanager.getTransaction( ).begin( ); //abrir um conexão para o bd com a entidade criada

        //Criando a entidade departamento
        Department department = new Department();
        department.setId(1); //setar o nome do departamento desenvolvedor
        department.setName("Development"); //setar o nome do departamento desenvolvedor
        //Store Department
        entitymanager.persist(department); //salvar o departamento do bd

        //Criando a entidade departamento
        Department department2 = new Department();
        department2.setId(2); //setar o nome do departamento desenvolvedor
        department2.setName("Support"); //setar o nome do departamento desenvolvedor
        //Store Department
        entitymanager.persist(department2); //salvar o departamento do bd

        //Criando a entidade do empregado 1
        Employee employee1 = new Employee();
        employee1.setEname("Satish");
        employee1.setSalary(45000.0);
        employee1.setDeg("Technical Writer");

        //Criando a entidade do empregado 2
        Employee employee2 = new Employee();
        employee2.setEname("Krishna");
        employee2.setSalary(45000.0);
        employee2.setDeg("Technical Writer");

        //Criando a entidade do empregado 3
        Employee employee3 = new Employee();
        employee3.setEname("Masthanvali");
        employee3.setSalary(50000.0);
        employee3.setDeg("Technical Writer");

        //Armazenando no bd os empregados 1,2 e 3
        entitymanager.persist(employee1);
        entitymanager.persist(employee2);
        entitymanager.persist(employee3);

        entitymanager.getTransaction().commit();//fechar a conexão com o bd
        entitymanager.close(); //Encerrar o gerenciador da entidade
        emfactory.close(); //fechar a fábrica de entidades
    }
}