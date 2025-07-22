package functional_interface;

import java.util.ArrayList;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FI4a {

	public static void main(String[] args) {
		ArrayList<FI4b> list = new ArrayList<>();
		list.add(new FI4b(111, "Sunny", 12500));
		list.add(new FI4b(112, "Vicky", 1200));
		list.add(new FI4b(113, "Sidhu", 9500));
		list.add(new FI4b(114, "Priya", 1100));
		list.add(new FI4b(115, "Ravi", 8500));
		Predicate<FI4b> getSalaries = sal -> sal.getSalary() < 10000;
		ArrayList<String> names = list.stream().filter(getSalaries).map(FI4b::getName)
				.collect(Collectors.toCollection(ArrayList::new));
		System.out.println("Persons with salaries less than 10000: " + names);
		}
	}