package java_Fundamentals;
import java.util.Scanner;
public class Question15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    Scanner sc=new Scanner(System.in);
		      String input = sc.nextLine().trim();
		        if (input.isEmpty()) {
		            System.out.println("Please enter an integer number");
		            return;
		        }
		        int num;
		        try {
		            num = Integer.parseInt(input);
		        } catch (NumberFormatException e) {
		            System.out.println("Please enter an integer number");
		            return;
		        }
		      for(int i=0;i<num;i++){
		        for(int j=0;j<=i;j++){
		          System.out.print("*  ");
		        }
		        System.out.println();
		      }
		      int i=0;
		      int j=0;
	}

}
