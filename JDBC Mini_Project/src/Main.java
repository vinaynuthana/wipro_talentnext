
public class Main {

	public static void main(String[] args) {
		UserDAO d = new UserDAO();
		System.out.println("UserType: " + d.getUserType("AB1001"));
		System.out.println("Incorrect Attempts: " + d.getIncorrectAttempts("AB1001"));
		System.out.println("Change UserType: " + d.changeUserType("RS1003"));
		System.out.println("Unlocked Users Count: " + d.getLockStatus());
		System.out.println("Change Name: " + d.changeName("TA1002", "Prasanna"));
		System.out.println("Change Password for Admins: " + d.changePassword("admin123"));
		UserBean newUser = new UserBean();
		newUser.setId("XY2001");
		newUser.setPassword("XY2001");
		newUser.setName("Nikhil");
		newUser.setIncorrectAttempts(0);
		newUser.setLockstatus(0);
		newUser.setUserType("Employee");
		System.out.println("Add User_1: " + d.addUser_1(newUser));
		System.out.println("Add User_2: " + d.addUser_2(newUser));
		for (UserBean ub : d.getUsers("Employee")) {
			System.out.println("Users: " + ub.getName());
		}
		for (UserBean u : d.storeAllRecords()) {
			System.out.println("All User: " + u.getName());
		}
		String[] names = d.getNames();
		for (String name : names) {
			System.out.println("Name: " + name);
		}
	}

}