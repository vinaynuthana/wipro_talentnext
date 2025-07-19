package set;
import java.util.Iterator;
import java.util.HashSet;
public class Set2 {
	public static void main(String[] args) {
		HashSet<String> empNames = new HashSet<>();
		empNames.add("Sukumar");
		empNames.add("Nuthana");
		empNames.add("Vinay");
		
		
		
		Iterator<String> iterator = empNames.iterator();
		System.out.println("Employee Names: ");
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
