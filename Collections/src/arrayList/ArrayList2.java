package arrayList;
import java.util.ArrayList;
import java.util.Iterator;
public class ArrayList2 {

	public static void printAll(ArrayList<String> list) {
		Iterator<String> iterator = list.iterator();
		System.out.println("All elements in the ArrayList:");
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> names = new ArrayList<>();
		names.add("Vinay");
		names.add("Sukumar");
		names.add("N");
		printAll(names);
	}
}
