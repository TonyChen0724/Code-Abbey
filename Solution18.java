/** Square Root
  * Tony
  */
import java.util.Scanner;

public class Solution18 {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    int times = sc.nextInt();
    for (int i = 0; i < times; i++) {
      int x = sc.nextInt();
      int iterateT = sc.nextInt();
      double r = 1.0;
      for (int d = 0; d < iterateT; d++) {
        r = (r + x/r) / 2;
      }
      System.out.print(r + " ");
    }
  }
}