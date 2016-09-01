/** Sum of digits
  * Tony
  */
import java.util.Scanner;

public class Solution13 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int times = sc.nextInt();
    for (int i = 0; i < times; i++) {
      int d = sc.nextInt();
      String converted = Integer.toString(d);
      int sum = 0;
      for (int s = 0; s < converted.length(); s++) {
        sum += (Character.getNumericValue(converted.charAt(s))) * (s + 1);
      }
      System.out.print(sum + " ");
    }
  }
}
      
      