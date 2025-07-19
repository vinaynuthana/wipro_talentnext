package arrayList;
import java.util.Vector;
import java.util.Arrays;
public class List6 {
	public static void main(String[] args) {
		Vector<String> month = new Vector<>(Arrays.asList("Jan", "Feb", "March", "April", "May", "June", "July", "Aug", "Sep", "Oct", "Nov", "Dec"));
		System.out.println(month);
	}
}
