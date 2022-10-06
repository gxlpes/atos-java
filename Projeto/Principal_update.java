package Projeto;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Principal_update {

	public static void main(String[] args) {

		final String db_url = "jdbc:mysql://localhost:3306/reuniao";
		final String db_query = "UPDATE pessoa SET nome='Paulo Henrique', email='paulo.henrique@globo.com', cargo='Aluno' WHERE nome='Aberto Santos'"; // mudança para inserção no db
		final String db_user = "root";
		final String db_password = "";
		
		System.out.println("Iniciando conexão ao DB");
		
		try {
            Connection c = DriverManager.getConnection(db_url, db_user, db_password);
			System.out.println("Conectado ao MySQL");
            Statement statement = c.createStatement(); // config de acesso aos cursores
            int linhas = statement.executeUpdate(db_query);
            System.out.println("A query afetou " + linhas);
            statement.close();
            c.close();
	} catch (SQLException sqlException) {
		sqlException.printStackTrace();
	}
}
}