/** Array Checksum
  * Tony
  */
import java.util.Scanner;

public class Solution17 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int times = sc.nextInt();
    int[] nums = new int[times];
    long result = 0;
    int limits = 10000007;
    for (int i = 0; i < times; i++) {
      nums[i] = sc.nextInt();
      result = (result + nums[i]) * 113;
      result %= limits;
    }
    System.out.print(result);
  }
}