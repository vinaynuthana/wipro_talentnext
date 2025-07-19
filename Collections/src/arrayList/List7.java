package arrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

class Employee {
    int empId;
    String empName;
    String email;
    String gender;
    float salary;

    Employee(int empId, String empName, String email, String gender, float salary) {
        this.empId = empId;
        this.empName = empName;
        this.email = email;
        this.gender = gender;
        this.salary = salary;
    }

    public void getEmployeeDetails() {
        System.out.println("\tDetails\t");
        System.out.println("Employee id : " + empId);
        System.out.println("Employee Name : " + empName);
        System.out.println("Employee Email : " + email);
        System.out.println("Employee Gender : " + gender);
        System.out.println("Employee Salary : " + salary);
    }

}

public class List7 {
    public static void main(String[] args) {
        Vector<Employee> employees = new Vector<>();

        // Adding some employee objects to the vector
        employees.add(new Employee(1, "Vinay", "vinay@example.com", "Male", 50000));
        employees.add(new Employee(2, "Sukumar", "sukumar@example.com", "male", 60000));

        System.out.println("Listing employees using Enumeration:");
        Enumeration<Employee> enumeration = employees.elements();
        while (enumeration.hasMoreElements()) {
            Employee employee = enumeration.nextElement();
            System.out.println(employee.empId + " " + employee.empName + " " + employee.email + " " + employee.gender + " " + employee.salary);
        }

        System.out.println("\nListing employees using Iterator:");
        Iterator<Employee> iterator = employees.iterator();
        while (iterator.hasNext()) {
            Employee employee = iterator.next();
            System.out.println(employee.empId + " " + employee.empName + " " + employee.email + " " + employee.gender + " " + employee.salary);
        }
    }
}