package set;
import java.util.TreeSet;
import java.util.Iterator;
public class Set3 {
	public static void main(String[] args) {
		
		TreeSet<String> ts = new TreeSet<>();
		ts.add("Nuts");
		ts.add("Dates");
		ts.add("Almond");
		ts.add("Cashews");
		
		TreeSet<String> reversedTreeSet = new TreeSet<>(ts.descendingSet());
		System.out.println("Reversed Elements:");
		for(String element:reversedTreeSet) {
			System.out.println(element);
		}
		
		System.out.println("\nIterating element using Iterator:");
		Iterator<String> iterator = ts.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		String searchElement = "Grape";
		if(ts.contains(searchElement)) {
			System.out.println("\n'" + searchElement + "' exists in the TreeSet");
		}
		else {
			System.out.println("\n'" + searchElement + "' does not exists in the TreeSet");
		}
	}
}
