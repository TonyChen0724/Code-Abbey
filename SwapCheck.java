/** Solution120 checkfile
  * Swap function check
  * Tony
  */

public class SwapCheck {
  
  private static void swap(Integer[] n, int a, int b) {
    int container = n[a];
    n[a] = n[b];
    n[b] = container;
  }
  
  public static void main(String[] args) {
    
    Integer[] testArray = {1, 2, 3, 4, 5};
    swap(testArray, 0, 1);
    
    for (Integer num : testArray) {
      System.out.print(num + " ");
    }
  }
}