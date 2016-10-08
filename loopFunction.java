/** Mortgage Calculator reverse edition
  * Tony
  */
import java.util.*;

public class Solution37 {
  
  private static double interests;
  private static double payments;
  private static double mortgage;
  private static double round = 0;
  
  
  
  public static int l (double mortgage) {

    round = 0; // reset round
    while (payments > 0) {
      payments = payments * (1 + interests) - mortgage;
      round ++;
    }
    return round;
  }
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    payments = sc.nextDouble();
    interests = sc.nextDouble() / 12 / 100;
    mortgage = sc.nextDouble();
    double gx = l(mortgage) - 105;
    System.out.print(gx);
  }
}