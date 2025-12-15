package week3.day19;

public class Student {
	
	    private String name;
	    private int age;
	    private double gpa;

	    // 🔹 Static variable to count all students
	    private static int studentCount = 0;

	    // Constructor
	    public Student(String name, int age, double gpa) {
	        this.name = name;
	        this.age = age;
	        this.gpa = gpa;

	        // 🔹 Increase the static counter when a new student is made
	        studentCount++;
	    }

	    // 🔹 Static method to access the count
	    public static int getStudentCount() {
	        return studentCount;
	    }

	    // Getters (optional: add setters if needed)
	    public String getName() {
	        return name;
	    }

	    public int getAge() {
	        return age;
	    }

	    public double getGpa() {
	        return gpa;
	    }
}
