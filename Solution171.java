/** Tree Height Measurement
  * Tony
  */
import java.util.*;

public class Solution171 {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int times = sc.nextInt();
    for (int i = 0; i < times; i++) {
      double distance = sc.nextDouble();
      double beta = sc.nextDouble();
      double alpha = beta - 90;
      
      double height = Math.round(distance * Math.tan(Math.toRadians(alpha)));
      System.out.print((int)height + " ");
    }
  }
}
    