/** Binary Search
  * Tony
  */

/** current: calculate the formula: > 0 is normal; < 0 is abnormal; */
import java.util.*;

public class Solution34 {
  
  /** binarySearch
    * param: a,b,c,d
    * return: the number after 9 round of binary search
    */
  
  public static double binarySearch(double a, double b, double c, double d) {
    // low & high to store & update range:
    double low = 0;
    double high = 100;
    double x = (low + high) / 2; // the current x in x * x function
    
    /** run 10 times to get 8 digits accuracy */
    for (int i = 0; i < 5000000; i++) {
      
      if (a*x + b*Math.sqrt(Math.pow(x, 3)) - c * Math.exp(x*(-1) / 50) - d > 0) {
        high = x;
      }
      
      else if (a*x + b*Math.sqrt(Math.pow(x, 3)) - c * Math.exp(x*(-1) / 50) - d == 0) {
        return x;
        //break;
      }
      
      else if (a*x + b*Math.sqrt(Math.pow(x, 3)) - c * Math.exp(x*(-1) / 50) - d < 0) {
        low = x;
      }
      
      x = (high + low) / 2;
      //System.out.print(x + " ");
    }
    return x;
  }
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int times = sc.nextInt();
    for (int i = 0; i < times; i++) {
      double a = sc.nextDouble();
      double b = sc.nextDouble();
      double c = sc.nextDouble();
      double d = sc.nextDouble();
      
      System.out.print(binarySearch(a, b, c, d) + " ");
    }
  }
}
      
      
      
      