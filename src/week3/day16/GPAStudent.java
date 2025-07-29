package week3.day16;

public class GPAStudent {
	String name;
	double[] grades;
	
	public GPAStudent(String name, double[] grades) {
		this.name = name;
		this.grades = grades;
	}
	
	// Method to calculate average grades
	
	public double calculateGPA() {
		double sum = 0;
		for (int i = 0; i < grades.length; i++) {
			sum += grades[i];
		}
		return sum / grades.length;
	}

	// Method to print student name and GPA

	public void printStudentGPA() {
		double gpa = calculateGPA();
		System.out.println("Name: " + name + ", GPA: " + gpa);
	}
	
	// Main method
	
	public static void main(String[] args) {
		double[] grades = {3.6, 3.8, 3.2, 3.4};
		GPAStudent student = new GPAStudent("Alex", grades);
		student.printStudentGPA();	
	}
}
