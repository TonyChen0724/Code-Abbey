/** test of largeN method
  * for Solution121
  * Tony
  */
import java.util.*;
public class LargeNTest {
  
  public static int largeN(List<Integer> ls, int i) {
    
    int count = 0; // count the number bigger than i
    for (Integer n : ls) {
      if (n > i) {
        count ++;
      }
    }
    return count;
  }
  
  public static void main(String[] args) {
    List<Integer> ls = new ArrayList<Integer>();
    ls.add(1);
    
    ls.add(3);
    System.out.println(largeN(ls, 2));
  }
}
    