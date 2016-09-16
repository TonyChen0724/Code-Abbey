/** Rotate String
  * Tony
  */
import java.util.Scanner;

public class Solution31 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int times = sc.nextInt();
    for (int i = 0; i < times; i++) {
      int rotateIndex = sc.nextInt();
      String in = sc.next();
      String newString = "";
      if (rotateIndex >= 0) {
        String first = in.substring(0, rotateIndex);
        String second = in.substring(rotateIndex, in.length());
        newString = second + first;
      }
      else {
        String first = in.substring(0, in.length() + rotateIndex);
        String second = in.substring(in.length() + rotateIndex, in.length());
        newString = second + first;
      }
      System.out.print(newString + " ");
    }
  }
}