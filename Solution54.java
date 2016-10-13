/** Pythagorean Triples
  * test case for small numbers
  * Tony
  */
import java.util.*;

public class Solution54 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    
    int times = sc.nextInt();
    
    for (int i = 0; i < times; i++) {
      /* prompt the sum and get the equation:
       * Math.pow(sum, 2) - 24 * (a + b) + 2a*b = 0;
       * we consider b >= a;
       */
      double sum = sc.nextDouble();
      double ablimits = Math.floor(sum / 3 * 2); // a + b <= ablimits
      double alimits = Math.floor(ablimits / 2); // a <= alimits
      //System.out.println("another round");
      //System.out.print(alimits + " " + blimits);
      A: for (double a = 1; a <= alimits; a++) {
        B: for (double b = a; b <= sum - a; b++) {
          double result = Math.pow((sum-a-b),2)-a*a-b*b;
          //System.out.print("when a is " + a + " " + "when b is " + b + ":" + result + ";");
          if (Math.pow(sum, 2) - 2 * sum * (a + b) + 2 * a * b == 0) {
            double answer = a*a + b*b;
            int output = (int)answer;
            System.out.print(output + " ");
            break A;
          }
        }
      }
      
    }
  }
}
      
      
      
      
      
      
      
      
      
      
      
      