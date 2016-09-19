/** Double Dice Roll
  * Tony
  */
import java.util.Scanner;
public class Solution44 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int times = sc.nextInt();
    for (int i = 0; i < times; i++) {
      int first = sc.nextInt();
      int second = sc.nextInt();
      System.out.print(first % 6 + second % 6 + 2 + " ");
    }
  }
}