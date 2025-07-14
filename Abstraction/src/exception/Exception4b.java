package exception;
import exception.InvalidAgeException; 
public class Exception4b {
	public static void main(String[] args) {
		try {
			if(args.length!=2) {
				throw new IllegalArgumentException("Usage:java Exception4 <name> <age>");
			}
			String username = args[0];
			int age = Integer.parseInt(args[1]);
			if(age>=18 && age<60) {
                System.out.println("Eligible");
			}
			else {
				throw new InvalidAgeException("Not Elgible: Age must be written 18 and 59");
			}
		}
		catch (NumberFormatException e) {
            System.out.println("Error: Age must be a valid integer");
        } 
		catch (InvalidAgeException e) {
            System.out.println("Error: " + e.getMessage());
        } 
		catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } 
		catch (Exception e) {
            System.out.println("Unexpected Error: " + e.getMessage());
        }
	}
}
