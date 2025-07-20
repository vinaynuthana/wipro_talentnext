package Map;
import java.util.*;
public class Map3 {
	public static void main(String[] args) {
		
		Properties state= new Properties();
		state.setProperty("AP", "Amaravathi");
		state.setProperty("HYD","Telengana");
		state.setProperty("TN","Chennai");
		
		Set<Object> stateName = state.keySet();
		
		Iterator<Object> it = stateName.iterator();
		System.out.println("State and Capital List:");
		while(it.hasNext()) {
			String states = (String) it.next();
			String capital = state.getProperty(states);
			System.out.println("State:" + states+"  " + "Capital:" + capital);
		}
	}
}
