/** Combinations Counting
  * Tony
  */

// current: use bigInteger to store the n so that could work with huge numbers like 98!
import java.util.*;
import java.math.*;

public class Solution128 {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int times = sc.nextInt();
    for (int i = 0; i < times; i++){
      String nstr = sc.next();
      String kstr = sc.next();
      
      BigInteger n = new BigInteger(nstr);
      BigInteger k = new BigInteger(kstr);
      
      if (k.compareTo(new BigInteger("0")) == 0) {
        System.out.print(1 + " ");
      }
      else {
        // .............(addsall(n) / (addsall(k) * addsall(n-k))
        System.out.print(addsall(n).divide((addsall(k).multiply(addsall(n.subtract(k))))) + " ");
      }
    }
  }
  
  // addsall:
  public static BigInteger addsall(BigInteger n) {
    if (n.compareTo(new BigInteger("1")) == 0) {
      return new BigInteger("1");
    }
    else {
      return n.multiply(addsall(n.subtract(new BigInteger("1"))));
    }
  }
  
}