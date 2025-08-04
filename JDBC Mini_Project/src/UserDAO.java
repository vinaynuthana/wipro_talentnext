
import java.util.*;
import java.sql.*;

public class UserDAO {

	public Connection getConnection() throws SQLException {
		String url = "your url";
		String username = "your username";
		String password = "your password";
		return DriverManager.getConnection(url, username, password);
	}

	public String getUserType(String userID) {
		try (Connection con = getConnection()) {
			PreparedStatement ps = con.prepareStatement("select usertype from users where userid = ? ");
			ps.setString(1, userID);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				return rs.getString("userType");
			}
		} catch (Exception e) {
			System.out.println("Exception: " + e.getMessage());
		}
		return null;
	}

	public String getIncorrectAttempts(String userID) {
		try (Connection con = getConnection()) {
			PreparedStatement ps = con.prepareStatement("select incorrectAttempts from users where userid = ? ");
			ps.setString(1, userID);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				int attempts = rs.getInt(1);
				if (attempts == 0)
					return "No Incorrect Attempts";
				else if (attempts == 1)
					return "One Time";
				else
					return "Incorrect Attempt Exceeded";
			}
		} catch (Exception e) {
			System.out.println("Exception: " + e.getMessage());
		}
		return "User Not Found";
	}

	public String changeUserType(String userID) {
		try (Connection con = getConnection()) {
			PreparedStatement ps = con.prepareStatement("update users set usertype = 'Admin' where userid = ? ");
			ps.setString(1, userID);
			int updated = ps.executeUpdate();
			return updated >= 1 ? "Update Success" : "Update Failed";
		} catch (Exception e) {
			System.out.println("Exception: " + e.getMessage());
		}
		return "Error Occured";
	}

	public int getLockStatus() {
		try (Connection con = getConnection()) {
			PreparedStatement ps = con.prepareStatement("select count(*) from users where lockstatus = 0");
			ResultSet rs = ps.executeQuery();
			if (rs.next())
				return rs.getInt(1);
		} catch (Exception e) {
			System.out.println("Exception: " + e.getMessage());
		}
		return 0;
	}

	public String changeName(String userID, String name) {
		try (Connection con = getConnection()) {
			PreparedStatement ps = con.prepareStatement("update users set name = ? where userid = ? ");
			ps.setString(1, name);
			ps.setString(2, userID);
			int rows = ps.executeUpdate();
			return rows == 1 ? "Success" : "Failed";
		} catch (Exception e) {
			System.out.println("Exception: " + e.getMessage());
		}
		return "Failed";
	}

	public String changePassword(String password) {
		try (Connection con = getConnection()) {
			PreparedStatement ps = con.prepareStatement("update users set password = ? where usertype = 'Admin' ");
			ps.setString(1, password);
			int rows = ps.executeUpdate();
			return rows >= 1 ? "Changed" : "0";
		} catch (Exception e) {
			System.out.println("Exception: " + e.getMessage());
		}
		return "0";
	}

	public String addUser_1(UserBean ub) {
		try (Connection con = getConnection()) {
			PreparedStatement ps = con.prepareStatement("insert into users values (?,?,?,?,?,?)");
			ps.setString(1, ub.getId());
			ps.setString(2, ub.getPassword());
			ps.setString(3, ub.getName());
			ps.setInt(4, ub.getIncorrectAttempts());
			ps.setInt(5, ub.getLockstatus());
			ps.setString(6, ub.getUserType());
			int rows = ps.executeUpdate();
			return rows == 1 ? "Success" : "Fail";
		} catch (Exception e) {
			System.out.println("Exception: " + e);
		}
		return "Fail";
	}

	public String addUser_2(UserBean ub) {
		if (ub.getLockstatus() != 0)
			return "Fail";
		return addUser_1(ub);
	}

	public ArrayList<UserBean> getUsers(String userType) {
		ArrayList<UserBean> list = new ArrayList<>();
		try (Connection con = getConnection()) {
			PreparedStatement ps = con.prepareStatement("select * from Users where userType = ?");
			ps.setString(1, userType);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				UserBean ub = buildUser(rs);
				list.add(ub);
			}
		} catch (Exception e) {
			System.out.println("Exception: " + e.getMessage());
		}
		return list;
	}

	public ArrayList<UserBean> storeAllRecords() {
		ArrayList<UserBean> list = new ArrayList<>();
		try (Connection con = getConnection()) {
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from users");
			while (rs.next()) {
				list.add(buildUser(rs));
			}
		} catch (Exception e) {
			System.out.println("Exception: " + e.getMessage());
			;
		}
		return list;
	}

	public String[] getNames() {
		ArrayList<String> names = new ArrayList<>();
		try (Connection con = getConnection()) {
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select name from users");
			while (rs.next()) {
				names.add(rs.getString("Name"));
			}
		} catch (Exception e) {
			System.out.println("Exception: " + e.getMessage());
		}
		return names.toArray(new String[0]);
	}

	private UserBean buildUser(ResultSet rs) throws SQLException {
		UserBean ub = new UserBean();
		ub.setId(rs.getString("UserID"));
		ub.setPassword(rs.getString("Password"));
		ub.setName(rs.getString("Name"));
		ub.setIncorrectAttempts(rs.getInt("IncorrectAttempts"));
		ub.setLockstatus(rs.getInt("LockStatus"));
		ub.setUserType(rs.getString("UserType"));
		return ub;
	}
}