package Strings;
import java.util.Scanner;
public class S2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first string: ");
		String s1 = sc.nextLine().toLowerCase();
		System.out.println("Enter second string: ");
		String s2 = sc.nextLine().toLowerCase();
		if(s1.charAt(s1.length()-1)==s2.charAt(0)) {
			s2=s2.substring(1);
		}
		String result = s1+s2;
		System.out.println("Result:"+result);
	}
}
