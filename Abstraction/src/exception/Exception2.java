package exception;
import java.util.Scanner;
import java.util.InputMismatchException;
public class Exception2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int sum=0;
		double average;
		try {
		System.out.println("Enter the elements: ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
			 sum = sum + arr[i];
			}
		
		System.out.println("The sum is: "+sum);
		System.out.println("The average is: "+(double)sum/n);
		}
		catch (ArithmeticException e) {
            System.out.println("java.lang.ArithmeticException");
        } 
		catch (NumberFormatException e) {
            System.out.println("java.lang.NumberFormatException");
        }
		catch (ArrayIndexOutOfBoundsException e) {
	            System.out.println("Error: " + e.getMessage());
	        }
		catch (Exception e) {
            System.out.println("Unexpected Error: " + e.getMessage());
        }

	}
}