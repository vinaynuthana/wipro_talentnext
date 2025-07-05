package java_Fundamentals;

import java.util.Scanner;

public class Question7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the letter: ");
		char ch=sc.next().charAt(0);
		if(ch>='A'&&ch<='Z') {
			char lower = Character.toLowerCase(ch);
			System.out.println(lower);
		}
		else {
			char upper = Character.toUpperCase(ch);
			System.out.println(upper);
		}
	}

}
