import java.io.*;
import java.util.*;

class Employee {
    int id;
    String name;
    int age;
    double salary;

    public Employee(int id, String name, int age, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + age + " " + salary;
    }
}

public class EmployeeManagementSystem {
    static final String FILE_NAME = "employees.txt";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Main Menu");
            System.out.println("1. Add an Employee");
            System.out.println("2. Display All");
            System.out.println("3. Exit");
            choice = scanner.nextInt();
            scanner.nextLine(); // consume leftover newline

            switch (choice) {
                case 1:
                    addEmployee(scanner);
                    break;
                case 2:
                    displayAllEmployees();
                    break;
                case 3:
                    System.out.println("Exiting application...");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 3);

        scanner.close();
    }

    public static void addEmployee(Scanner scanner) {
        try {
            System.out.print("Enter Employee ID: ");
            int id = scanner.nextInt();
            scanner.nextLine(); // consume newline

            System.out.print("Enter Employee Name: ");
            String name = scanner.nextLine();

            System.out.print("Enter Employee Age: ");
            int age = scanner.nextInt();

            System.out.print("Enter Employee Salary: ");
            double salary = scanner.nextDouble();

            Employee emp = new Employee(id, name, age, salary);

            FileWriter fw = new FileWriter(FILE_NAME, true); // Append mode
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(emp.toString());
            bw.newLine();
            bw.close();

        } catch (IOException e) {
            System.out.println("Error writing to file.");
            e.printStackTrace();
        }
    }

    public static void displayAllEmployees() {
        System.out.println("----Report-----");

        try {
            BufferedReader br = new BufferedReader(new FileReader(FILE_NAME));
            String line;

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close();
        } catch (FileNotFoundException e) {
            System.out.println("No employees found.");
        } catch (IOException e) {
            System.out.println("Error reading file.");
        }

        System.out.println("----End of Report-----");
    }
}
