package java_Fundamentals;
import java.util.Scanner;

public class Question17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	    int num=sc.nextInt();
	    int temp=num;
	    int rev=0;
	    while (num!=0) {
	      int rem=num%10;
	      rev=rev*10+rem;
	      num/=10;
	    }
	    if(temp==rev)System.out.println(temp+" is a Palindrome");
	    else System.out.println(temp+" is Not a Palindrome");
	}

}
