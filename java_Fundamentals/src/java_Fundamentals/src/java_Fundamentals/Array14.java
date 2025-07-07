package java_Fundamentals;
import java.util.*;
public class Array14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[][] = new int[3][3];
		Scanner sc = new Scanner(System.in);
		int max = nums[0][0];
		System.out.println("The given array is: ");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				nums[i][j] = sc.nextInt();
				if(nums[i][j] > max) {
					max = nums[i][j];
				}
			}
		}
		System.out.println("The biggest number in the given array is: ");
		System.out.println(max);
	}

}