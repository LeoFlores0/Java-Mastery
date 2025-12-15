package week3.day18;

public class Main {
	public static void main(String[] args) {
		Student myStudent = new Student();
		
		myStudent.setName("Jordan");
		myStudent.setAge(0);
		myStudent.setGpa(5);
		
		System.out.println("Name: " + myStudent.getName());
		System.out.println("Age: " + myStudent.getAge());
		System.out.println("GPA: " + myStudent.getGpa());
	}
}
