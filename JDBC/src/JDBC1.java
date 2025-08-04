import java.sql.*;
public class JDBC1 {
	

		public static void main(String[] args) {
			String url = "your url";
			String username = "your username";
			String password = "your password";
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection con = DriverManager.getConnection(url,username,password);
				System.out.println("Connection established succesfully.");
				con.close();
			}catch(Exception e) {
				System.out.println("Connection could not established");
				System.out.println("Exception: " + e.getMessage());
			}


		}

	
}
