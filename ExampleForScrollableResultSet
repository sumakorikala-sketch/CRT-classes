import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ExampleForScrollableResultSet {

    public static void main(String[] args) {

        String jdbcurl = "jdbc:mysql://localhost:3306/crt";
        String username = "root";
        String password = "suma1216";

        try (
            Connection c = DriverManager.getConnection(jdbcurl, username, password);
            Statement s = c.createStatement(
                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY)
        ) {

            String retrieve = "SELECT StudentId, FirstName, LastName FROM Student";
            ResultSet result = s.executeQuery(retrieve);

            // last row
            result.last();
            String lastId = result.getString("StudentId");
            String fname = result.getString("FirstName");
            String lname = result.getString("LastName");
            System.out.println("student ID : " + lastId +
                    ", First Name : " + fname +
                    ", Last Name : " + lname);

            // first row
            result.first();
            String firstId = result.getString("StudentId");
            fname = result.getString("FirstName");
            lname = result.getString("LastName");
            System.out.println("student ID : " + firstId +
                    ", First Name : " + fname +
                    ", Last Name : " + lname);

            // absolute row
            result.absolute(2);
            String absoluteId = result.getString("StudentId");
            fname = result.getString("FirstName");
            lname = result.getString("LastName");
            System.out.println("student ID : " + absoluteId +
                    ", First Name : " + fname +
                    ", Last Name : " + lname);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
