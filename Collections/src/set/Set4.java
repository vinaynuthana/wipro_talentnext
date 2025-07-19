package set;
import java.util.TreeSet;
public class Set4 {

		TreeSet<String> H1 = new TreeSet<>();
		public TreeSet<String> saveCountryNames(String CountryName){
			H1.add(CountryName);
			return H1;
		}
		public String getCountry(String CountryName) {
			if(H1.contains(CountryName)) {
				return CountryName;
			}
			return null;
		}
		
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		Set4 set = new Set4();
		set.saveCountryNames("India");
		set.saveCountryNames("Russia");
		System.out.println(set.getCountry("India"));
		System.out.println(set.getCountry("Russia"));
	}

}
