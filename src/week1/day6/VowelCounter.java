package week1.day6;
import java.util.Scanner;

public class VowelCounter {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a sentence:");
		String sentence = input.nextLine();
		sentence = sentence.toLowerCase();
		int vowel = 0;
		for (int i = 0; i < sentence.length(); i++ ) {
			char ch = sentence.charAt(i);
			if (ch == 'a' || ch == 'i' || ch == 'e' || ch == 'o' || ch == 'u') {
				vowel++;
			}
		System.out.println(" Your sentence conatins " + vowel + " vowels");
		}
		input.close();
	}

}
