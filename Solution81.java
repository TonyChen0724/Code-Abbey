/** Bit Count
  * Tony
  */

import java.util.Scanner;

public class Solution81 {
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    int times = sc.nextInt();
    for (int i = 0; i < times; i ++) {
      int integer = sc.nextInt();
      String binary = Integer.toBinaryString(integer);
      int sum = 0;
      for (int d = 0; d < binary.length(); d++) {
        sum += Character.getNumericValue(binary.charAt(d));
      }
      System.out.print(sum + " ");
    }
  }
}