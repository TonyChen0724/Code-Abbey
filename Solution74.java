/** Clock Hands
  * Tony
  */
import java.util.*;

public class Solution74 {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int times = sc.nextInt();
    for (int i = 0; i < times; i++) {
      String rawIn = sc.next(); // gather info as string like 9:30
      String[] hourMin = rawIn.split(":");
      
      /* extract hour and min */
      double hour = Double.parseDouble(hourMin[0]);
      double min = Double.parseDouble(hourMin[1]);
      
      /* we get theta(degree) use the formula */
      double thetaMin = 90 - 6 * min;
      double thetaHour = 90 - (30*hour+min/2);
      
      /* apply theta to get xy coordinates of both min and hour hands */
      
      final int MIN_LENGTH = 9;
      final int HOUR_LENGTH = 6;
      final int INITIAL_X = 10;
      final int INITIAL_Y = 10;
      
      double xMin = MIN_LENGTH * Math.cos(Math.toRadians(thetaMin)) + INITIAL_X;
      double yMin = MIN_LENGTH * Math.sin(Math.toRadians(thetaMin)) + INITIAL_Y;
      
      double xHour = HOUR_LENGTH * Math.cos(Math.toRadians(thetaHour)) + INITIAL_X;
      double yHour = HOUR_LENGTH * Math.sin(Math.toRadians(thetaHour)) + INITIAL_Y;
      
      System.out.print(xHour + " " + yHour + " " + xMin + " " + yMin + " ");
    }
  }
}
      