/** Sum of digits
  * Tony
  */
import java.util.Scanner;

public class Solution11 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int times = sc.nextInt();
    for (int i = 0; i < times; i++) {
      int a = sc.nextInt();
      int b = sc.nextInt();
      int c = sc.nextInt();
      int d = a * b + c;
      String converted = Integer.toString(d);
      int sum = 0;
      for (int s = 0; s < converted.length(); s++) {
        sum += (Character.getNumericValue(converted.charAt(s)));
      }
      System.out.print(sum + " ");
    }
  }
}
      
      