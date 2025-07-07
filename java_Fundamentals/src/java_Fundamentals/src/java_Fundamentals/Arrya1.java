package java_Fundamentals;
import java.util.*;

public class Arrya1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();
        
        int[] arr = new int[n]; 
        int sum = 0;
        double average = 0.0;
        
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
        	arr[i]=sc.nextInt();
            sum += arr[i];
        }
        
        average = (double) sum / n;
        
        System.out.println("Sum of array elements: " + sum);
        System.out.println("Average of array elements: " + average);
    }
}
