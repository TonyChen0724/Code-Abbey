/** my own quick sort 
  * inspired by Solution122
  * Tony
  */
// current: how to use recurrence to recuring in qSort

import java.util.*;

public class QuickSort {
  public static void main(String[] args) {
    /* prompt an array */
    Scanner sc = new Scanner(System.in);
    int times = sc.nextInt();
    int[] array = new int[times];
    for (int i = 0; i < times; i++) {
      array[i] = sc.nextInt();
    }
    
    qSort(array, 0, times - 1);
    for (int n : array) {
      System.out.print(n + " ");
    }
  }
  
  /* qSort method
   * parameter: array
   * operation: sort that array using quick sort method
   */
  private static void qSort(int[] array, int left, int right) {
    int pivotPosition = pivotSplit(array, left, right);
      
    if (right - pivotPosition > 1) {
      left = pivotPosition + 1;
      qSort(array, left, right);
    }
    if (pivotPosition - left > 1) {
      right = pivotPosition - 1;
      qSort(array, left, right);
    }
      
    
  }
  
  
  /** pivotSplit method
    * split an array using the pivot(the right side item of an array)
    */
  private static int pivotSplit(int[] array, int left, int right) {
    /* set an pivot as the right side item of the array */
    int pivot = array[right];
    List<Integer> rightArray = new ArrayList<Integer>(); // define rightArray
    List<Integer> leftArray = new ArrayList<Integer>(); // define leftArray
    for (int i = left; i <= right; i++) {
      if (array[i] > pivot) {
        /* if the item in an array is bigger than the pivot, we put it into the list called right array */
        rightArray.add(array[i]);
        
      }
      else if (array[i] < pivot) {
        leftArray.add(array[i]);
      }
      else {} // if array[i] == pivot, do nothing
    }
    /* claim a new list which combine them together */
    List<Integer> newList = new ArrayList<Integer> ();
    
    
    /* get rest of the array into list */
    List<Integer> restLeftList = new ArrayList<Integer> ();
    List<Integer> restRightList = new ArrayList<Integer> ();
    for (int i = 0; i < left; i++) {
      restLeftList.add(array[i]);
    }
    for (int i = right + 1; i < array.length; i++) {
      restRightList.add(array[i]);
    }
    
    newList.addAll(restLeftList);
    newList.addAll(leftArray);
    newList.add(pivot);
    newList.addAll(rightArray);
    newList.addAll(restRightList);
    
    for (int i = 0; i < newList.size(); i++) {
      array[i] = newList.get(i);
    }
    return restLeftList.size() + leftArray.size();
  }
  
}
  
    
      