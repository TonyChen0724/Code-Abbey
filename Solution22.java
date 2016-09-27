/** Two Printers
  * Tony
  */

import java.util.*;
public class Solution22 {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int times = sc.nextInt();
    for (int i = 0; i < times; i++) {
      int x = sc.nextInt();
      int y = sc.nextInt();
      int n = sc.nextInt();
      
      double vx = 1.0/x;
      // System.out.println(vx);
      double vy = 1.0/y;
      // System.out.println(vy);
      double t = n / (vx + vy);
      // System.out.println(t);
      
      if (y > x) {
        double a = Math.round(t / x);
        System.out.print((int)a * x + " ");
      }
      else {
        double b = Math.round(t / y);
        System.out.print((int)b * y + " ");
      }
    }
  }
}
