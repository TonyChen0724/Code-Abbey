/** Parity Control
  * Tony
  */

import java.util.*;

public class Solution33 {
  
  
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String in = sc.nextLine();
    
    /* Generate an array of integers from input string */
    String[] ins = in.split(" ");
    int[] nums = new int[ins.length]; // new empty integer arrays for store processed info
    
    for (int i = 0; i < ins.length; i++) {
      nums[i] = Integer.parseInt(ins[i]); // transformation, after that nums will store all processed info
    }
    
    /* check point: nums */
//    for (int i : nums) {
//      System.out.print(i + " ");
//    }
    
    /* loop through the whole nums and print the decoded message out at the same time by concation */
    String output = ""; // output string
    for (int i = 0; i < nums.length; i++) {
      String binaryStr = Integer.toBinaryString(nums[i]);
//      System.out.println(binaryStr); //debug
      /* loop through the binaryStr with each character if there is '1' we increment count by 1 */
      int count = 0;
      for (int d = 0; d < binaryStr.length(); d ++) {
        if (binaryStr.charAt(d) == '1') {
          count ++;
        }
      }
      
      /** a if statement for count : if count is odd number we don't do anything even number we
        * adds it to big string (which we haven't defined)
        */
      if (count % 2 == 0) {
        if (binaryStr.length() <= 7) {
        output += (char)nums[i];
        }
        else {
          /* try to change the first item in the binaryStr from 1 into 0 or remove that 1 */
          String processed = binaryStr.substring(1, 8);
          int ascii = Integer.parseInt(processed, 2);
          output += (char)ascii;
        }
      }
    }
    System.out.print(output);
  }
}
