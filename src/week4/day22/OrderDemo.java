package week4.day22;

public class OrderDemo {
	
	// Static field
    static int staticField = printStatic("Static Field initialized");

    // Instance field
    int instanceField = print("Instance Field initialized");

    // Constructor
    public OrderDemo() {
        System.out.println("Constructor called");
    }

    // Static block
    static {
        System.out.println("Static Block");
    }

    // Instance initializer block
    {
        System.out.println("Instance Initializer Block");
    }

    // Helper methods
    public static int printStatic(String message) {
        System.out.println(message);
        return 0;
    }

    public int print(String message) {
        System.out.println(message);
        return 0;
    }
}
