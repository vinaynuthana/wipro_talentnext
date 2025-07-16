package stream;
import java.io.*;
import java.util.Date;
public class TestEmployee {
	public static void main(String[] args) {
		        Employee emp = new Employee("Vinay", new Date(2000 - 1900, 4, 15), "IT", "Developer", 85000);

		        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("data"))) {
		            oos.writeObject(emp);
		            System.out.println("Object has been serialized to file: data");
		        } 
		        catch (IOException e) {
		            System.out.println("Serialization Error: " + e.getMessage());
		        }

		        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("data"))) {
		            Employee deserializedEmp = (Employee) ois.readObject();

		            System.out.println("\nDeserialized Employee Details:");
		            System.out.println("Name: " + deserializedEmp.getName());
		            System.out.println("DOB: " + deserializedEmp.getDateOfBirth());
		            System.out.println("Department: " + deserializedEmp.getDepartment());
		            System.out.println("Designation: " + deserializedEmp.getDesignation());
		            System.out.println("Salary: " + deserializedEmp.getSalary());

		        } 
		        catch (IOException | ClassNotFoundException e) {
		            System.out.println("Deserialization Error: " + e.getMessage());
		        }
		    }
		}
