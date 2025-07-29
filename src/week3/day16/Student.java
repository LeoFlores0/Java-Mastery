package week3.day16;

public class Student {
	String name;
	int gradeLevel;
	
	// Constructor
	
	public Student(String name, int gradeLevel){
		this.name = name;
		this.gradeLevel = gradeLevel;
	}
	
	// Method to print student info
	
	public void printStudentInfo() {
		System.out.println("Name: " + name + ", Grade Level: " + gradeLevel);
	}
	
	// Method to get grade group
	
	public String getGradeGroup() {
		if (gradeLevel >= 1 && gradeLevel <= 5) {
			return "Elementary";
		} else if (gradeLevel >= 6 && gradeLevel <= 8) {
			return "Middle School";
		} else if (gradeLevel >= 9 && gradeLevel <= 12) {
			return "High School";
		} else {
			return "Unknown";
		}
	}
	
	
	// Main method
	
	public static void main(String[] args) {
		Student s1 = new Student("Toby", 6);
		Student s2 = new Student("Shoby", 5);
		s1.printStudentInfo();
		System.out.println("Group: " + s1.getGradeGroup());
		s2.printStudentInfo();
		System.out.println("Group: " + s2.getGradeGroup());	
	}
	
}
