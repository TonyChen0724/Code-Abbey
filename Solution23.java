/** Bubble in Array
  * Tony
  */
import java.util.Scanner;

public class Solution23 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String in = sc.nextLine();
    int count = 0;
    String[] numS = in.split(" ");
    int[] nums = new int[numS.length-1];
    for (int i = 0; i < numS.length-1; i++) {
      nums[i] = Integer.parseInt(numS[i]);
    }

    for (int i = 0 ; i < (nums.length - 1); i++) {
      int swap;
      if (nums[i] > nums[i+1]) {
          swap = nums[i];
          nums[i] = nums[i+1];
          nums[i+1] = swap;
          count ++;
        }
      }
    
    System.out.print(count + " " + CheckSum.getCheckSum(nums));
  }
}
          