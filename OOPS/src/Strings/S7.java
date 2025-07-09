package Strings;
import java.util.*;

public class S7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String s = sc.nextLine();

        if (s.length() > 0 && s.charAt(0) == 'x') {
            s = s.substring(1);
        }

        if (s.length() > 0 && s.charAt(s.length() - 1) == 'x') {
            s = s.substring(0, s.length() - 1);
        }

        System.out.println("Result: " + s);
    }
}
