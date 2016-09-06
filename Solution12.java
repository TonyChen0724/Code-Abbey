/** Modulo and time difference
  * Tony
  */

import java.util.Scanner;

public class Solution12 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int times = sc.nextInt();
    int[] info = new int[8];
    for (int i = 0; i < times; i++) {
      for (int s = 0; s < 8; s++) {
        info[s] = sc.nextInt();
      }
      int period1 = info[3] + info[2] * 60 + info[1] * 3600 + info[0] * 3600 * 24;
      int period2 = info[7] + info[6] * 60 + info[5] * 3600 + info[4] * 3600 * 24;
      int diff = period2 - period1;
      int diffsec = diff % 60;
      int diffday = diff / (3600 * 24);
      int diffmin = (diff - diffsec - diffday * 3600 * 24) / 60 % 60; 
      int diffhour = (diff - diffsec - diffday * 3600 * 24) / 60 / 60;
      System.out.format("(%d %d %d %d) ", diffday, diffhour, diffmin, diffsec);
    }
  }
}