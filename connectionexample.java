import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;

public class ConnectionExample {

    public static void main(String[] args) {

        String jdbcurl = "jdbc:mysql://localhost:3306/crt";
        String username = "root";
        String password = "suma1216";

        try {
            Connection c = DriverManager.getConnection(jdbcurl, username, password);
            Statement s = c.createStatement();

            String createTable =
                "CREATE TABLE user2 (id INT PRIMARY KEY, name VARCHAR(255) NOT NULL)";
            s.execute(createTable);

            System.out.println("Table created successfully");

            s.close();
            c.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
