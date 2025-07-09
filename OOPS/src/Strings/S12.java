package Strings;
import java.util.StringJoiner;
public class S12 {
	public static void main(String[] args) {
		StringJoiner s1 = new StringJoiner("-");
		StringJoiner s2 = new StringJoiner("-");
		s1.add("AP");
		s2.add("Amaravathi");
		
		StringJoiner mergedS1 = new StringJoiner("-");
		mergedS1.merge(s1);
		mergedS1.merge(s2);
        System.out.println("i) s1 merged to s2: " + mergedS1);
        
		StringJoiner mergedS2 = new StringJoiner("-");
		mergedS2.merge(s2);
		mergedS2.merge(s1);
        System.out.println("i) s2 merged to s1: " + mergedS2);
	}
}
