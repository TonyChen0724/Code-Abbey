/** Quadratic Equation
  * Tony
  */
import java.util.*;

public class Solution38 {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    int times = sc.nextInt();
    for (int i = 0; i < times - 1; i++) {
      /* input a, b, c */
      int a = sc.nextInt();
      int b = sc.nextInt();
      int c = sc.nextInt();
      /* get the b^2-4ac in order to use the condition */
      int belta = b * b - 4 * a * c;
      
      if (belta >= 0) {
        System.out.print((int)((b * (-1) + Math.sqrt(belta)) / (2 * a)) + " " 
                           + (int)((b * (-1) - Math.sqrt(belta)) / (2 * a)) + "; ");
      }
      else {
//        System.out.print("i involved "); // for now
        belta = belta * (-1);
        int sqrtbelta = (int)Math.sqrt(belta);
        System.out.print(b*(-1)/(2*a) + "+" + sqrtbelta/(2*a) + "i " + 
                         b*(-1)/(2*a) + "-" + sqrtbelta/(2*a) + "i; ");
      }
    }
    
    /* input a, b, c */
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    /* get the b^2-4ac in order to use the condition */
    int belta = b * b - 4 * a * c;
    
    if (belta >= 0) {
      System.out.print((int)((b * (-1) + Math.sqrt(belta)) / (2 * a)) + " " 
                         + (int)((b * (-1) - Math.sqrt(belta)) / (2 * a)) + " ");
    }
    else {
//        System.out.print("i involved "); // for now
      belta = belta * (-1);
      int sqrtbelta = (int)Math.sqrt(belta);
      System.out.print(b*(-1)/(2*a) + "+" + sqrtbelta/(2*a) + "i " + 
                       b*(-1)/(2*a) + "-" + sqrtbelta/(2*a) + "i ");
    }
  }
}