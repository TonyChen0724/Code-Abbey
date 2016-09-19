/** adds all the numbers in an array, 2 numbers each, 
  * if there is combination sum is 10 then return true, else return false
  * Tony
  */
public class TestSum10 {
  
  public static boolean addsUpten (int [] array) {
    boolean conditionSum = false;
    boolean conditionSingle = false;
    for (int i = 0; i < array.length; i++) {
      int d = 0;
      while (i + d < array.length) {
        if (array[i] + array[i+d] == 10) {
          conditionSingle = true;
        }
        conditionSum = (conditionSum || conditionSingle);
        d ++;
      }
    }
    return conditionSum;
  }
  public static void main(String[] args) {
    int[] testArray = {9, 8, 8, 6, 8, 9};
    System.out.print(addsUpten(testArray));
  }
}