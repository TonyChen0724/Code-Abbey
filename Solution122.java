/** QuickSort
  * Tony
  */
import java.util.*;

public class Solution122 {
  
  /** swap method
    * swap items in two position in a specific array
    */
  private static void swap (int[] a, int position1, int position2) {
    int container = a[position1]; // temporary contain values during swap
    a[position1] = a[position2];
    a[position2] = container;
  }
  
  /** partition method
    * process an array and after that the array will split by the first number
    */
  private static int partition(int[] a, int left, int right) {
    System.out.print(left + "-" + right + " ");
    int lt = left;
    int rt = right;
    String dir = "left"; // specifies at which side is currently "empty" space
    int pivot = a[left];
    while (lt < rt) {
      if (dir.equals("left")) {
        if (a[rt] > pivot)
        {
          rt = rt - 1;
        }
        else{
          swap(a, lt, rt);
          lt = lt + 1;
          dir = "right";
        }
      }
      else{
        if (a[lt] < pivot) {
          lt = lt + 1;
        }
        else{
          a[rt] = a[lt];
          rt = rt - 1;
          dir = "left";
        }
      }
    }
    
    a[lt] = pivot;
    return lt;
  }
  
  
  private static void quicksort(int[] array, int left, int right) {
    
    int pivot_pos = partition(array, left, right);
    if (pivot_pos - left > 1) {
      quicksort(array, left, pivot_pos - 1);
    }
    
    if (right - pivot_pos > 1) {
      quicksort(array, pivot_pos + 1, right);
    }
    
  }
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    int times = sc.nextInt();
    int[] array = new int[times];
    for (int i = 0; i < times; i++) {
      array[i] = sc.nextInt();
    }
    quicksort(array, 0, times-1);
//    for (int n : array) {
//      System.out.print(n + " ");
//    }
  }
}
  
