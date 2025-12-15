package week4.day28;

public class Zoo {
	public static void main(String[] args) {
		Animal animal = new Animal();

		// Try accessing all fields from a different class in the same package
		System.out.println(animal.publicName);
		System.out.println(animal.protectedName);
		System.out.println(animal.defaultName);
		// System.out.println(animal.privateName); // ❌ Uncomment this to see the error
	}
}
