/** Bicycle Race
  * Tony
  */
import java.util.Scanner;

public class Solution68 {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int times = sc.nextInt();
    for (int i = 0; i < times; i++) {
      double s = sc.nextDouble();
      double a = sc.nextDouble();
      double b = sc.nextDouble();
      double ratio = a / (a + b);
      System.out.print(s*ratio + " ");
    }
  }
}
      