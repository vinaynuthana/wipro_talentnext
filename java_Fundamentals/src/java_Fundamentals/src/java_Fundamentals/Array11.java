package java_Fundamentals;

public class Array11 {
	public static void main(String[] args) {
		int arr[] = {1,4,1,4};
		boolean found=true;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=1 && arr[i]!=4) {
				found =false;
				break;
			}
		}
		System.out.println(found);
		
	}
}
