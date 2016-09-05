/** Modular Calculator
  * Tony
  */

import java.util.Scanner;
import java.math.BigInteger;

public class Solution14 {
  public static void main(String[] args) throws Exception {
    
    
    Scanner sc = new Scanner(System.in);
    long init = sc.nextLong();
    BigInteger numbers = BigInteger.valueOf(init);
    String voider = sc.nextLine();
    String deliver;
    String lastDivisor;
    do {
      String comb = sc.nextLine();
      String[] combo = comb.split(" ");
      deliver = combo[0];
      BigInteger value = BigInteger.valueOf(Long.parseLong(combo[1]));
      if (deliver.equals("+")) {
        numbers = numbers.add(value);
      }
      else if (deliver.equals("*")) {
        numbers = numbers.multiply(value);
      }
      else if (deliver.equals("%")) {
        numbers = numbers.remainder(value);
      }
    }
    while (!deliver.equals("%"));
    System.out.print(numbers);
  }
}
      