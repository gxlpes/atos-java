package repository;

import entity.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class LoginRepository {

    public SessionFactory sessionFactory;

    public boolean setup() {
        Configuration config = new Configuration();

        config.setProperty("hibernate.connection.driver_class", "com.mysql.jdbc.Driver");
        config.setProperty("hibernate.connection.url", "jdbc:mysql://localhost:3306/user");
        config.setProperty("hibernate.connection.username", "root");
        config.setProperty("hibernate.connection.password", "");
        config.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQLDialect");

        config.addAnnotatedClass(User.class);

        try {
            sessionFactory = config.buildSessionFactory();
            return true;
        } catch (Exception e) {
            return false;
        }

    }

    public void close() {
        sessionFactory.close();
    }

    public User findByUsernameAndPassword(String username, String password) {
        setup();
        Session session = sessionFactory.openSession();

        try {
            String query = String.format("from User where username = '%s'  and password = '%s'", username, password );
            User user = session.createQuery(query, User.class).getSingleResult();

            session.close();
            return user;
        } catch (Exception e) {
            return null;
        }
    }
}


