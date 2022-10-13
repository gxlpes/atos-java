package client.db;

public class DBvariables {
    final private String db_url = "jdbc:mysql://localhost:3306/clientes";
    final private String db_user = "root";
    final private String db_password = "";

    public String get_db_url() {
        return this.db_url;
    }

    public String get_db_user() {
        return this.db_user;
    }

    public String get_db_password() {
        return this.db_password;
    }
}
