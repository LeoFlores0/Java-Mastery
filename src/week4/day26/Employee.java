package week4.day26;

public class Employee {
	public void showInfo() {
		Person p = new Person();

		// System.out.println("SSN: " + p.ssn); // ❌ private: not accessible
		System.out.println("Name: " + p.name);   // ✅ default: same package
		System.out.println("Age: " + p.age);     // ✅ protected: same package
		System.out.println("City: " + p.city);   // ✅ public: always accessible
	}
}
