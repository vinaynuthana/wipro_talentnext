package callableStatements;

import java.sql.*;

public class Q1 {

	public static void main(String[] args) {
		String url = "your url";
		String username = "your username";
		String password = "your password";
		try {
			Connection con = DriverManager.getConnection(url,username,password);
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from emp");
			CallableStatement cs = con.prepareCall("{call calc_netsalary(?,?,?)}");
			while(rs.next()) {
				int empno = rs.getInt("empno");
				cs.setInt(1, empno);
				cs.registerOutParameter(2, Types.VARCHAR);
				cs.registerOutParameter(3,  Types.DOUBLE);
				cs.execute();
				String ename = cs.getString(2);
				double netSalary = cs.getDouble(3);
				System.out.println("Emp No: " + empno + ", EName: " + ename + ", Net Salary: " + netSalary);
			}
			rs.close();
			stmt.close();
			con.close();
		}catch(Exception e) {
			System.out.println("Exception: " + e.getMessage());
		}

	}

}