/** Collatz Sequence
  * Tony
  */
import java.util.Scanner;

public class Solution48 {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    int times = sc.nextInt();
    for (int i = 0; i < times; i++) {
      int number = sc.nextInt();
      int count = 0;
      while (number != 1) {
        if (number % 2 == 0) {
          number /= 2;
        }
        else {
          number = 3 * number + 1;
        }
        count ++;
      }
      System.out.print(count + " ");
    }
  }
}