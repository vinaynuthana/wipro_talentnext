package streamAPI;
import java.util.ArrayList;
import java.util.stream.Collectors;
public class Stream2a {

	

	

		public static void main(String[] args) {
			ArrayList<Stream2b> list = new ArrayList<>();
			list.add(new Stream2b(123,"Sai",21,"Ongole"));
			list.add(new Stream2b(456,"Bhupathi",21,"Punjab"));
			list.add(new Stream2b(789,"Rajiv",25,"Pune"));
			list.add(new Stream2b(112,"Raju",24,"Pune"));
			list.add(new Stream2b(113,"Ravi",26,"Pune"));
			ArrayList<Stream2b> location = list.stream().filter(emp -> emp.location.equals("Pune")).collect(Collectors.toCollection(ArrayList::new));
			location.forEach(System.out::println);
		}
}

