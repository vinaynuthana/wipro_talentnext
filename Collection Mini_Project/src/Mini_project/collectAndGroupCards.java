package Mini_project;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class collectAndGroupCards {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<Character, List<Cards>> map = new TreeMap<>();
		System.out.print("Enter the number of cards: ");
		int n = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < n; i++) {
			System.out.println("Enter the card " + (i+1) + " :");
			char ch = sc.next().toLowerCase().charAt(0);
			int num = sc.nextInt();
			sc.nextLine();
			Cards card = new Cards(ch, num);
			map.putIfAbsent(ch, new ArrayList<>());
			map.get(ch).add(card);
		}
		System.out.println("Distinct symbols are:");
		for (char ch : map.keySet()) {
			System.out.print(ch + " ");
		}
		System.out.println();

		for (char key : map.keySet()) {
			System.out.println("cards in " + key + " symbol");
			List<Cards> card = map.get(key);
			int sum = 0;
			for (Cards c : card) {
				System.out.println(c);
				sum += c.getNumber();
			}
			System.out.println("Number of cards: " + card.size());
			System.out.println("Sum of numbers: " + sum);
		}

	}

}

class Cards {
	private char symbol;
	private int number;

	public Cards(char symbol, int number) {
		this.symbol = symbol;
		this.number = number;
	}

	public char getSymbol() {
		return symbol;
	}

	public int getNumber() {
		return number;
	}

	public String toString() {
		return symbol + " " + number;
	}
}