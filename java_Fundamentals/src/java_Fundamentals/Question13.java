package java_Fundamentals;
import java.util.*;
public class Question13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	    int count=0;
	    for(int i=10;i<=99;i++){
	      for(int j=2;j<=i;j++){
	        if(i%j==0){
	          count++;
	        }
	      }
	      if(count<2){
	          count=0;
	          System.out.println(i);
	        }
	        else{
	          count=0;
	        }
	    }
	}

}
