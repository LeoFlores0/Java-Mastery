package week3.day16;

public class LearnConstructors {
	
	public void fullThrottle() {
		System.out.println("Car is going max speed!");
	}

	public void speed(int maxSpeed) {
		 System.out.println("Max speed is: " + maxSpeed);
	}

	public static void main(String[] args) {
		LearnConstructors myCar = new LearnConstructors();
		myCar.fullThrottle();
		myCar.speed(100);
	}
}
