import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ExampleForCallableStatement {

	public static void main(String[] args) {
		
		
		String jdbcurl = "jdbc:mysql://localhost:3306/crt";
        String username = "root";
        String password = "suma1216";
        
        String studentid = "S101";
        String callProcedure = "{CALL getCreditObtained(?)}";
        
        try(Connection c = DriverManager.getConnection(jdbcurl, username, password);
        		CallableStatement cs = c.prepareCall(callProcedure))
        {
        	cs.setString(1, studentid);
        	ResultSet result = cs.executeQuery();
        	
        	while(result.next())
        	{
        		String id = result.getString("studentid");
        		String email = result.getString("email");

        		
        		System.out.println("ID : " + id +", Email : "+email);
        				
        	}
        	
        }
        catch (SQLException e) {
            e.printStackTrace();
        }        
        

		

	}

}
