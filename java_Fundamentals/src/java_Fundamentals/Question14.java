package java_Fundamentals;
import java.util.Scanner;

public class Question14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
	    int num=sc.nextInt();
	    int sum=0;
	    while(num!=0){
	      int rem=num%10;
	      sum+=rem;
	      num/=10;
	    }
	    System.out.println(sum);
	}

}
