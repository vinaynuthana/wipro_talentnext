package Strings;
import java.util.*;
public class S5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str = sc.nextLine();
		int n = str.length();
		System.out.println(str.substring(1,n-1));
	}
}
