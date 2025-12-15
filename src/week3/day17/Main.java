package week3.day17;

public class Main {
	public static void main(String[] args) {
		Student myStudent = new Student();
		
		myStudent.setName("Jordan");
		myStudent.setAge(19);
		myStudent.setGpa(3.92);
		
		System.out.println("Name: " + myStudent.getName());
		System.out.println("Age: " + myStudent.getAge());
		System.out.println("GPA: " + myStudent.getGpa());
	}
}
