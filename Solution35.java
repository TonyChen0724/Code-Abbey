/** Savings Calculator
  * Tony
  */
import java.util.Scanner;
public class Solution35 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int times = sc.nextInt();
    for (int i = 0; i < times; i++) {
      double s = sc.nextDouble();
      double r = sc.nextDouble();
      double p = sc.nextDouble();
      int year = 0;
      while (s < r) {
        s = s * (1 + p/100);
        year ++;
      }
      System.out.print(year + " ");
    }
  }
}
        