/** Tic-Tac-Toe
  * Tony
  */

// current: do some experiments about contain and finish the containThree method

import java.util.*;

public class Solution46 {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    int times = sc.nextInt();
    List<Integer> op1 = new ArrayList<Integer>();
    List<Integer> op2 = new ArrayList<Integer>();
    
    
    for (int i = 0; i < times; i++) {
      /* input 9 moves seperately */
      int count = 0; // count the rounds to generate a win
      boolean win = false;
      op1.clear();
      op2.clear();
      
      for (int d = 0; d < 4; d++) {

        op1.add(sc.nextInt());
        /* check a list to see if there is a win */
        count ++;
        if (check(op1) == true) {
          win = true;
          break;
        }
        op2.add(sc.nextInt());
        // System.out.printf("%s", op2);
        count ++;
        if (check(op2) == true) {
          win = true;
          break;
        }
      }
      
      
      /* if there is no win yet */
      if (win == false) {
        op1.add(sc.nextInt());
        if (check(op1) == true) {
          count ++;
        }
        else {
          count = 0;
        }
      }
      
      
      for (int m = 0; m < 9 - count; m++) {
        if (count == 0) {
          break;
        }
        int voider = sc.nextInt();
      } // avoid distraction of rest numbers of a win series
      
      System.out.print (count + " ");
    }
  }
  
  
  /** check method
    * param: arraylist
    * return boolean
    * operation: check if there is 3 numbers in arraylist is 123,456,789,147,258,369,159,357
    */
  private static boolean check(List<Integer> ls) {
    boolean condition = containThree(ls, 1, 2, 3) || containThree(ls, 4, 5, 6) || containThree(ls, 7, 8, 9) ||
      containThree(ls, 1, 4, 7) || containThree(ls, 2, 5, 8) || containThree(ls, 3, 6, 9) || 
      containThree(ls, 1, 5, 9) || containThree(ls, 3, 5, 7);
    return condition;
  }
  
  /** containThree method
    * param: ArrayList, 3 integer combinations
    * return boolean;
    */
  private static boolean containThree(List<Integer> list, int a, int b, int c) {
    int count = 0;
    if (list.contains(a)) {
      count ++;
    }
    if (list.contains(b)) {
      count ++;
    }
    if (list.contains(c)) {
      count ++;
    }
    
    if (count == 3) {
      return true;
    }
    else {
      return false;
    }
  
  }
}
      
                                  