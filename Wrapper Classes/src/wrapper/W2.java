package wrapper;

public class W2 {
	public static void main(String[] args) {
		        if (args.length != 1) {
		            System.out.println("Usage: java Test <number>");
		            return;
		        }

		        try {
		            int num = Integer.parseInt(args[0]);

		            System.out.println("Given Number :" + num);
		            System.out.println("Binary equivalent :" + Integer.toBinaryString(num));
		            System.out.println("Octal equivalent :" + Integer.toOctalString(num));
		            System.out.println("Hexadecimal equivalent :" + Integer.toHexString(num).toUpperCase());
		        }
		        catch (NumberFormatException e) {
		            System.out.println("Please enter a valid integer.");
		        }

	}
}
