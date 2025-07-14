package apk;
import functional.Test;
public class Lambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t1 = (a,b,c) -> a+b+c;
		Test t2 = (a,b,c) -> a*b*c;
		
		int res1 = t1.myFunction(1,2,3);
		int res2 = t2.myFunction(1,2,3);
		
		System.out.println("Addition result of t1 is: " +res1);
		System.out.println("Multiplication result of t2 is: " +res2);

	}

}
