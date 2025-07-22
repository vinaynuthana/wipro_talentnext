package Map;
import java.util.*;

public class Map5 {
	TreeMap<String,String> M1 = new TreeMap<>();
	public TreeMap<String, String>saveCountryCapital(String CountryName,String capital){
		M1.put(CountryName ,capital );
		return M1;
	}
	public String getCapital(String CountryName) {
		return M1.get(CountryName);
	}
	public String getCountry(String capitalName) {
	    for (String country : M1.keySet()) {
	        String capital = M1.get(country);
	        if (capital.equals(capitalName)) {
	            return country;
	        }
	    }
	    return null;
	}
	public TreeMap<String,String> reverseMap(){
		TreeMap<String , String> M2= new TreeMap<>();
		for(String country:M1.keySet()) {
			String capital = M1.get(country);
			M2.put(capital , country);
		}
		return M2;
	}
	
	public ArrayList<String> getAllCountries(){
		return new ArrayList<>(M1.keySet());
	}
	public static void main(String[] args) {
		Map5 map = new Map5();
		map.saveCountryCapital("India" , "Delhi");
		map.saveCountryCapital("Japan" , "Tokyo");
		
		System.out.println("Capital of India :" +map.getCapital("India"));
		
		System.out.println("Country with capital Tokyo :" +map.getCountry("Tokyo"));
		
		TreeMap<String,String> M2 = map.reverseMap();
		System.out.println("Reversed Map (Capital->Country):"+M2);

		ArrayList<String> list = map.getAllCountries();
		System.out.println("All countries:"+list);
	}
}

