/** dice rolling
  * Tony
  */

import java.util.Scanner;

public class Solution43 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int times = sc.nextInt();
    for (int i = 0; i < times; i++) {
      System.out.print((int)(sc.nextDouble() * 6 + 1) + " ");
    }
  }
}