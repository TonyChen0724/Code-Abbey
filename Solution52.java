/** Pythagorean Theorem
  * Tony
  */
import java.util.Scanner;
import java.util.Arrays;


public class Solution52 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int times = sc.nextInt();
    String voider = sc.nextLine();
    for (int i = 0; i < times; i++) {
      String in = sc.nextLine();
      String[] array = in.split(" ");
      int[] numArray = new int[3];
      for (int n = 0; n < 3; n++) {
        numArray[n] = Integer.parseInt(array[n]);
      }
      Arrays.sort(numArray);
      if (numArray[0]*numArray[0] + numArray[1]*numArray[1] == numArray[2]*numArray[2]) {
        System.out.print("R ");
      }
      else if (numArray[0]*numArray[0] + numArray[1]*numArray[1] > numArray[2]*numArray[2]) {
        System.out.print("A ");
      }
      else {
        System.out.print("O ");
      }
    }
  }
}