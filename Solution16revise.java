/** Average of an array2
  * Tony
  */
import java.util.Scanner;

public class Solution16revise {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int times = sc.nextInt();
    int index;
    int sum;
    int nextNum;
    for (int i = 0; i < times; i++) {
      index = 0;
      sum = 0;
      while(true) {
        index ++;
        nextNum = sc.nextInt();
        if (nextNum == 0) {
          break;
        }
        sum += nextNum;
      }
      System.out.print(Math.round((float)sum / (index - 1)) + " ");
    }
  }
}
        
        
      