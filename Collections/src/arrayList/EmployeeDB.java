package arrayList;
import java.util.ArrayList;
public class EmployeeDB {
		// TODO Auto-generated method stub
		    ArrayList<Employee> list = new ArrayList<>();

		    public boolean addEmployee(Employee e) {
		        return list.add(e);
		    }

		    public boolean deleteEmployee(int empId) {
		        for (Employee e : list) {
		            if (e.empId == empId) {
		                list.remove(e);
		                return true;
		            }
		        }
		        return false;
		    }

		    public String showPaySlip(int empId) {
		        for (Employee e : list) {
		            if (e.empId == empId) {
		                return "Payslip for employee ID " + empId + ": ₹" + e.salary;
		            }
		        }
		        return "Employee not found.";
		    }
		}
