/** Median of Three
  * Tony
  */

import java.util.Scanner;

public class Solution41 {
  
  public static void sort (int[] nums) {
    int container = 0;
    
    if (nums[1] > nums[2]) {
      container = nums[1];
      nums[1] = nums[2];
      nums[2] = container;
    }
    
    if (nums[0] > nums[1]) {
      container = nums[0];
      nums[0] = nums[1];
      nums[1] = container;
    }
    
    if (nums[1] > nums[2]) {
      container = nums[1];
      nums[1] = nums[2];
      nums[2] = container;
    }
   
  }
    
  
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int times = sc.nextInt();
    for (int i = 0; i < times; i++) {
      int[] numlist = new int[3];
      numlist[0] = sc.nextInt();
      numlist[1] = sc.nextInt();
      numlist[2] = sc.nextInt();
      sort(numlist);
      System.out.print(numlist[1] + " ");
    }
  }
}
      
  