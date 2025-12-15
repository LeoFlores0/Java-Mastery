package week3.day20;

public class Greeting {

	// Prints "Hello!"
	
	public void sayHello() {
		System.out.println("Hello!");
	}
	
	// Prints "Hello, [name]!"
	
	public void sayHello(String name) {
		System.out.println("Hello, " + name + "!");
	}
	
	public void sayHello(String name, int age) {
		System.out.println("Hello, " + name + "! You are " + age + " years old.");
	}
	
}