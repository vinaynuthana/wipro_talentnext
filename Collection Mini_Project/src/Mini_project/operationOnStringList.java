package Mini_project;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class operationOnStringList {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<String> list = new ArrayList<>();
		while (true) {
			System.out.println("1. Insert");
			System.out.println("2. Search");
			System.out.println("3. Delete");
			System.out.println("4. Display");
			System.out.println("5. Exit");
			System.out.print("Enter your choice: ");
			int choice = sc.nextInt();
			sc.nextLine();
			switch (choice) {
			case 1:
				System.out.print("Enter the item to insert: ");
				String item = sc.nextLine();
				list.add(item);
				System.out.println("Item added successfully.");
				break;
			case 2:
				System.out.println("Enter the item to search: ");
				String item1 = sc.nextLine();
				if (list.contains(item1)) {
					System.out.println("Item found in the list.");
				} else {
					System.out.println("Item not found in the list");
				}
				break;
			case 3:
				System.out.println("Enter the item to delete: ");
				String item2 = sc.nextLine();
				if (list.remove(item2)) {
					System.out.println("Deleted successfully.");
				} else {
					System.out.println("Item does not exist.");
				}
				break;
			case 4:
				if (list.isEmpty()) {
					System.out.println("List is empty.");
				} else {
					for (String s : list) {
						System.out.println(s);
					}
				}
				break;
			case 5:
				System.out.println("Exiting...");
				return;
			default:
				System.out.println("Invalid choice.");

			}
		}

	}

}
