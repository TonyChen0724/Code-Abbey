/** Josephus Problem
  * Tony
  */

import java.util.*;


public class Solution32 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int numQuant = sc.nextInt();
    int jumpNum = sc.nextInt();
    List<Integer> numShow = new ArrayList<Integer>();
    for (int i = 1; i< numQuant + 1; i++) {
      numShow.add(i);
    }
    
    // ListIterator<Integer> itr = numShow.listIterator();
    int count = 0;
    int i = 0;
    while (numShow.size() != 1) {
        
        if (i >= numShow.size()) {
          i -= numShow.size();
        }
        count ++;
        
        if(count == jumpNum) {
          numShow.remove(i);
          i --;
          count = 0;
        }
        i ++;
    }
    System.out.print(numShow.get(0));
  }
}


