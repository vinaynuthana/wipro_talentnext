package mini_project;
public class Mini_Project {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Please provide an employee ID.");
            return;
        }

        int id = Integer.parseInt(args[0]);

        String[][] employees = {
            {"1001", "Ashish", "01/04/2009", "e", "R&D", "20000", "8000", "3000"},
            {"1002", "Sushma", "23/08/2012", "c", "PM", "30000", "12000", "9000"},
            {"1003", "Rahul", "12/11/2008", "k", "Acct", "10000", "8000", "1000"},
            {"1004", "Chahat", "29/01/2013", "r", "Front Desk", "12000", "6000", "2000"},
            {"1005", "Ranjan", "16/07/2005", "m", "Engg", "50000", "20000", "20000"},
            {"1006", "Suman", "1/1/2000", "e", "Manufacturing", "23000", "9000", "4400"},
            {"1007", "Tanmay", "12/06/2006", "c", "PM", "29000", "12000", "10000"}
        };

        boolean found = false;

        for (String[] emp : employees) {
            int emp_id = Integer.parseInt(emp[0]);

            if (id == emp_id) {
                String designationCode = emp[3];
                String designation = "";
                int da = 0;

                switch (designationCode) {
                    case "e":
                        designation = "Engineer";
                        da = 20000;
                        break;
                    case "c":
                        designation = "Consultant";
                        da = 32000;
                        break;
                    case "k":
                        designation = "Clerk";
                        da = 12000;
                        break;
                    case "r":
                        designation = "Receptionist";
                        da = 15000;
                        break;
                    case "m":
                        designation = "Manager";
                        da = 40000;
                        break;
                    default:
                        designation = "Unknown";
                }

                int basic = Integer.parseInt(emp[5]);
                int hra = Integer.parseInt(emp[6]);
                int it = Integer.parseInt(emp[7]);

                int salary = basic + hra + da - it;

                System.out.println("Emp No.\tEmp Name\tDepartment\tDesignation\tSalary");
                System.out.printf("%s\t\t%s\t\t%s\t\t%s\t%d\n",
                        emp[0], emp[1], emp[4], designation, salary);

                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("There is no employee with empid : " + id);
        }
    }
}
