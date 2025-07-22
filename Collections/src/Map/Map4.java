package Map;
import java.util.*;
public class Map4 {
	public static void main(String[] args) {
		HashMap<String, Integer> ContactList = new HashMap<>();
		ContactList.put("Vinay" , 905946599);
		
		String keyToCheck = "Vinay";
		if(ContactList.containsKey(keyToCheck)) {
			System.out.println("Key " +keyToCheck+" "+ "exists in the map");
		}
		else {
			System.out.println("Key" +keyToCheck+ "doesn't exists in the map");
		}
		Integer valueToCheck = 905946599;
		if(ContactList.containsValue(valueToCheck)) {
			System.out.println("Value " +valueToCheck+" "+ "exists in the map");
		}
		else {
			System.out.println("Value " +valueToCheck+" "+ "doesn't exists in the map");
		}
		
		Iterator<Map.Entry<String,Integer>> it = ContactList.entrySet().iterator();
		while(it.hasNext()) {
			Map.Entry<String, Integer> entry = it.next();
			System.out.println("Key: " +entry.getKey()+" "+ "Value: " +entry.getValue());
		}
	}   
}
