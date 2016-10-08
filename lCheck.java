/** Check function l
  * for Solution37
  * Tony
  */

public class lCheck {
  
  private static double payments = 800000;
  private static double interests = 0.06 / 12;
  
  public static double l (double mortgage) {
    
    double round = 0; // reset round
    while (payments > 0) {
      payments = payments * (1 + interests) - mortgage;
      round ++;
    }
    return round;
  }
  
  public static void main(String[] args) {
    double mortgage = payments / 103;
    System.out.print(l(mortgage));
  }
}