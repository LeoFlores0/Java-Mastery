package week1.day6;
import java.util.Scanner;

public class WordFinder {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a sentence:");
		String sentence = input.nextLine();
		System.out.println("Enter a word:");
		String word = input.nextLine();
		
		if (sentence.contains(word)) {
			System.out.println("yes, the word is in the sentence");
		} else {
			System.out.println("no, the word is not in the sentence");
		}
		input.close();
	}

}
