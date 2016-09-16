/** Linear Function
  * Tony
  */
import java.util.Scanner;

public class Solution10 {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int times = sc.nextInt();
    
    for (int i = 0; i < times; i++) {
      int x1 = sc.nextInt();
      int y1 = sc.nextInt();
      int x2 = sc.nextInt();
      int y2 = sc.nextInt();
      int a = (y2 - y1) / (x2 - x1);
      int b = y1 - a * x1;
      System.out.print("(" + a + " " + b + ") ");
    }
  }
}