package wrapper;
import java.util.*;
public class W3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter integer number between 1 and 255: ");
		int n = sc.nextInt();
		if(n<1 || n>255) {
			System.out.println("Invalid input! Please enter a number between 1 and 255");
		}
		String binary = Integer.toBinaryString(n);
		String padBinary= String.format("%8s", binary).replace(' ','0');
		System.out.println("Binary Represtation: " +padBinary);
	}

}
