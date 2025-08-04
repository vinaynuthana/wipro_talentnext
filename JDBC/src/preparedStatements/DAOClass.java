package preparedStatements;

import java.sql.*;

public class DAOClass {
	Connection con;

	public DAOClass() throws SQLException {
		String url = "your url";
		String username = "your username";
		String password = "your password";
		con = DriverManager.getConnection(url, username, password);
	}

	public void insert(int rollno, String name, String std, String dob, double fees) throws SQLException {
		String sql = "insert into students values(?,?,?,TO_DATE(?, 'DD-Mon-YYYY'),?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, rollno);
		ps.setString(2, name);
		ps.setString(3, std);
		ps.setString(4, dob);
		ps.setDouble(5, fees);
		int rows = ps.executeUpdate();
		System.out.println(rows + " students records inserted.");
		ps.close();
	}

	public void delete(int rollno) throws SQLException {
		String sql = "insert into studentsLog (rollno, studentname, standard, leaving_date) "
				+ "select rollno, studentname, standard, sysdate from students where rollno = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, rollno);
		ps.executeUpdate();

		String deleteSQL = "delete from students where rollno = ?";
		PreparedStatement ps1 = con.prepareStatement(deleteSQL);
		ps1.setInt(1, rollno);
		int rows = ps1.executeUpdate();
		System.out.println(rows + " student record deleted.");
		ps.close();
		ps1.close();
	}

	public void modify(int rollno, double newFees) throws Exception {
		String sql = "update students set fees = ? where rollno = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setDouble(1, newFees);
		ps.setInt(2, rollno);
		int rows = ps.executeUpdate();
		System.out.println(rows + " student record updated");
		ps.close();
	}

	public void display() throws SQLException {
		String sql = "select * from students";
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		while (rs.next()) {
			printRow(rs);
		}
		stmt.close();
		rs.close();
	}

	public void display(int rollno) throws SQLException {
		String sql = "select * from students where rollno = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, rollno);
		ResultSet rs = ps.executeQuery();
		if (rs.next()) {
			printRow(rs);
		} else {
			System.out.println("Student with rollno: " + rollno + " not found");
		}
		ps.close();
		rs.close();

	}

	public void printRow(ResultSet rs) throws SQLException {
		int rollno = rs.getInt("rollno");
		String name = rs.getString("studentname");
		String std = rs.getString("standard");
		Date dob = rs.getDate("date_of_birth");
		double fees = rs.getDouble("fees");

		System.out.println(
				"RollNo: " + rollno + ", Name: " + name + ", Std: " + std + ", DOB: " + dob + ", Fees: " + fees);
	}
}