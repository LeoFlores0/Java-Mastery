package week1.day6;
import java.util.Scanner;

public class NameReverser {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Type your full name:");
		String fullName = input.nextLine();
		String[] parts = fullName.split(" ");
		System.out.println(parts[1] + " " + parts[0]);
		input.close();		
		

	}

}
