package Mini_project;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class UniqueSymbolFromCards {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Set<Card> uniqueCards = new LinkedHashSet<>();
		Set<Character> uniqueSymbol = new HashSet<>();

		while (uniqueSymbol.size() < 4) {
			System.out.println("Enter the card");
			char symbol = sc.next().toLowerCase().charAt(0);
			int number = sc.nextInt();

			Card card = new Card(symbol, number);
			uniqueCards.add(card);
			uniqueSymbol.add(symbol);
		}
		System.out.println("Four symbols are gathered in " + uniqueCards.size() + " cards.");
		System.out.println("Cards in set are: ");
		Map<Character, Card> unique = new TreeMap<>();
		for (Card c : uniqueCards) {
			if (!(unique.containsKey(c.getSymbol()))) {
				unique.put(c.getSymbol(), c);
			}
		}

		for (Card c : unique.values()) {
			System.out.println(c);
		}

	}

}

class Card {
	private char symbol;
	private int num;

	public Card(char symbol, int num) {
		this.symbol = symbol;
		this.num = num;
	}
	public int hashCode() {
		return Objects.hash(symbol, num);
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Card))
			return false; 
		Card card = (Card) obj;
		return this.symbol == card.symbol && this.num == card.num;
	}

	public char getSymbol() {
		return symbol;
	}

	public int getNum() {
		return num;
	}

	public String toString() {
		return symbol + " " + num;
	}
}

