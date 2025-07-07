package java_Fundamentals;
import java.util.*;
public class Array13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int nums[][] = new int[2][2];
		int arr[] = new int[4];
		System.out.println("The given array is: ");
		if (arr.length < 4) {
            System.out.println("Please enter 4 integer numbers");
            }
		for(int i=0;i<2*2;i++) {
				arr[i] = sc.nextInt();
			
		}
		int index = 3;
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				nums[i][j] = arr[index--];
			}
		}
		System.out.println("Reverse of the array is: ");
		for(int i=0;i<2;i++) {
			System.out.print("[");
			for(int j=0;j<2;j++) {
				System.out.print(nums[i][j]+ " ");
			}
			System.out.print("]");
			System.out.println();
		}
	}

}