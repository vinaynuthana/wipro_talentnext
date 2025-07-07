package java_Fundamentals;

import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the string: ");
		String s = sc.nextLine();
		System.out.println("Enter the age: ");
		int age = sc.nextInt();
		if(s.equals("Male")) {
			if(age>=1 && age<=58) {
				System.out.println("Percentage of interest is 8.4%");
			}
			else {
				System.out.println("Percentage of interest is 10.5%");
			}
		}
		else {
			if(age>=1 && age<=58) {
				System.out.println("Percentage of interest is 8.2%");
			}
			else {
				System.out.println("Percentage of interest is 9.2%");
			}
		}
		
	}

}
