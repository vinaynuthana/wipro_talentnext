package arrayList;
public class Employee{
	int empId;
	String empName;
    String email;
    String gender;
    float salary;

    	public Employee(int empId, String empName, String email, String gender, float salary) {
    		this.empId = empId;
    		this.empName = empName;
    		this.email = email;
    		this.gender = gender;
    		this.salary = salary;
    	}

	void GetEmployeeDetails() {
		// TODO Auto-generated method stub
		System.out.println("Employee ID: " + empId);
        System.out.println("Name: " + empName);
        System.out.println("Email: " + email);
        System.out.println("Gender: " + gender);
        System.out.println("Salary: ₹" + salary);
	}

}