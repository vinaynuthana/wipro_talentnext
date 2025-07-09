package emp_details;

public class TestEmployee {
	    public static void main(String[] args) {
	        // Create Employee object
	        Employee emp = new Employee("Alice", 60000.0, 2018, "NI987654");

	        // Print details
	        System.out.println("Name: " + emp.getName());
	        System.out.println("Annual Salary: " + emp.getAnnualSalary());
	        System.out.println("Year Started: " + emp.getYearStarted());
	        System.out.println("National Insurance Number: " + emp.getNationalInsuranceNumber());

	        // Update details
	        emp.setName("Alice Smith");
	        emp.setAnnualSalary(65000.0);
	        emp.setYearStarted(2017);
	        emp.setNationalInsuranceNumber("NI123456");

	        // Print updated details
	        System.out.println("\nUpdated Employee Details:");
	        System.out.println("Name: " + emp.getName());
	        System.out.println("Annual Salary: " + emp.getAnnualSalary());
	        System.out.println("Year Started: " + emp.getYearStarted());
	        System.out.println("National Insurance Number: " + emp.getNationalInsuranceNumber());
	    }
	}


