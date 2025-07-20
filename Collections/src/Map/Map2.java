package Map;
import java.util.*;
public class Map2 {
	public static void main(String[] args) {
		
	HashMap<String , String> map = new HashMap<>();		
	
	map.put("India","Delhi");
	map.put("Japan","Tokyo");
	map.put("Russia","Moscow");
	
	String keyToCheck = "India";
	if(map.containsKey(keyToCheck)) {
		System.out.println("Key '"+keyToCheck+"' exists in the map.");
	}
	else {
		System.out.println("Key '"+keyToCheck+"' does not exists in the map.");
	}
	
	String valueToCheck = "Delhi";
	if(map.containsValue(valueToCheck)) {
		System.out.println("Value '"+valueToCheck+"' exists in the map.");
	}
	else {
		System.out.println("Value '"+valueToCheck+"' does not exists in the map.");
	}
	
	
	
	Iterator<Map.Entry<String,String>> it = map.entrySet().iterator();
	while(it.hasNext()) {
		Map.Entry<String, String> pair = it.next();
		System.out.println("Country:"+pair.getKey()+" " +"Capital:"+pair.getValue());
		
	}
	}
}
