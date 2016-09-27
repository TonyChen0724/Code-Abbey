/** Prime Number Generator
  * Tony
  */   // current: efficiency problem(run out of memory?)
// continue watching the youtube video then maybe ask StackOverflow?
import java.util.*;

public class Solution61 {
  public static void main(String[] args) {
    List<Long> l1 = new ArrayList<Long> ();
    
    // l1 generator:   3 5 7 9 11 ... 
    for (long d = 3; d < 100; d += 2) {
      l1.add(d);
    }
    
    l1.add(1, (long)2); // 2 3 5 ...
    
    removeThird(l1); // rm 3rd after 3
    
    removeFifth(l1); // rm 5th after 5, now the l1 will be prime number
    
    Scanner sc = new Scanner(System.in);
    int times = sc.nextInt();
    for (int i = 0; i < times; i++) {
      int index = sc.nextInt();
      System.out.print(l1.get(index) + " ");
      
      
    }
  }
  
  
  /** removeThird : remove every 3rd number after 3
    * param List | return void
    */
  private static void removeThird(List<Long> l) {
    
    int i = 1;
    int count = 0;
    while (true) {
      
  
      if (count == 3) {
        l.remove(i);
        count = 1;
        
      }
      i ++;
      count ++;
      if (i > l.size()) {
        break;
      }
    }
  }
  
  /** removeThird : remove every 5th number after 5
    * param List | return void
    */
  private static void removeFifth(List<Long> l) {
    
    int i = 2;
    int count = 0;
    while (true) {
      
     
      if (count == 5) {
        l.remove(i);
        count = 1;
      }
      i ++;
      count ++;
      if (i > l.size()) {
        break;
      }
    }
  }
  
}
