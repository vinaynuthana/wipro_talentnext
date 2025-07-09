package Strings;
import java.util.*;
public class S8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String s = sc.nextLine();
		String res="";
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='*') {
				continue;
			}
			else if(i>0 && s.charAt(i-1)=='*') {
				continue;
			}
			else if(i<s.length()-1 && s.charAt(i+1)=='*') {
				continue;
			}
			res+=s.charAt(i);
		}
		System.out.println("Result: "+res);
		
	}
}
