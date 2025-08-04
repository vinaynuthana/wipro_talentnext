package executingQuery_ProcessingResults;
import java.sql.*;
public class Q3 {

	public static void main(String[] args) {
		String url = "your url";
		String username = "your username";
		String password = "your password";
		try {
			Connection con = DriverManager.getConnection(url,username,password);
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select ename,job,sal,comm from emp where sal > 1000 and sal < 2000");
			while(rs.next()) {
				String name = rs.getString("ename");
				String job = rs.getString("job");
				Double sal = rs.getDouble("sal");
				Double comm = rs.getObject("comm") != null ? rs.getDouble("comm"): null; 
				System.out.println("Emp Name: " + name + " Job: " + job + " Salary: " + sal + " Commission: " + (comm != null?comm:"Null"));
			}
			rs.close();
			stmt.close();
			con.close();
			
		}catch(Exception e) {
			System.out.println("Exception: " + e.getMessage());
		}

	}

}