/** Hexagonal Grid
  * Tony
  */
import java.util.*;

public class Solution73 {
  public static void main(String[] args) {
    double r = 1.5 * 0.5 / Math.cos(Math.toRadians(30));
    Scanner sc = new Scanner(System.in);
    int times = sc.nextInt();
    for (int i = 0; i < times; i++) {
      /* everytime we initialize the coordinates here */
      double x = 0;
      double y = 0;
      
      /* prompt input */
      String route = sc.next();
      /* process input*/
      for (int c = 0; c < route.length(); c++) {
        if (route.charAt(c) == 'A') {
          x += 1;
        }
        else if (route.charAt(c) == 'D') {
          x -= 1;
        }
        else if (route.charAt(c) == 'B') {
          x += 0.5;
          y += r;
        }
        else if (route.charAt(c) == 'C') {
          x -= 0.5;
          y += r;
        }
        else if (route.charAt(c) == 'E') {
          x -= 0.5;
          y -= r;
        }
        else if (route.charAt(c) == 'F') {
          x += 0.5;
          y -= r;
        }
        else {
          System.out.print("wrong input");
        }
      }
      System.out.print(Math.sqrt(x*x + y*y) + " ");
    }
  }
}
        
    
    