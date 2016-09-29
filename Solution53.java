/** King and Queen
  * Tony
  */

import java.util.*;

public class Solution53 {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    int times = sc.nextInt();
    for (int i = 0; i < times; i++) {
      /*input kingLocation and queenLocation*/
      String kingLocation = sc.next();
      String queenLocation = sc.next();
      
      /* vertically and horizontally */
      if (kingLocation.charAt(0) == queenLocation.charAt(0)) {
        System.out.print("Y ");
      }
      
      else if (kingLocation.charAt(1) == queenLocation.charAt(1)) {
        System.out.print("Y ");
      }
      
      /* diagonals */
      else if (Math.abs((int)kingLocation.charAt(0) - (int)queenLocation.charAt(0)) 
                 == Math.abs((int)kingLocation.charAt(1) - (int)queenLocation.charAt(1))) {
        System.out.print("Y ");
      }
      
      else {
        System.out.print("N ");
      }
    }
  }
}