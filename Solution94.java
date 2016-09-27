/** Fool's Day 2014
  * Tony
  */
import java.util.*;

public class Solution94 {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    int times = sc.nextInt();
    String voider = sc.nextLine();
    
    for (int i = 0; i < times; i++) {
      String in = sc.nextLine();
      String[] numsStr = in.split(" ");
      int total = 0;
      for (int d = 0; d < numsStr.length; d++) {
        total += Integer.parseInt(numsStr[d]) * Integer.parseInt(numsStr[d]);
      }
      System.out.print(total + " ");
    }
  }
}