package week2.day10;
import java.util.Scanner;

public class PrimeNumberChecker {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = input.nextInt();
		if (isPrime(n)) {
			System.out.println("Number is prime");
		} else {
			System.out.println("Number is not prime");
		}
		input.close();
	}
	public static boolean isPrime(int n) {
		if (n <= 1) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
			return false;
			}
		}
		return true;
	}
}
