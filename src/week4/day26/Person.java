package week4.day26;

public class Person {
	private String ssn = "123-45-6789";         // Private
	String name = "John";                      // Default (no modifier)
	protected int age = 30;                    // Protected
	public String city = "Philadelphia";       // Public

	public void displayInfo() {
		System.out.println("SSN: " + ssn);
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("City: " + city);
	}
}
