/** test recurrence
  * for Solution128
  * n!
  * Tony
  */

import java.util.*;
import java.math.*;

public class nTest {
  public static BigInteger addsall(BigInteger n) {
    if (n.compareTo(new BigInteger("1")) == 0) {
      return new BigInteger("1");
    }
    else {
      return n.multiply(addsall(n.subtract(new BigInteger("1"))));
    }
  }
  
  public static void main(String[] args) {
    System.out.print(addsall(new BigInteger("9")));
  }
}