package Strings;
import java.util.*;

public class S4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String s = sc.nextLine();  // Read the input string
        int n = s.length();        // Find the length

        if (n % 2 == 0) {
            // Use substring on the string 's'
            String firstHalf = s.substring(0, n / 2);
            System.out.println(firstHalf);
        } else {
            System.out.println("null");
        }
    }
}
