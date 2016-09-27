/** Bulls and Cows
  * Tony
  */

import java.util.*;

public class Solution59 {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String model = sc.next();
    int times = sc.nextInt();
    for (int i = 0; i < times; i++) {
      String in = sc.next();
      int bull = 0;
      int cow = 0;
      
      for (int d = 0; d < in.length(); d++) {
        if (in.charAt(d) == model.charAt(d)) {
          bull ++;
        }
        
        if (model.indexOf(in.charAt(d)) != -1) {
          cow ++;
        }
        
        
      }
      // how can I get the cow(the number is contained but not in the right index)?
      cow = cow - bull;
      System.out.print(bull + "-" + cow + " ");
    }
  }
}
      
    
      