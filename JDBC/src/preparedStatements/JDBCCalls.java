package preparedStatements;

public class JDBCCalls {

	public static void main(String[] args) {
		try {
			DAOClass d = new DAOClass();
			int choice = Integer.parseInt(args[0]);
			switch (choice) {
			case 1:
				int rollno = Integer.parseInt(args[1]);
				String name = args[2];
				String std = args[3];
				String dob = args[4];
				double fees = Double.parseDouble(args[5]);
				d.insert(rollno, name, std, dob, fees);
				break;
			case 2:
				rollno = Integer.parseInt(args[1]);
				d.delete(rollno);
				break;

			case 3:
				rollno = Integer.parseInt(args[1]);
				double newFees = Double.parseDouble(args[2]);
				d.modify(rollno, newFees);
				break;

			case 4:
				if (args.length == 2) {
					rollno = Integer.parseInt(args[1]);
					d.display(rollno);
				} else {
					d.display();
				}
				break;
			default:
				System.out.println("Invalid option!");
			}

		} catch (Exception e) {
			System.out.println("Exception: " + e.getMessage());
		}

	}

}