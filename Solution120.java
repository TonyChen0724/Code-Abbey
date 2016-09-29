/** Selection Sort
  * Tony
  */

/* current: check every function's ability */

import java.util.*;

public class Solution120 {
  
  /** swap
    * param: array, indexA, indexB
    * operation: swap item on indexA with item on indexB
    * return: none
    */
  
  private static void swap(Integer[] n, int a, int b) {
    int container = n[a];
    n[a] = n[b];
    n[b] = container;
  } // checked
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    int arraySize = sc.nextInt();
    
    Integer[] inputArray = new Integer[arraySize];
    /* use a loop to input data inside inputArray */
    for (int i = 0; i < arraySize; i++) {
      inputArray[i] = sc.nextInt();
    } // after this the inputArray should contain all numbers
    
    for (int i = arraySize - 1; i > 0; i--) {
      int index = 0;
      int max = biggestInRange(inputArray, i + 1); // this function will return the biggest item in a range of array
      index = Arrays.asList(inputArray).indexOf(max); // store the old index in order to print it
      
      if (max != inputArray[i]) {
        
        swap(inputArray, Arrays.asList(inputArray).indexOf(max), i); // swap the items of the max and the latest num
      }
      System.out.print(index + " ");
    }
    
    System.out.println();
//    for (Integer num : inputArray) {
//      System.out.print(num + " ");
//    } // debug
  }
  
  /** biggestInRange
    * param: array, range until x
    * return the biggest item in a range of array
    */
  private static int biggestInRange(Integer[] n, int x) {
    int max = n[0]; // set up the max to store max number
    for (int i = 0; i < x; i++) {
      if (n[i] > max) {
        max = n[i];
      }
    }
    return max;
  } // checked
}
    
    
    
    
    
    