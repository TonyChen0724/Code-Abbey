/** Linear Congruential Generator
  * Tony
  */
import java.util.Scanner;
public class Solution25 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int times = sc.nextInt();
    for (int i = 0; i < times; i++) {
      int a = sc.nextInt();
      int c = sc.nextInt();
      int m = sc.nextInt();
      int x = sc.nextInt();
      int n = sc.nextInt();
      for (int t = 0; t < n; t++) {
        x = (x * a + c) % m;
      }
      System.out.print(x + " ");
    }
  }
}