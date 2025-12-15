package week4.day23;

public class Main {
	 public static void main(String[] args) {
	        Student.printSchoolName(); // Static method — no object needed

	        Student s1 = new Student("Alice", 17);
	        Student s2 = new Student("Bob", 16);

	        s1.displayInfo();
	        s2.displayInfo();

	        // Change static field — affects both objects
	        Student.schoolName = "Hillside Academy";

	        s1.displayInfo();
	        s2.displayInfo();
	    }
}
