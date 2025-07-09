package Strings;
import java.util.Optional;
public class S14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String address = null;
        Optional<String> optionalAddress = Optional.ofNullable(address);
        String finalAddress = optionalAddress.orElse("India");
        System.out.println("Address: "+finalAddress); 
	}

}
