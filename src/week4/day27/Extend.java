package week4.day27;

public class Extend extends MathUtil {
	  // Uncomment this to test final method override — it should FAIL
//  @Override
//  public int square(int x) {
//      return x + x;
//  }

  public static void main(String[] args) {
      Extend e = new Extend();
      int x = 2;
      System.out.println(e.square(x));  // Output: 4
      System.out.println("PI = " + MathUtil.PI); // Output: 3.14159
  }
}
