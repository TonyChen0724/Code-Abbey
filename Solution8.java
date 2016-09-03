/** Arithmetic Progression
  * Tony
  */

import java.util.Scanner;

public class Solution8 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int times = sc.nextInt();
    for(int i = 0; i < times; i++) {
      int a = sc.nextInt();
      int b = sc.nextInt();
      int c = sc.nextInt();
      System.out.print(a * c + (c * (c - 1) * b / 2) + " ");
    }
  }
}
    