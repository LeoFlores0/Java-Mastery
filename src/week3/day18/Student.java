package week3.day18;

public class Student {
	
	private String name;
	private int age;
	private double gpa;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		if (age > 0) {
			this.age = age;
		}
	}
	
	public double getGpa() {
			return gpa;
	
	}

	public void setGpa(double gpa) {
		if (gpa <= 4.0) {
			this.gpa = gpa;

		}
	}
}
