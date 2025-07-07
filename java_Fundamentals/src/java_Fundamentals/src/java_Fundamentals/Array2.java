package java_Fundamentals;
import java.util.*;

public class Array2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int size = sc.nextInt();
        int[] n = new int[size];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < size; i++) {
            n[i] = sc.nextInt();
        }
        int min = n[0];
        int max = n[0];
        for (int i = 1; i < n.length; i++) {
            if (n[i] < min) {
                min = n[i];
            }
            if (n[i] > max) {
                max = n[i];
            }
        }
        System.out.println("Minimum value in array: " + min);
        System.out.println("Maximum value in array: " + max);
    }
}
