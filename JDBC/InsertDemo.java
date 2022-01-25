import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		//1. Load Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//2. Establish Connection
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java-2019", "root", "");
		
		//3. Create Statement
		
		Statement st = con.createStatement();
		
		//4. Send and execute sql query
		
		String query = "INSERT INTO students (`name`, `address`, `roll`) VALUES ('Subham', 'Malepatan', 2)";
		
		int rows = st.executeUpdate(query);
		
		System.out.println("Number of rows affected =" + rows);
		
		//5. close the connection
		con.close();
		
	}

}
