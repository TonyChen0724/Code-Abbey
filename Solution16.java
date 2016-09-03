/** Average of an array
  * Tony
  */

import java.util.Scanner;

public class Solution16 {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int times = sc.nextInt();
    String voider = sc.nextLine();
    int average;
    for (int i = 0; i < times; i++) {
      String in = sc.nextLine();
      String[] nums = in.split(" ");
      int sum = 0;
      for (String n : nums) {
        sum += Integer.parseInt(n);
      }
      average = Math.round(sum / (float)(nums.length - 1));
      System.out.print(average + " ");
    }
  }
}
      
    