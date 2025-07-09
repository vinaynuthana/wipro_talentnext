package Strings;
import java.util.Scanner;
public class S3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ente the string: ");
		String s = sc.nextLine();
		int n= s.length();
		String firstTwo = s.substring(0,2);
		String result ="";
		for(int i=0;i<n;i++) {
			result=result+firstTwo;
			}
		System.out.println(result);
	}
}

