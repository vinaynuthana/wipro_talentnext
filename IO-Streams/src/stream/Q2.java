package stream;
import java.io.*;
import java.util.Scanner;
public class Q2 {
	public static void main(String[] args) {
		
		        Scanner sc = new Scanner(System.in);

		        System.out.print("Enter the input file name: ");
		        String inputFile = sc.nextLine();

		        System.out.print("Enter the output file name: ");
		        String outputFile = sc.nextLine();

		        try {
		            FileReader reader = new FileReader(inputFile);
		            FileWriter writer = new FileWriter(outputFile);

		            int ch;
		            while ((ch = reader.read()) != -1) {
		                writer.write(ch);
		            }

		            System.out.println("File is copied.");
		        } 
		        catch (FileNotFoundException e) {
		            System.out.println("Input file not found.");
		        } 
		        catch (IOException e) {
		            System.out.println("Error occurred while copying the file.");
		        }
		    }
		}

