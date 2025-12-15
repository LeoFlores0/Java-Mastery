package week4.day27;

public class Main {
	public static void main(String[] args) {
        StaticExample s1 = new StaticExample();
        StaticExample s2 = new StaticExample();

        s1.increment(); // Static: 1, Instance: 1
        s2.increment(); // Static: 2, Instance: 1
        s1.increment(); // Static: 3, Instance: 2
    }
}
