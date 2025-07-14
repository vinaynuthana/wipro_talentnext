package exception;

import java.util.Scanner;
import java.util.InputMismatchException;

class NegativeValueException extends Exception {
 public NegativeValueException(String message) {
     super(message);
 }
}


class OutOfRangeException extends Exception{
 public OutOfRangeException(String message) {
     super(message);
 }
}


public class Exception3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        try {
            System.out.print("Enter student name: ");
            String name = sc.nextLine();

            System.out.print("Enter number of subjects: ");
            int n = sc.nextInt();

            int[] marks = new int[n];
            System.out.println("Enter the marks:");

            for (int i = 0; i < n; i++) {
                int mark = sc.nextInt();

                if (mark < 0) {
                    throw new NegativeValueException("Marks cannot be negative.");
                } else if (mark > 100) {
                    throw new OutOfRangeException("Marks must be in the range 0 to 100.");
                }

                marks[i] = mark;
                sum += mark;
            }

            double average = (double) sum / n;
            System.out.println("Average marks of " + name + " is: " + average);

        } catch (InputMismatchException e) {
            System.out.println("Invalid input! Please enter integer values for marks.");
        } catch (NegativeValueException e) {
            System.out.println("Error: "+ e.getMessage());
        } catch (Exception e) {
            System.out.println("Unexpected Error: " + e.getMessage());
        } 
    }
}
