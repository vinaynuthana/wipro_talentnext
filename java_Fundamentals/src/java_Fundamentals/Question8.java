package java_Fundamentals;

import java.util.Scanner;

public class Question8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the code (R/B/G/O/Y/W): ");
		char code = sc.next().toUpperCase().charAt(0);
		switch(code) {
		case 'R':
			System.out.println("Red");
			break;
		case 'B':
			System.out.println("Black");
			break;
		case 'G':
			System.out.println("Green");
			break;
		case 'O':
			System.out.println("Orange");
			break;
		case 'Y':
			System.out.println("Yellow");
			break;
		case 'W':
			System.out.println("White");
			break;
		default:
			System.out.println("Invalid Code");
			
		}
	}

}
