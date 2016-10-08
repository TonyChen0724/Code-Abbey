/** examine check method
  * for Solution46
  * Tony
  */

import java.util.*;

public class ExaCheck {
  
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
  
  
  public static void main(String[] args) {
    
    List<Integer> ls = new ArrayList<Integer>();
    ls.add(5);
    ls.add(1);
    ls.add(3);
    ls.add(7);
    ls.add(6);
    ls.add(4);
    ls.add(2);
    System.out.print(check(ls));
  }
}