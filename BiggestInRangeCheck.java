/** biggestInRange check
  * for Solution120
  * Tony
  */

public class BiggestInRangeCheck {
  
  private static int biggestInRange(Integer[] n, int x) {
    int max = n[0]; // set up the max to store max number
    for (int i = 0; i < x; i++) {
      if (n[i] > max) {
        max = n[i];
      }
    }
    return max;
  }
  
  public static void main(String[] args) {
    Integer[] test = {1, 6, 4, 8, 9};
    System.out.print(biggestInRange(test, 4));
  }
}