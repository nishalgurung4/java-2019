import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ReadDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		// 1. Load Driver
		Class.forName("com.mysql.cj.jdbc.Driver");

		// 2. Establish Connection
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java-2019", "root", "");

		// 3. Create Statement

		Statement st = con.createStatement();

		// 4. Send and execute sql query

		String query = "SELECT * from students";
		
		ResultSet rs = st.executeQuery(query);
		
		while(rs.next())
		{
			System.out.println("ID = " + rs.getInt(1));
			System.out.println("Name = " + rs.getString(2));
			System.out.println("Address = " + rs.getString(3));
			System.out.println("Roll = " + rs.getInt(4));
			System.out.println("=====================");
		}

		// 5. close the connection
		con.close();
	}

}
