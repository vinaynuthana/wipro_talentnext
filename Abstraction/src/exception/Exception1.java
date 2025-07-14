package exception;
import java.util.Scanner;

public class Exception1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter the number of array elements: ");
            int n = sc.nextInt();  

            int[] arr = new int[n];

            System.out.println("Enter the elements in the array: ");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();  
            }

            System.out.println("Enter the index of the array element you want to access");
            int a = sc.nextInt();  // Read index

            System.out.println("The array element at index " + a + " = " + arr[a]);
            System.out.println("The array element successfully accessed");

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("java.lang.ArrayIndexOutOfBoundsException");
        } catch (NumberFormatException e) {
            System.out.println("java.lang.NumberFormatException");
        }

    }
}
