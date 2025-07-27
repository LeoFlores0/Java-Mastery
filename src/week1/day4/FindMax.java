package week1.day4;

public class FindMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {10, 4, 59, 5, 0};
		int max = numbers[0];
		
		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i] > max) {
				max = numbers[i];
			}
		}
		System.out.println("The max is: " + max);
	}

}
