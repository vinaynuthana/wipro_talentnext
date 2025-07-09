package Strings;
import java.util.Optional;
public class S13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names = new String[5];
		Optional<String> optionalName=Optional.ofNullable(names[0]);
		if(optionalName.isPresent()) {
			System.out.println("Length: "+optionalName.get().length());
		}
		else {
			System.out.println("names[0] is null. Cannot get length.");
		}
	}

}
