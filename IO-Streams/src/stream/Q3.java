package stream;
import java.io.*;
import java.util.*;
public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        Scanner sc = new Scanner(System.in);

		        System.out.print("Enter the input file name: ");
		        String inputFile = sc.nextLine();

		        System.out.print("Enter the output file name: ");
		        String outputFile = sc.nextLine();

		        Map<String, Integer> wordCount = new TreeMap<>();

		        try {
		            Scanner fileScanner = new Scanner(new File(inputFile));

		            while (fileScanner.hasNext()) {
		                String word = fileScanner.next().replaceAll("[^a-zA-Z]", "").toLowerCase();
		                if (!word.isEmpty()) {
		                    wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
		                }
		            }
		            FileWriter writer = new FileWriter(outputFile);
		            for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
		                writer.write(capitalize(entry.getKey()) + " : " + entry.getValue() + "\n");
		            }

		            System.out.println("Word count written to " + outputFile);

		        } catch (IOException e) {
		            System.out.println("Error: " + e.getMessage());
		        }
		    }

		    private static String capitalize(String word) {
		        if (word.isEmpty()) 
		        	return word;
		        return word.substring(0, 1).toUpperCase() + word.substring(1);
		    }
		}

