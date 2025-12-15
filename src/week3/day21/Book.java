package week3.day21;

public class Book {
	String title;
	String author;
	int year;
	
	public Book() {
		this.title = "Unknown";
		this.author = "Unknown";
		this.year = 0;
	}

	public Book(String title, String author) {
		this.title = title;
		this.author = author;
		this.year = 0;
	}

	public Book(String title, String author, int year) {
		this.title = title;
		this.author = author;
		this.year = year;
	}

	 public void displayInfo() {
	        System.out.println("Title: " + title + ", Author: " + author + ", Year: " + year);
	    }
}
