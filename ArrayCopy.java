/** ArrayCopyTest
  * Tony
  */

public class ArrayCopy {
  public static int[] arrayCopy (int[] n) {
    int[] m = new int[n.length];
    for (int i = 0; i < n.length; i++) {
      m[i] = n[i];
    }
    return m;
  }
  public static void main(String[] args) {
    int[] nums = {1, 2, 3, 4, 5};
    int[] copyNums = arrayCopy(nums);
    for (int num : copyNums) {
      System.out.print(num + " ");
    }
  }
}