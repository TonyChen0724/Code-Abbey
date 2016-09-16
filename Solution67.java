/** Fibonacci Sequence
  * Tony
  */
import java.util.Scanner;
import java.math.*;
public class Solution67 {
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
    Scanner sc = new Scanner(System.in);
    int times = sc.nextInt();
    for (int i = 0; i < times; i++) {
      String fNumstr = sc.next();
      BigInteger fNum = new BigInteger(fNumstr);
      int n = 1;
      while (!fNum.equals(getFN(n))) {
        n ++;
      }
      System.out.print(n-1 + " ");
      
      
    }
  }
}


