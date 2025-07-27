package week1.day6;
import java.util.Scanner;

public class WordCounter {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a sentence:");
		String sentence = input.nextLine();
		String[] parts = sentence.split(" ");
		System.out.println("The number of words in the sentence is: " + parts.length);
		input.close();

	}

}
