/** Greatest Common Divisor
  * Tony
  */
import java.util.Scanner;

public class Solution26 {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int times = sc.nextInt();
    for (int i = 0; i < times; i++) {
      int first = sc.nextInt();
      int second = sc.nextInt();
      //copy
      int a = first;
      int b = second;
      
      while (first != second) {
        if (first > second) {
          first = first - second;
        }
        else {
          second = second - first;
        }
      }
      int lcm = a * b / first;
      System.out.print("(" + first + " " + lcm + ") ");
      
    }
  }
}
        