import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ExampleForDML {

    public static void main(String[] args) {

        String jdbcurl = "jdbc:mysql://localhost:3306/crt";
        String username = "root";
        String password = "suma1216";

        try (Connection c = DriverManager.getConnection(jdbcurl, username, password);
             Statement s = c.createStatement()) {

            /*String insertQuery =
                "INSERT INTO employee VALUES (1, 'Bhavana', 'bhavana@gmail.com', '9876543210')";

            s.executeUpdate(insertQuery);
            System.out.println("Record inserted successfully");*/
        	String updateQuery =
                    "UPDATE employee SET name = 'honey' WHERE id = 1";

                s.executeUpdate(updateQuery);
                System.out.println("Name updated successfully");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
