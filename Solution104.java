/** Triangle Area
  * Tony
  */
import java.util.*;

public class Solution104 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int times = sc.nextInt();
    String voider = sc.nextLine();
    for (int i = 0; i < times; i++) {
      String in = sc.nextLine();
      String[] coo = in.split(" ");
      Integer[] coordinates = new Integer[coo.length];
      for (int n = 0; n < coo.length; n++) {
        coordinates[n] = Integer.parseInt(coo[n]);
      } //^ coordinates of 3 points
      // reassigning:
      int x1 = coordinates[0];
      int y1 = coordinates[1];
      int x2 = coordinates[2];
      int y2 = coordinates[3];
      int x3 = coordinates[4];
      int y3 = coordinates[5];
      // 3 length:
      double a = Math.sqrt((x1-x2)*(x1-x2) + (y1-y2)*(y1-y2));
      double b = Math.sqrt((x1-x3)*(x1-x3) + (y1-y3)*(y1-y3));
      double c = Math.sqrt((x3-x2)*(x3-x2) + (y3-y2)*(y3-y2));
      
      double p = (a + b + c) / 2;
      double area = Math.sqrt(p*(p-a)*(p-b)*(p-c));
      System.out.print(area + " ");
    }
  }
}
      
     
      
      
      
      
      
      
      
      