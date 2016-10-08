/** Insertion Sort
  * Tony
  */
import java.util.*;

public class Solution121 {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    List<Integer> nums = new ArrayList<Integer> ();
    /* input the list */
    for (int i = 0; i < size; i++) {
      nums.add(sc.nextInt());
    }
    /* checked */
    
    /* create a new list which is sorted let it grow */
    List<Integer> sorted = new ArrayList<Integer> ();
    sorted.add(nums.get(0)); // initialize the sorted list, give it first value
    int indexOfnums = 1;
    
    while (sorted.size() != nums.size()) {
      int largerNums = largeN(sorted, nums.get(indexOfnums));
      int insertIndex = sorted.size() - largerNums;
      sorted.add(insertIndex, nums.get(indexOfnums));
      indexOfnums ++;
      System.out.print(largerNums + " ");
    }
  }
  
  /** largeN method
    * param: list, integer
    * return: quantity of numbers bigger than the param integer
    * checked */
  public static int largeN(List<Integer> ls, int i) {
    
    int count = 0; // count the number bigger than i
    for (Integer n : ls) {
      if (n > i) {
        count ++;
      }
    }
    return count;
  }
    
}