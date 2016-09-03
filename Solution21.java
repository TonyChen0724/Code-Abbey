/** Array Counters
  * Tony
  */
import java.util.Scanner;

public class Solution21 {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    int sample = 1;
    int quantities = sc.nextInt();
    int limit = sc.nextInt();
    String voider = sc.nextLine();
    String in = sc.nextLine();
    String[] nums = in.split(" ");
    int[] numArray = new int[quantities];
    for (int i = 0; i < quantities; i++) {
      numArray[i] = Integer.parseInt(nums[i]);
    }
    for (int i = 0; i < limit; i++) {
      int count = 0;
      for (int j = 0; j < quantities; j++) {
        if (sample == numArray[j]) {
          count ++;
        }
      }
      sample ++;
      System.out.print(count + " ");
      
    }
  }
}