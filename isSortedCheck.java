/** isSorted method check
  * for QuickSort of my own
  */
public class isSortedCheck {
    /** isSorted method
    * determine an array is sorted or not
    * return true if it's sorted
    */
  private static boolean isSorted(int[] array) {
    boolean condition = true;
    for (int i = 0; i < array.length - 1; i++) {
      if (array[i] > array[i+1]) {
        condition = condition && false;
      }
    }
    return condition;
  }
  
  public static void main(String[] args) {
    
    int[] a = {5, 9, 19, 23, 38, 42, 71, 85, 112, 113};
    System.out.print(isSorted(a));
  }
}
    
    
    
    
    