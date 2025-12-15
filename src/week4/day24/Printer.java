package week4.day24;

public class Printer {

	String message;
	int number;
	int times;
	
	public void print(String message) {
		System.out.println(message);
	}

	public void print(int number) {
		System.out.println(number);
	}

	public void print(String message, int times) {
		for (int i = 0; i < times; i++) {
			System.out.println(message);
		}

	}
}
