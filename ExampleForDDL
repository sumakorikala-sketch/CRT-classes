import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ExampleForDDL {

	public static void main(String[] args) {
		
		
		 String jdbcurl = "jdbc:mysql://localhost:3306/crt";
	        String username = "root";
	        String password = "suma1216";
	        
	        try(Connection c = DriverManager.getConnection(jdbcurl,username,password);
	        		Statement s = c.createStatement())
	        {
	        	String createTable = "CREATE TABLE employee(id INT PRIMARY KEY, name VARCHAR(25),email VARCHAR(50))";
	        	s.execute(createTable);
	        	System.out.println("Table created successfully");
	        	
	        	String altertable = "ALTER TABLE employee ADD COLUMN PhoneNumber VARCHAR(10)";
	        	s.execute(altertable);
	        	System.out.println("Table altered succesfully");
	        	
	        
	        	
	        }
	        catch(SQLException e) {
	        	e.printStackTrace();
	        }
	
	     


	}

}
