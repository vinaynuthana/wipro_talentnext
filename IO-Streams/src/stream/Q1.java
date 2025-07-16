package stream;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
class Q1{
	public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);

		        // Ask user for file name and character
		        System.out.print("Enter the file name: ");
		        String fileName = sc.nextLine();

		        System.out.print("Enter the character to be counted: ");
		        char target = sc.nextLine().toLowerCase().charAt(0); // case-insensitive

		        int count = 0;

		        try {
		            File file = new File(fileName);
		            Scanner fileScanner = new Scanner(file);

		            // Read file line by line
		            while (fileScanner.hasNextLine()) {
		                String line = fileScanner.nextLine().toLowerCase(); // convert line to lowercase
		                for (int i = 0; i < line.length(); i++) {
		                    if (line.charAt(i) == target) {
		                        count++;
		                    }
		                }
		            }

		            System.out.println("File '" + fileName + "' has " + count +
		                               " instances of letter '" + target + "'.");

		        } 
		        catch (FileNotFoundException e) {
		            System.out.println("File not found: " + fileName);
		        }
		    }
		}
