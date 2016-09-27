/** Test removeThird method
  * Tony
  */
import java.util.*;

public class RemoveThirdTest {
  
  private static void removeThird(List<Long> l) {
    
    int i = 1;
    int count = 0;
    while (i < l.size()) {
      
      // System.out.print(count + ":"); //debug
      // System.out.print(l.get(i) + " ");
      if (count == 3) {
        l.remove(i);
        count = 1;
      }
      i ++;
      count ++;
    }
  }
  
  public static void main(String[] args) {
    long[] values = {2, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25, 27, 29};
    List<Long> ls = new ArrayList<Long> ();
    for (long value : values) {
      ls.add(value);
    }
    removeThird(ls);
    System.out.printf("%s", ls);
  }
}

// why after removeThird method the 3 is removed? when i = 1 , count = 0 the if statement won't initialize? .
// We can only use list.remove(int index), what if we want list.remove(long index)? ask StackOverflow.
    