/** Sort with Indexes
  * Tony
  */

import java.util.Scanner;
import java.util.Arrays;
public class Solution29 {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int times = sc.nextInt();
    Integer [] original = new Integer[times];
    Integer [] mutable = new Integer[times];
    for ( int i = 0; i < times; i++ ) {
      original[i] = sc.nextInt();
      mutable[i] = original[i];
    }
    Arrays.sort(mutable);
    for (int n : mutable) {
      System.out.print(Arrays.asList(original).indexOf(n) + 1 + " ");
    }
  }
}
      
      