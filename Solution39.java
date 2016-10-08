/** Share Price Volatility
  * Tony
  */
import java.util.*;

public class Solution39 {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int times = sc.nextInt();
    for (int i = 0; i < times; i++) {
      String name = sc.next(); // name of stock
      List<Integer> nums = new ArrayList<Integer>();
      nums.clear(); // reset nums
      for (int d = 0; d < 14; d++) {
        nums.add(sc.nextInt());
      }
      /* get average of nums */
      int sum = 0;
      for (Integer num : nums) {
        sum += num;
      }
      int average = sum / (nums.size());
 
      
      /* get the comission, variance, standard deviation */
      double comission = average * 0.01;
      double variance = 0;
      for (Integer num : nums) {
        variance += ((num - average) * (num - average));
      }
      variance /= 14;
      double stD = Math.sqrt(variance);
      if (stD >= (comission * 4)) {
        System.out.print(name + " ");
      }
    }
    
  }
}
