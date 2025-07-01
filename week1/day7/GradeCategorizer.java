package week1.day7;
import java.util.Scanner;

public class GradeCategorizer {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("How many grades would you like to enter?");
		int grades = input.nextInt();
		int[] store  = new int[grades];
		for (int i = 0; i < grades; i++) {
			System.out.println("Enter grade " + (i + 1) + ":");
			store[i] = input.nextInt();
		}
		for (int i = 0; i < grades; i++) {
			if (store[i] > 89) {
				System.out.println("Grade " + (i + 1) + ":" + store[i] + "-A");
				} else if (store[i] > 79) {
					System.out.println("Grade " + (i + 1) + ":" + store[i] + "-B");
				} else if (store[i] > 69) {
					System.out.println("Grade " + (i + 1) + ":" + store[i] + "-C");
				} else if (store[i] > 59) {
					System.out.println("Grade " + (i + 1) + ":" + store[i] + "-D");
				} else {
					System.out.println("Grade " + (i + 1) + ":" + store[i] + "-F");
				}
		} input.close();
	} 
} 
