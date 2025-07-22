package streamAPI;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Stream3a {

	public static void main(String[] args) {
		ArrayList<Stream3b> list = new ArrayList<>();
		list.add(new Stream3b(111,"Sai",100));
		list.add(new Stream3b(112,"Ram",90));
		list.add(new Stream3b(113,"Prabhas",95));
		list.add(new Stream3b(114,"Arjun",90));
		list.add(new Stream3b(115,"Mahesh",89));
		ArrayList<Stream3b> passed = list.stream().filter(n -> n.marks >= 50).collect(Collectors.toCollection(ArrayList::new));
		passed.forEach(System.out::println);
		System.out.println("Number of passed Stream3b: " + passed.size());
	}

}
