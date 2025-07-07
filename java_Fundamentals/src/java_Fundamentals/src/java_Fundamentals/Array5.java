package java_Fundamentals;
import java.util.Arrays;
public class Array5 {
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6,7,8};
		Arrays.sort(arr);
		System.out.println(arr[0] + " ," + arr[1]);
		int n = arr.length;
		System.out.println(arr[n-2] + " ," + arr[n-1]);
	}
}
