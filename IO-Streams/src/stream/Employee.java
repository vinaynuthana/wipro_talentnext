package stream;
import java.io.Serializable;
import java.util.Date;
public class Employee implements Serializable  {
	
	String name;
	Date dateOfBirth;
	String department;
	String designation;
	double salary;
	
	public String getName() {
		return name;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public String getDepartment() {
		return department;
	}
	public String getDesignation() {
		return designation;
	}
	public double getSalary() {
		return salary;
	}
		
	public void setName(String name) {
		this.name = name;
	}
	public void setDate(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public void setDepartment(String Department) {
		this.department = department;
	}
	public void setDesignation(String Designation) {
		this.designation = designation;
	}
	public void setSalary(double Salary) {
		this.salary = salary;
	}
	
	public Employee() {
		this.name = "name";
        this.dateOfBirth =dateOfBirth; 
        this.department = department;
        this.designation = designation;
        this.salary = salary;
	}
	public Employee(String name, Date dateOfBirth, String department, String designation, double salary) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.department = department;
        this.designation = designation;
        this.salary = salary;
    }
	
}
