package Strings;
import java.util.*;
public class S10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the string: ");
		String s = sc.nextLine();
		
		System.out.println("Enter the integer: ");
		int n = sc.nextInt();
		
		String res="";
		String str = s.substring(s.length()-n);
		for(int i=0;i<n;i++) {
			res+=str;
		}
		System.out.println("Result: "+res);
	}
}
