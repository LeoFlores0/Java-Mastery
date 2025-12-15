package week3.day19;

public class Main {
	 public static void main(String[] args) {
	        Student s1 = new Student("Alice", 18, 3.6);
	        Student s2 = new Student("Bob", 19, 3.9);
	        Student s3 = new Student("Cara", 20, 3.8);
	       s1.getName();
	       s2.getName();
	       s3.getName();
	        // 🔹 Access static method from class (not from object)
	        System.out.println("Total students: " + Student.getStudentCount());  // Should print 3
	    }
}
