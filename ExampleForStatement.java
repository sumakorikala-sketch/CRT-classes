import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ExampleForStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				String jdbcurl = "jdbc:mysql://localhost:3306/crt";
		        String username = "root";
		        String password = "suma1216";
		        try {
		        	Connection c = DriverManager.getConnection(jdbcurl, username, password);
		        	Statement s=c.createStatement();
		        	/*String createTable="CREATE TABLE user2(id INT primary key,name VARCHAR(255) NOT NULL)";
		        	s.execute(createTable);
		        	System.out.println("Table created successfully");
		        	String insertData="INSERT INTO user1(id,name) values(1,'Navya'),(2,'Anupama')";
		        	int rowsAffected=s.executeUpdate(insertData);
		        	System.out.println(rowsAffected + "records inserted successfully");
		        	String retrieveData="SELECT * FROM user2";
		        	s.executeQuery(retrieveData);*/
		        	String retrieve="SELECT firstname,lastname,email FROM student";
		        	ResultSet result=s.executeQuery(retrieve);
		        	while(result.next())
		        	{
		        		String firstName=result.getString("firstName");
		        		String lastName=result.getString("lastName");
		        		String email=result.getString("email");
		        		System.out.println("First Name: "+firstName+",Last Name :" +lastName+",Email :"+email);
		        		
		        				
		        				
		        	}
		        	s.close();
		        	c.close();
		        	
		        }
		        catch(SQLException e)
		        {
		        	e.printStackTrace();
		        }


	}

}
