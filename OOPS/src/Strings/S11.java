package Strings;
import java.util.ArrayList;
import java.util.StringJoiner;

public class S11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> names = new ArrayList<>();
		names.add("Vinay");
		names.add("Sukumar");
		StringJoiner joiner=new StringJoiner(",","{","}");
		for(String name:names) {
			joiner.add(name);
		}
		System.out.println("Joiner:"+joiner);
	}

}
