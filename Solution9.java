/** Triangles
  * Tony
  */
import java.util.Scanner;
import java.util.Arrays;

public class Solution9 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int times = sc.nextInt();
    int[] nums = new int[3];
    for (int i = 0; i < times; i++) {
      nums[0] = sc.nextInt();
      nums[1] = sc.nextInt();
      nums[2] = sc.nextInt();
      Arrays.sort(nums);
      if (nums[0] + nums[1] >= nums[2]) {
        System.out.print(1 + " ");
      }
      else {
        System.out.print(0 + " ");
      }
    }
  }
}