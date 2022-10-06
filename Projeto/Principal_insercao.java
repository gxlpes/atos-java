package Projeto;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Principal_insercao {

	public static void main(String[] args) {

		final String db_url = "jdbc:mysql://localhost:3306/reuniao";
		final String db_query = "INSERT INTO pessoa (nome, email, cargo) values ('Aberto Santos', 'santos@yahoo.com', 'Professor')";
		final String db_user = "root";
		final String db_password = "";
		
		System.out.println("Iniciando conexão ao DB");
		
		try {
            Connection c = DriverManager.getConnection(db_url, db_user, db_password);
			System.out.println("Conectado ao MySQL");
            Statement statement = c.createStatement(); // config de acesso aos cursores
            int linhas = statement.executeUpdate(db_query);
            System.out.println("A query afetou " + linhas);
	} catch (SQLException sqlException) {
		sqlException.printStackTrace();
	}
}
}