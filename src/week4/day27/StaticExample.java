package week4.day27;

public class StaticExample {
	 static int staticCounter = 0;
	    int instanceCounter = 0;

	    public void increment() {
	        staticCounter++;
	        instanceCounter++;
	        System.out.println("Static: " + staticCounter + ", Instance: " + instanceCounter);
	    }
}
