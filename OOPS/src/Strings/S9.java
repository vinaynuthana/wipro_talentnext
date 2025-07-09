package Strings;
import java.util.*;
public class S9 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter the first string: ");
	String a = sc.nextLine();
	
	System.out.print("Enter the second string: ");
	String b = sc.nextLine();
	
	String res="";
	int minlen = Math.min(a.length(),b.length());
	
	for(int i=0;i<minlen;i++) {
		res+=a.charAt(i)+ "" +b.charAt(i);
	}
	if(a.length()>b.length()) {
		res+=a.substring(minlen);
	}
	else if(b.length()>a.length()){
		res+=b.substring(minlen);
	}
	System.out.println("Result: "+res);
	
	}
}
