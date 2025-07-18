package arrayList;

public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        // Create EmployeeDB instance
		        EmployeeDB db = new EmployeeDB();

		        // Create Employee objects
		        Employee emp1 = new Employee(101, "Vinay", "vinay@company.com", "Male", 50000f);
		        Employee emp2 = new Employee(102, "Anjali", "anjali@company.com", "Female", 60000f);
		        Employee emp3 = new Employee(103, "Ravi", "ravi@company.com", "Male", 55000f);

		        // Add employees to database
		        db.addEmployee(emp1);
		        db.addEmployee(emp2);
		        db.addEmployee(emp3);

		        // Print employee details
		        System.out.println("== Employee Details ==");
		        emp1.GetEmployeeDetails();
		        System.out.println();
		        emp2.GetEmployeeDetails();
		        System.out.println();
		        emp3.GetEmployeeDetails();

		        // Show payslip
		        System.out.println("\n== Payslips ==");
		        System.out.println(db.showPaySlip(101));
		        System.out.println(db.showPaySlip(102));
		        System.out.println(db.showPaySlip(999)); // invalid ID

		        // Delete employee
		        System.out.println("\n== Deleting Employee ID 102 ==");
		        if (db.deleteEmployee(102)) {
		            System.out.println("Employee with ID 102 deleted successfully.");
		        } else {
		            System.out.println("Employee not found.");
		        }

		        // Try to show payslip after deletion
		        System.out.println(db.showPaySlip(102));
		    }
		}
