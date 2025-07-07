package java_Fundamentals;

public class Array12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3};
		int b[]= {4,5,6};
		int result[] = {a[1],b[1]};
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
