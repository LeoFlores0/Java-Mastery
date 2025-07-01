package week1.day4;

public class ArraySum {

	public static void main(String[] args) {
		int[] numbers = {50, 20, 5};
		int sum = 0;
		
		for (int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
		}
		System.out.println("The sum is: " + sum);
		System.out.println("The average is: " + sum / numbers.length);
	}

}
