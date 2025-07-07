package java_Fundamentals;

public class Array9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {10,2,10};
		int result[] = new int[arr.length];
		int index=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=10) {
				result[index]=arr[i];
				index++;
			}
		}
		System.out.print("[");
		for(int i=0;i<result.length;i++) {
			System.out.print(result[i]);
			if(i<result.length-1) {
				System.out.print(",");
			}
		}
		System.out.print("]");
	}

}
