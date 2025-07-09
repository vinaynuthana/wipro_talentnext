package Strings;
import java.util.Scanner;
public class S1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string: ");
		String s = sc.nextLine();
		String rev = "";
		for(int i=s.length()-1;i>=0;i--) {
			rev = rev+s.charAt(i);
		}
		if(s.equals(rev)) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not a Palindrome");
		}
	}
}
