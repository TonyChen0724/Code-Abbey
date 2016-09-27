/** Blackjack Counting
  * Tony
  */
import java.util.*;

public class Solution42 {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int times = sc.nextInt();
    String voider = sc.nextLine(); // to avoid input mistake
    for (int i = 0; i < times; i++) {
      String in = sc.nextLine(); // raw data
      String[] ins = in.split(" "); // processed raw data
      
      /* we need to process ins to make it only left numbers and A(which is a wild card):
       iretate each items in ins and if items is 2, 3, 4, 5, 6, 8..., T, J, Q, K
       we transfer it to number and if it's A we give it number 1. (just for notation because 1 is not exist
       in the number Array so we can search for 1 and do condition distinction. */
      Integer [] nums = new Integer[ins.length];
      for (int c = 0; c < ins.length; c ++) {
        if (!ins[c].equals("A")) {
          if (!(ins[c].equals("T") || ins[c].equals("J") || ins[c].equals("Q") || ins[c].equals("K"))) {
            nums[c] = Integer.parseInt(ins[c]);
          }
          else if (ins[c].equals("T") || ins[c].equals("J") || ins[c].equals("Q") || ins[c].equals("K")) {
            nums[c] = 10;
          }
        }
        else {
          nums[c] = 1;
        }
      }
      
// after process: view
//      for (int c = 0; c < ins.length; c++) {
//        System.out.print(nums[c] + " ");
//      }
//      System.out.println();
      
      int aces = containOne(nums); // return how much 1(A) it contains in this Array;
      if (aces == 0) {
        int sum = addsup(nums); // return the adds up value of nums array;
        if (sum > 21) {
          System.out.print("Bust ");
        }
        else {
          System.out.print(sum + " ");
        }
      }
      
//      if (aces == 1) {
//        int sum = addsup(nums) - 1;
//        if (sum > 20) {
//          System.out.print("Bust ");
//        }
//        else if (sum < 10) {
//          System.out.print(sum + 11 + " ");
//        }
//        
//        else {
//          System.out.print(21 + " ");
//        }
//      }
//      
//      if (aces >= 2) {
//        int sum = addsup(nums) - aces;
//        if (sum > (21 - aces)) {
//          System.out.print("Bust ");
//        }
//        else {
//          System.out.print(21 + " ");
//        }
//      }
      
      if (aces > 0) {
        int sum = addsup(nums);
        int count = aces;
        if (sum > 21) {
          System.out.print("Bust ");
        }
        else {
          while (sum + 10 <= 21) {
            sum += 10;
            count --;
            if (count == 0) {
              break;
            }
          }
          System.out.print(sum + " ");
        }
      }
    }
    
    
  }
  
  // two method left in play:
  
  /** containOne
    * param: array
    * return: how many 1s it contains?
    */
  
  private static int containOne(Integer[] n) {
    int count = 0;
    for (int i = 0; i < n.length; i ++) {
      if (n[i] == 1) {
        count ++;
      }
    }
    return count;
  }
  
  /** addsup
    * param: array
    * return: the sum of numbers in that array
    */
  private static int addsup(Integer[] n) {
    int sum = 0;
    for (int i = 0; i < n.length; i ++) {
      sum += n[i];
    }
    return sum;
  }
  
}

