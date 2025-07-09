package Strings;
import java.util.Optional;
public class S15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object employee=null;
		Optional<Object>n=Optional.ofNullable(employee);
		System.out.println(n.orElse("InvalidEmployeeException"));
	}

}
