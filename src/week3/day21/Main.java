package week3.day21;

public class Main {
	public static void main(String[] args) {
		Book b1 = new Book();
		Book b2 = new Book("1984", "George Orwell");
		Book b3 = new Book("Dune", "Frank Herbert", 1965);
		
		b1.displayInfo();
		b2.displayInfo();
		b3.displayInfo();
		
	}
	
	
}
