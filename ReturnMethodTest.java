/** method Test
  * if a method has a return type
  * Can we run it without variable to contain the return value?
  */

public class ReturnMethodTest {
  
  private static int sum (int a, int b) {
    System.out.println("hello");
    return a + b;
  }
  
  public static void main(String[] args) {
    sum(1,2);
  }
}
/* yes we can!