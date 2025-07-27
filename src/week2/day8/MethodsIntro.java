package week2.day8;
import java.util.Scanner;

public class MethodsIntro {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("What is your name?");
		String name = input.nextLine();
		greetUser(name);
		input.close();
	} 
	
	public static void greetUser(String name) {
		System.out.println("Hello " + name);
	}
	
}
