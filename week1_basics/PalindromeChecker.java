package week1.day6;
import java.util.Scanner;

public class PalindromeChecker {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a word or phrase:");
		String phrase = input.nextLine();
		phrase = phrase.toLowerCase().replace(" ", "");
		String reverse = "";
		for (int i = phrase.length() - 1; i >= 0; i--) {
			reverse += phrase.charAt(i);
		}
		if (reverse.equals(phrase)) {
			System.out.println("Yes, it's a palindrome");
		} else {
			System.out.println("No, it's not a palindrome");
		}
		input.close();
	}

}
