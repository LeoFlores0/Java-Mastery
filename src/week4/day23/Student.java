package week4.day23;

public class Student {
	 String name;
	    int age;

	    static String schoolName = "Greenwood High";  // Shared by all students

	    public Student(String name, int age) {
	        this.name = name;
	        this.age = age;
	    }

	    public void displayInfo() {
	        System.out.println(name + ", " + age + ", " + schoolName);
	    }

	    public static void printSchoolName() {
	        System.out.println("School: " + schoolName);
	    }
}
