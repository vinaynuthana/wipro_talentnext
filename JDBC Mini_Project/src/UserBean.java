
public class UserBean {
	private String id;
	private String password;
	private String name;
	private int incorrectAttempts;
	private int lockstatus;
	private String userType;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getIncorrectAttempts() {
		return incorrectAttempts;
	}

	public void setIncorrectAttempts(int incorrectAttempts) {
		this.incorrectAttempts = incorrectAttempts;
	}

	public int getLockstatus() {
		return lockstatus;
	}

	public void setLockstatus(int lockstatus) {
		this.lockstatus = lockstatus;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

}