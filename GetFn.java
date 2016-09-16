/** test file for Solution67
  * Fibonacci generator
  * Tony
  */
import java.math.BigInteger;
public class GetFn{
//  public static int getFN (int n) {
//    if (n == 1) {
//      return 0;
//    }
//    else if (n == 2) {
//      return 1;
//    }
//    
//    else {
//      return getFN(n-1) + getFN(n-2);
//    }
//  }
  
  public static BigInteger getFN (int n) {
    BigInteger one = new BigInteger("1");
    BigInteger zero = new BigInteger("0");
    if (n == 1) {
      return zero;
    }
    else if (n == 2) {
      return one;
    }
    
    else {
      BigInteger fn = getFN(n-1).add(getFN(n-2));
      return fn;
    }
  }
  public static void main(String[] args) {
    
    System.out.println(getFN(7));
  }
}  // using recursion to solve this problem