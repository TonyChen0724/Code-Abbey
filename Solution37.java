/** Mortgage Calculator reverse edition
  * Tony
  */
import java.util.*;

public class Solution37 {
  
  private static double interests;
  private static double payments;
  private static double mortgage;
  private static double originalP;

  
  
  
  public static double l (double mortgage) {

    double round = 0; // reset round
    payments = originalP;

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
    originalP = payments;
    double loop = sc.nextDouble();
    double mortgage = Math.floor(payments / loop); // start mortgage
//    System.out.print(mortgage);
    double gx = l(mortgage) - loop;

    while (gx > 0) {
      gx = l(mortgage) - loop;
      mortgage ++;
    }
    System.out.print((int)Math.ceil(mortgage));
  }
}