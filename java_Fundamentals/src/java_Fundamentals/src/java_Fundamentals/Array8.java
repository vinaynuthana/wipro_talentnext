package java_Fundamentals;

public class Array8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {10,3,6,1,2,7,9};
		int sum=0;
		boolean skip = false;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==6) {
				skip=true;
			}
			else if(arr[i]==7&&skip) {
				skip = false;
			}
			else if(!skip) {
				sum+=arr[i];
			}
		}
		System.out.println(sum);
	}

}
