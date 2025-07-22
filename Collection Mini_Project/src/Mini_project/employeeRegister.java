package Mini_project;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class employeeRegister {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		List<employeeDetails> list = new ArrayList<>();
		System.out.println("Enter the number of employees: ");
		int n = sc.nextInt();
		sc.nextLine();
		for (int i = 1; i <= n; i++) {
			System.out.println("Enter Employee " + i + " Details:");

			System.out.print("Enter the Firstname: ");
			String firstName = sc.nextLine();

			System.out.print("Enter the Lastname: ");
			String lastName = sc.nextLine();

			System.out.print("Enter the Mobile: ");
			String mobile = sc.nextLine();

			System.out.print("Enter the Email: ");
			String email = sc.nextLine();

			System.out.print("Enter the Address: ");
			String address = sc.nextLine();

			list.add(new employeeDetails(firstName, lastName, mobile, email, address));
		}
		Collections.sort(list);

		System.out.println("\nEmployee List:");
		System.out.format("%-15s %-15s %-15s %-30s %-15s\n", "Firstname", "Lastname", "Mobile", "Email", "Address");

		for (employeeDetails emp : list) {
			System.out.format("%-15s %-15s %-15s %-30s %-15s\n", emp.getFirstName(), emp.getLastName(), emp.getMobile(),
					emp.getEmail(), emp.getAddress());
		}
	}

}

class employeeDetails implements Comparable<employeeDetails> {
	private String firstName;
	private String lastName;
	private String mobile;
	private String email;
	private String address;

	public employeeDetails(String firstName, String lastName, String mobile, String email, String address) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.mobile = mobile;
		this.email = email;
		this.address = address;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getMobile() {
		return mobile;
	}

	public String getEmail() {
		return email;
	}

	public String getAddress() {
		return address;
	}

	@Override
	public int compareTo(employeeDetails obj) {
		return this.firstName.compareToIgnoreCase(obj.firstName);
	}

}