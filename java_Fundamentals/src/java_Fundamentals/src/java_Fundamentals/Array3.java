package java_Fundamentals;
import java.util.*;
public class Array3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the element: ");
		int k=sc.nextInt();
		int[] n= {1,4,34,56,7};
		boolean found = false;
		for(int i=0;i<n.length;i++) {
			if(n[i]==k) {
				System.out.println("Element found at index: " +i);
				found = true;
				break;
			}
			
		}
		if(!found) {
			System.out.println(-1);
		}
		
		
	}

}
