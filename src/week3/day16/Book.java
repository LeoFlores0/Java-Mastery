package week3.day16;

public class Book {
	String title;
	String author;

	// Constructor
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
	
	// Method to print book info
	public void printInfo() {
		System.out.println("Title: " + title + ", Author: " + author);
	}
	
	// Main method
	public static void main(String[] args) {
		Book b1 = new Book("1984", "George Orwell");
		b1.printInfo();
	}
}
