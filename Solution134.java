/** Flying Text Screensaver
  * Tony
  */
import java.util.*;

public class Solution134 {
  
  /* define moveX and moveY, initiate them as 1 */
  private static int moveX = 1;
  private static int moveY = 1;
  
  /* define the boundaries */
  private static int Xboundary;
  private static int Yboundary;
  
  /* initialize coordinates x and y as 0, 0 */
  private static int x = 0;
  private static int y = 0;
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    /* input width, height and string length */
    int width = sc.nextInt();
    int height = sc.nextInt();
    int length = sc.nextInt();
    
    /* set boundary using input data */
    Xboundary = width - length; // inclusive
    Yboundary = height; // exclusive
    
    System.out.print(x + " " + y + " ");
    
    /* let it develop 100 steps */
    for (int i = 0; i < 100; i++) {
      x += moveX;
      if (x == Xboundary || x == 0) {
        moveX = moveX * (-1);
      }
      y += moveY;
      if (y == Yboundary - 1 || y == 0) {
        moveY = moveY * (-1);
      }
      System.out.print(x + " " + y + " ");
    }
  }
}
    
    
    
    
    
    
    
    