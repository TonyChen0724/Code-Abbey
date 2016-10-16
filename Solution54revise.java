/** Pythagorean Triples
  * Tony
  */


import java.util.*;

public class Solution54revise {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int times = sc.nextInt();
    for (int i = 0; i < times; i++) {
      double sum = sc.nextDouble();
      double ablimits = Math.floor(sum / 3 * 2); // a + b <= ablimits
      double alimits = Math.floor(ablimits / 2); // a <= alimits
      //System.out.print(alimits + " ");
      A: for (double a = 1; a <= sum; a++) {
        
        if (sum*a % (sum-a) == 0) {
          
          double b = sum / 2 * (1 - (a/(sum-a)));
          double c = sum - a - b;
          
          System.out.print((long)Math.pow(c,2) + " ");
          break A;
        }
      }
    }
  }
}
        
        
        
        
        
        