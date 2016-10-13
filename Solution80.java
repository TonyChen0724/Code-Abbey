/** Duel Chances
  * it's a iteration
  * check http://math.stackexchange.com/questions/1966227/strange-duel-chances-and-my-analysis
  * Tony
  */
import java.util.*;

public class Solution80 {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int times = sc.nextInt();
    for (int i = 0; i < times; i++) {
      double a = sc.nextDouble() / 100;
      double b = sc.nextDouble() / 100;
      
      double result = Math.round(a / (a + b - a*b) * 100);
      
      System.out.print((int)result + " ");
    }
  }
}
      
      
      