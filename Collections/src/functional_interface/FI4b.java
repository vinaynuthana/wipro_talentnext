package functional_interface;

public class FI4b {
	private int id;
	private String name;
	private int salary;

	public FI4b(int id, String name, int salary) {
		this.setId(id);
		this.setName(name);
		this.setSalary(salary);
	}

	public int getSalary() {
		return this.salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}