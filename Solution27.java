/** Bubble Sort
  * Tony
  */
import java.util.Scanner;
import java.util.Arrays;

public class Solution27 {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int times = sc.nextInt();
    String voider = sc.nextLine();
    String in = sc.nextLine();
    int count = 0;
    int pass = 0;
    String[] numS = in.split(" ");
    int[] nums = new int[numS.length];
    for (int i = 0; i < numS.length; i++) {
      nums[i] = Integer.parseInt(numS[i]);
    }
    int[] original = new int[numS.length];
    for (int i = 0; i < numS.length; i++) {
      original[i] = Integer.parseInt(numS[i]);
    }
    Arrays.sort(nums);
    

    int passes = 0;
    while (!(Arrays.equals(original, nums))) {
      passes ++;
      for (int i = 0 ; i < (nums.length - 1); i++) {
        int swap;
        if (original[i] > original[i+1]) {
          int index = i;
          swap = original[i];
          original[i] = original[i+1];
          original[i+1] = swap;
          count ++;
         }
        else {
          pass ++;
        }
      }
    }
    passes ++;
    System.out.print(passes + " " + count);
  }
}

          