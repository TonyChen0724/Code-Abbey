/** pivotSplit Check
  * for QuickSort
  * Tony
  */
import java.util.*;

public class pivotSplitCheck {
  private static int pivotSplit(int[] array, int left, int right) {
    /* set an pivot as the right side item of the array */
    int pivot = array[right];
    List<Integer> rightArray = new ArrayList<Integer>(); // define rightArray
    List<Integer> leftArray = new ArrayList<Integer>(); // define leftArray
    for (int i = left; i <= right; i++) {
      //System.out.println(array[i]);
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
    //System.out.printf("%s", restLeftList);
    newList.addAll(leftArray);
//    System.out.printf("%s", leftArray);
    newList.add(pivot);
    newList.addAll(rightArray);
//    System.out.printf("%s", rightArray);
    newList.addAll(restRightList);
    
    for (int i = 0; i < newList.size(); i++) {
      array[i] = newList.get(i);
    }
    return restLeftList.size() + leftArray.size();
  }
  public static void main(String[] args) {
    
    int[] a = {38, 23, 9, 19, 113, 5, 42, 85, 71, 112};
    pivotSplit(a,4,8);
    for (int n : a) {
      System.out.print(n + " ");
    }
  }
}
    
    
    
    
    
    
    
  